package com.sjk.factory.model;

import com.sjk.factory.api.DBServerConncetion;

public class PostgreSQL implements DBServerConncetion {

	@Override
	public String getJdbcDriver() {
		return "PostgreSQL";
	}

}
