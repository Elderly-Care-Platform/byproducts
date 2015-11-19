/**
 * 
 */
package com.beautifulyears.dao.logistic.awb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.broadleafcommerce.core.order.domain.DiscreteOrderItem;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.stereotype.Repository;

import com.beautifulyears.BYConstants;
import com.beautifulyears.dao.logistic.awb.status.EcomexpressObjects;
import com.beautifulyears.domain.logistic.AwbOrderPlacementResponse;
import com.beautifulyears.domain.logistic.AwbResponse;
import com.beautifulyears.sample.catalog.domain.ExtendProductImpl;
import com.beautifulyears.sample.config.PickUpAddressConfig;
import com.beautifulyears.sample.profile.domain.ExtendAddressImpl;

/**
 * @author Nitin
 *
 */
@Repository("blAwbDao")
public class AwbDaolmpl implements AwbDao {

	@Override
	public List<String> generate(int count, String type) {

		List<String> awbList = null;
		String url = BYConstants.LOGISTIC_API + "/apiv2/fetch_awb/";
		String requestBody = "username=" + BYConstants.LOGISTIC_USERNAME
				+ "&password=" + BYConstants.LOGISTIC_PASSWORD + "&type="
				+ type + "&count=" + count;
		System.out.println("making request -> " + BYConstants.LOGISTIC_API
				+ "/apiv2/fetch_awb/");
		System.out.println("with parameter  as -> " + requestBody);
		String inputStr = (String) postQuery(url, requestBody);

		ObjectMapper mapper = new ObjectMapper();
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
		System.out.println("awbNumber = " + awbNumber);
		String addressLine1 = order.getOrderAttributes().get("AddressLine1")
				.getValue();
		System.out.println("addressLine1 = " + addressLine1);
		String addressLine2 = order.getOrderAttributes().get("AddressLine2")
				.getValue();
		System.out.println("addressLine2 = " + addressLine2);
		String firstName = order.getOrderAttributes().get("firstName")
				.getValue();
		System.out.println("firstName = " + firstName);
		String lastName = order.getOrderAttributes().get("lastName").getValue();
		System.out.println("lastName = " + lastName);
		String city = order.getOrderAttributes().get("City").getValue();
		System.out.println("city = " + city);
		String phone = order.getOrderAttributes().get("Phone").getValue();
		System.out.println("phone = " + phone);
		String orderType = order.getOrderAttributes().get("deliveryType")
				.getValue();
		System.out.println("orderType = " + orderType);
		ExtendAddressImpl pickupAddress = null;

		if (item instanceof DiscreteOrderItem
				&& null != ((DiscreteOrderItem) item).getProduct()
				&& ((DiscreteOrderItem) item).getProduct() instanceof ExtendProductImpl
				&& ((ExtendProductImpl) ((DiscreteOrderItem) item).getProduct())
						.getPickupAddressCode() != null) {
			pickupAddress = PickUpAddressConfig.PICKUP_ADDRESS_MAP
					.get(((ExtendProductImpl) ((DiscreteOrderItem) item)
							.getProduct()).getPickupAddressCode());

			if (null != pickupAddress) {
				pickupAddress = PickUpAddressConfig.PICKUP_ADDRESS_MAP
						.get(PickUpAddressConfig.SELF.getType());
			}
		} else {
			pickupAddress = PickUpAddressConfig.PICKUP_ADDRESS_MAP
					.get(PickUpAddressConfig.SELF.getType());
		}

		String url = BYConstants.LOGISTIC_API + "/apiv2/manifest_awb/";
		String requestBody = "username=" + BYConstants.LOGISTIC_USERNAME
				+ "&password=" + BYConstants.LOGISTIC_PASSWORD
				+ "&json_input=[" + "{" + "\"ACTUAL_WEIGHT\":\"5\","
				+ "\"AWB_NUMBER\":\"" + awbNumber + "\","
				+ "\"BREADTH\":\"0\"," + "\"COLLECTABLE_VALUE\":\" 3000 \","
				+ "\"CONSIGNEE\":\"" + firstName + " " + lastName + "\","
				+ "\"CONSIGNEE_ADDRESS1\":\"" + addressLine1 + "\","
				+ "\"CONSIGNEE_ADDRESS2\":\"" + addressLine2 + "\","
				+ "\"CONSIGNEE_ADDRESS3\":\"" + city + "\","
				+ "\"DECLARED_VALUE\":\" 3000 \","
				+ "\"DESTINATION_CITY\":\"MUMBAI\"," + "\"HEIGHT\":\"0\","
				+ "\"ITEM_DESCRIPTION\":\"\"," + "\"LENGTH\":\" 0\","
				+ "\"MOBILE\":\"" + phone + "\"," + "\"ORDER_NUMBER\":\"\","
				+ "\"PICKUP_ADDRESS_LINE1\":\""
				+ pickupAddress.getAddressLine1() + "\","
				+ "\"PICKUP_ADDRESS_LINE2\":\""
				+ pickupAddress.getAddressLine2() + "\","
				+ "\"PICKUP_MOBILE\":\""
				+ pickupAddress.getPhonePrimary().getPhoneNumber() + "\","
				+ "\"PICKUP_NAME\":\"" + pickupAddress.getFirstName() + "\","
				+ "\"PICKUP_PHONE\":\""
				+ pickupAddress.getPhonePrimary().getPhoneNumber() + "\","
				+ "\"PICKUP_PINCODE\":\"" + pickupAddress.getPostalCode()
				+ "\"," + "\"PIECES\":\"1\"," + "\"PINCODE\":\"400067\","
				+ "\"PRODUCT\":\"" + orderType + "\","
				+ "\"RETURN_ADDRESS_LINE1\":\""
				+ pickupAddress.getAddressLine1() + "\","
				+ "\"RETURN_ADDRESS_LINE2\":\""
				+ pickupAddress.getAddressLine2() + "\","
				+ "\"RETURN_MOBILE\":\""
				+ pickupAddress.getPhonePrimary().getPhoneNumber() + "\","
				+ "\"RETURN_NAME\":\"abcde\"," + "\"RETURN_PHONE\":\""
				+ pickupAddress.getPhonePrimary() + "\","
				+ "\"RETURN_PINCODE\":\"" + pickupAddress.getPostalCode()
				+ "\"," + "\"STATE\":\"" + pickupAddress.getState().getName()
				+ "\"," + "\"TELEPHONE\":\"" + phone + "\","
				+ "\"VOLUMETRIC_WEIGHT\":\"1\"" + "}" + "]";
		System.out.println(requestBody);
		String inputStr = (String) postQuery(url, requestBody);

		ObjectMapper mapper = new ObjectMapper();
		System.out.println(inputStr);
		AwbOrderPlacementResponse awbResponse = null;
		try {
			awbResponse = mapper.readValue(inputStr,
					new TypeReference<AwbOrderPlacementResponse>() {
					});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return awbResponse.getShipments().get(0).isSuccess();
	}

	@Override
	public Object track(List<String> awbList) {
		String delim = "";
		StringBuffer sb = new StringBuffer();
		for (String i : awbList) {
			sb.append(delim).append(i);
			delim = ",";
		}
		String url = BYConstants.LOGISTIC_API + "/track_me/api/mawb/?awb="
				+ sb.toString() + "&order=&username="
				+ BYConstants.LOGISTIC_USERNAME + "&password="
				+ BYConstants.LOGISTIC_PASSWORD;
		String inputStr = (String) getQuery(url);
		System.out.println(inputStr);

		JAXBContext jaxbContext;
		EcomexpressObjects response = null;
		try {
			jaxbContext = JAXBContext.newInstance(EcomexpressObjects.class);
			StringReader sr = new StringReader(inputStr);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			response = (EcomexpressObjects) unmarshaller.unmarshal(sr);
			System.out.println(response);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return response;
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
		System.out.println(inputStr);
		return inputStr;
	}

	private Object getQuery(String url) {
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		String inputStr = "";
		try {
			HttpGet request = new HttpGet(url);
			request.addHeader("content-type", "application/json");
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
		System.out.println(inputStr);
		return inputStr;
	}

}
