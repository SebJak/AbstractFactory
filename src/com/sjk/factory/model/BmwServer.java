package com.sjk.factory.model;

import com.sjk.factory.api.SolrConnection;
import com.sjk.factory.model.enums.SolrServerType;

public class BmwServer implements SolrConnection {

	@Override
	public String getPathToServer() {
		return "http://localhost:8983/bmw";
	}

}
