/**
 * 
 */
package com.beautifulyears.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.beautifulyears.BYConstants;

/**
 * @author Nitin
 *
 */
public class BarcodeUtil {

	public static String getBarcodeImage(String dataString) {
		String barCodeImagePath = "";
		try {
//			HttpClient httpclient = new DefaultHttpClient();
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpGet httpget = new HttpGet(BYConstants.SITE_URL
					+ "/generateBarCode?barcodeString=" + dataString);
			HttpResponse response = httpClient.execute(httpget);
			HttpEntity entity = response.getEntity();
			barCodeImagePath = EntityUtils.toString(entity, "UTF-8");
//			barCodeImagePath = BYConstants.SITE_URL+barCodeImagePath;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("barCodeImagePath = "+barCodeImagePath);
		return barCodeImagePath;
	}
}
