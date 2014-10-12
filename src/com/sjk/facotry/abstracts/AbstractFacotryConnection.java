package com.sjk.facotry.abstracts;

import com.sjk.factory.api.DBServerConncetion;
import com.sjk.factory.api.SolrConnection;
import com.sjk.factory.model.enums.DBType;
import com.sjk.factory.model.enums.SolrServerType;

public abstract class AbstractFacotryConnection {

	public abstract SolrConnection getSolrConnection(SolrServerType type);
	
	public abstract DBServerConncetion getDBConnection(DBType type);
	
}
