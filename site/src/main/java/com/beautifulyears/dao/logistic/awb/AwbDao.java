/**
 * 
 */
package com.beautifulyears.dao.logistic.awb;

import java.util.List;

/**
 * @author Nitin
 *
 */
public interface AwbDao {
	public List<String> generate(int count, String type);
}
