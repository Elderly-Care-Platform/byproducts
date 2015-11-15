/**
 * 
 */
package com.beautifulyears.service.logistic.awb;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beautifulyears.dao.logistic.awb.AwbDao;

/**
 * @author Nitin
 *
 */
@Service("blAwbService")
public class AwbServiceImpl implements AwbService {

	@Resource(name = "blAwbDao")
	protected AwbDao awbDao;

	@Override
	public List<String> generate(int count, String type) {
		return awbDao.generate(count, type);
	}

}
