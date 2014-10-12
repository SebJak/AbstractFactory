package com.sjk.facotry.impl;

import com.sjk.facotry.abstracts.AbstractFacotryConnection;
import com.sjk.factory.model.enums.ConnectionType;

public class FactoryConnectionProducer {

	public static AbstractFacotryConnection getFacotry(ConnectionType type){
		switch(type){
		case DATA_BASE: {
			return new DBConnectionFactory();
		}
		case SOLR:{
			return new SolrConnectionFactory();
		}
		default: return null;
		}
	}
}
