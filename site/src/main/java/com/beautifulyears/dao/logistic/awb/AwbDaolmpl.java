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
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.stereotype.Repository;

import com.beautifulyears.domain.logistic.AwbResponse;

/**
 * @author Nitin
 *
 */
@Repository("blAwbDao")
public class AwbDaolmpl implements AwbDao {

	@Override
	public List<String> generate(int count, String type) {

		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		List<String> awbList = null;
		try {
			HttpPost request = new HttpPost(
					"http://ecomm.prtouch.com/apiv2/fetch_awb/");
			StringEntity params = new StringEntity(
					"username=ecomexpress&password=Ke%243c%404oT5m6h%23%24&type="
							+ type + "&count=" + count);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
			CloseableHttpResponse response1 = httpClient.execute(request);
			HttpEntity entity1 = response1.getEntity();

			String inputLine;
			String inputStr = "";
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

			ObjectMapper mapper = new ObjectMapper();
			System.out.println(inputStr);
			AwbResponse awbResponse = mapper.readValue(inputStr,
					new TypeReference<AwbResponse>() {
					});
			if (null != awbResponse && null != awbResponse.getAwb()) {
				awbList = awbResponse.getAwb();
			}
			httpClient.close();
		} catch (Exception ex) {
			System.out.println("error while updating the pincodes");
			ex.printStackTrace();
		} finally {

		}
		return awbList;
	}

}
