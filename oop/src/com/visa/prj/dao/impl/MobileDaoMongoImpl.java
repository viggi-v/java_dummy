package com.visa.prj.dao.impl;

import com.visa.prj.dao.MobileDao;
import com.visa.prj.entity.Mobile;
/**
 * Implementation of MobileDao interface, to connect to MongoDB database.
 * @author root
 *
 */
public class MobileDaoMongoImpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("Stored into the MongoDB :)");
	}

}
