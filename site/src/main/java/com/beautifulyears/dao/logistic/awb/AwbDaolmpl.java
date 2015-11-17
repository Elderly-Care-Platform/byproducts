/**
 * 
 */
package com.beautifulyears.dao.logistic.awb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.stereotype.Repository;

import com.beautifulyears.domain.logistic.AwbOrderPlacementResponse;
import com.beautifulyears.domain.logistic.AwbResponse;

/**
 * @author Nitin
 *
 */
@Repository("blAwbDao")
public class AwbDaolmpl implements AwbDao {

	@Override
	public List<String> generate(int count, String type) {

		List<String> awbList = null;
		String url = "http://ecomm.prtouch.com/apiv2/fetch_awb/";
		String requestBody = "username=ecomexpress&password=Ke%243c%404oT5m6h%23%24&type="
				+ type + "&count=" + count;
		String inputStr = (String) postQuery(url, requestBody);

		ObjectMapper mapper = new ObjectMapper();
		System.out.println(inputStr);
		AwbResponse awbResponse = null;
		try {
			awbResponse = mapper.readValue(inputStr,
					new TypeReference<AwbResponse>() {
					});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (null != awbResponse && null != awbResponse.getAwb()) {
			awbList = awbResponse.getAwb();
		}
		return awbList;
	}

	@Override
	public boolean placeOrder(Order order, OrderItem item) {
		String awbNumber = item.getOrderItemAttributes().get("awbNumber")
				.getValue();
		String addressLine1 = order.getOrderAttributes().get("AddressLine1")
				.getValue();
		String addressLine2 = order.getOrderAttributes().get("AddressLine2")
				.getValue();
		String firstName = order.getOrderAttributes().get("firstName")
				.getValue();
		String lastName = order.getOrderAttributes().get("lastName").getValue();
		String city = order.getOrderAttributes().get("City").getValue();
		String phone = order.getOrderAttributes().get("Phone").getValue();
		String orderType = order.getOrderAttributes().get("deliveryType").getValue();

		String url = "http://ecomm.prtouch.com/apiv2/manifest_awb/";
		String requestBody = "username=ecomexpress"
				+ "&password=Ke%243c%404oT5m6h%23%24" + "&json_input=[" + "{"
				+ "\"ACTUAL_WEIGHT\":\"0\"," + "\"AWB_NUMBER\":\""
				+ awbNumber
				+ "\","
				+ "\"BREADTH\":\"0\","
				+ "\"COLLECTABLE_VALUE\":\" 3000 \","
				+ "\"CONSIGNEE\":\""
				+ firstName
				+ " "
				+ lastName
				+ "\","
				+ "\"CONSIGNEE_ADDRESS1\":\""
				+ addressLine1
				+ "\","
				+ "\"CONSIGNEE_ADDRESS2\":\""
				+ addressLine2
				+ "\","
				+ "\"CONSIGNEE_ADDRESS3\":\""
				+ city
				+ "\","
				+ "\"DECLARED_VALUE\":\" 3000 \","
				+ "\"DESTINATION_CITY\":\"MUMBAI\","
				+ "\"HEIGHT\":\"0\","
				+ "\"ITEM_DESCRIPTION\":\"\","
				+ "\"LENGTH\":\" 0\","
				+ "\"MOBILE\":\""
				+ phone
				+ "\","
				+ "\"ORDER_NUMBER\":\""
				+ order.getOrderNumber()
				+ "\","
				+ "\"PICKUP_ADDRESS_LINE1\":\"Samalkha\","
				+ "\"PICKUP_ADDRESS_LINE2\":\"kapashera\","
				+ "\"PICKUP_MOBILE\":\"59536\","
				+ "\"PICKUP_NAME\":\"abcde\","
				+ "\"PICKUP_PHONE\":\"98204\","
				+ "\"PICKUP_PINCODE\":\"110013\","
				+ "\"PIECES\":\"1\","
				+ "\"PINCODE\":\"400067\","
				+ "\"PRODUCT\":\""+orderType+"\","
				+ "\"RETURN_ADDRESS_LINE1\":\"Samalkha\","
				+ "\"RETURN_ADDRESS_LINE2\":\"kapashera\","
				+ "\"RETURN_MOBILE\":\"59536\","
				+ "\"RETURN_NAME\":\"abcde\","
				+ "\"RETURN_PHONE\":\"98204\","
				+ "\"RETURN_PINCODE\":\"110013\","
				+ "\"STATE\":\"MH\","
				+ "\"TELEPHONE\":\""
				+ phone
				+ "\","
				+ "\"VOLUMETRIC_WEIGHT\":\"0\"" + "}" + "]";
		String inputStr = (String) postQuery(url, requestBody);

		ObjectMapper mapper = new ObjectMapper();
		System.out.println(inputStr);
		AwbOrderPlacementResponse awbResponse = null;
		try {
			awbResponse = mapper.readValue(inputStr,
					new TypeReference<AwbResponse>() {
					});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return awbResponse.isSuccess();
	}

	private Object postQuery(String url, String requestBody) {
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		String inputStr = "";
		try {
			HttpPost request = new HttpPost(url);
			StringEntity params = new StringEntity(requestBody);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
			CloseableHttpResponse response1 = httpClient.execute(request);
			HttpEntity entity1 = response1.getEntity();

			String inputLine;

			BufferedReader br = new BufferedReader(new InputStreamReader(
					entity1.getContent()));
			try {
				while ((inputLine = br.readLine()) != null) {
					inputStr += inputLine;
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			httpClient.close();
		} catch (Exception ex) {
			System.out.println("error while updating the pincodes");
			ex.printStackTrace();
		} finally {

		}
		return inputStr;
	}

}
