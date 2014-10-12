package com.sjk.facotry.impl;

import com.sjk.facotry.abstracts.AbstractFacotryConnection;
import com.sjk.factory.api.DBServerConncetion;
import com.sjk.factory.api.SolrConnection;
import com.sjk.factory.model.MySqlConnection;
import com.sjk.factory.model.PostgreSQL;
import com.sjk.factory.model.enums.DBType;
import com.sjk.factory.model.enums.SolrServerType;

public class DBConnectionFactory extends AbstractFacotryConnection {

	@Override
	public SolrConnection getSolrConnection(SolrServerType type) {
		//This should return null;
		return null;
	}

	@Override
	public DBServerConncetion getDBConnection(DBType type) {
		switch(type){
		case MYSQL:{
			return new MySqlConnection();
		}
		case POSTGRESQL:{
			return new PostgreSQL();
		}
		default: return null;
		}
	}

}
