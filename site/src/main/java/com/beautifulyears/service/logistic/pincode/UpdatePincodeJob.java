/**
 * 
 */
package com.beautifulyears.service.logistic.pincode;

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
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.beautifulyears.BYConstants;
import com.beautifulyears.sample.logistic.domain.PincodeImpl;

/**
 * @author Nitin
 *
 */
public class UpdatePincodeJob extends QuartzJobBean {

	private PincodeService pincodeService;

	public void setPincodeService(PincodeService pincodeService) {
		this.pincodeService = pincodeService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.scheduling.quartz.QuartzJobBean#executeInternal(org
	 * .quartz.JobExecutionContext)
	 */
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println("Update Pin Cron Job*********");
		// pincodeService.save(null);
		getPincodes();

	}

	private Object getPincodes() {

		CloseableHttpClient httpClient = HttpClientBuilder.create().build();

		try {

			HttpPost request = new HttpPost(BYConstants.LOGISTIC_API
					+ "/apiv2/pincodes/");
			StringEntity params = new StringEntity("username="
					+ BYConstants.LOGISTIC_USERNAME + "&password="
					+ BYConstants.LOGISTIC_PASSWORD);
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
			List<PincodeImpl> myObjects = mapper.readValue(inputStr,
					new TypeReference<List<PincodeImpl>>() {
					});
			if (null != myObjects) {
				pincodeService.update(myObjects);
			}

			httpClient.close();
		} catch (Exception ex) {
			System.out.println("error while updating the pincodes");
			ex.printStackTrace();
		} finally {

		}
		return null;

	}

}
