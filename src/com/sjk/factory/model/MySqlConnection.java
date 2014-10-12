package com.sjk.factory.model;

import com.sjk.factory.api.DBServerConncetion;

public class MySqlConnection implements DBServerConncetion {

	@Override
	public String getJdbcDriver() {
		return "JDBC MySQL";
	}

}
