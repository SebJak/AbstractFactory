package com.sjk.facotry.impl;

import com.sjk.facotry.abstracts.AbstractFacotryConnection;
import com.sjk.factory.api.DBServerConncetion;
import com.sjk.factory.api.SolrConnection;
import com.sjk.factory.model.BmwServer;
import com.sjk.factory.model.PorscheServer;
import com.sjk.factory.model.TescoServer;
import com.sjk.factory.model.VolkswagenServer;
import com.sjk.factory.model.enums.DBType;
import com.sjk.factory.model.enums.SolrServerType;

public class SolrConnectionFactory extends AbstractFacotryConnection {

	@Override
	public SolrConnection getSolrConnection(SolrServerType type) {
		switch(type){
		case BMW:{
			return new BmwServer();
		}
		case PORSCHE:{
			return new PorscheServer();
		}
		case TESCO:{
			return new TescoServer();
		}
		case VOLKSWAGEN:{
			return new VolkswagenServer();
		}
		default: return null;
		}
	}

	@Override
	public DBServerConncetion getDBConnection(DBType type) {
		//This method should return null value
		return null;
	}

}
