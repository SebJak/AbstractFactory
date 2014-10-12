package com.sjk.facotry.app;

import com.sjk.facotry.abstracts.AbstractFacotryConnection;
import com.sjk.facotry.impl.FactoryConnectionProducer;
import com.sjk.factory.api.DBServerConncetion;
import com.sjk.factory.api.SolrConnection;
import com.sjk.factory.model.enums.ConnectionType;
import com.sjk.factory.model.enums.DBType;
import com.sjk.factory.model.enums.SolrServerType;

public class AbstractFacotryPattern {

	public static void main(String[] args) {
		AbstractFacotryConnection connection = FactoryConnectionProducer.getFacotry(ConnectionType.SOLR);
		SolrConnection bmw = connection.getSolrConnection(SolrServerType.BMW);
		System.out.println(bmw.getPathToServer());
		//the same connectionFacotry we can use to get porsche server
		SolrConnection porsche = connection.getSolrConnection(SolrServerType.PORSCHE);
		System.out.println(porsche.getPathToServer());
		
		AbstractFacotryConnection connectionDB = FactoryConnectionProducer.getFacotry(ConnectionType.DATA_BASE);
		DBServerConncetion mySQL = connectionDB.getDBConnection(DBType.MYSQL);
		System.out.println(mySQL.getJdbcDriver());
	}

}
