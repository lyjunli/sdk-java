/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package org.openstack4j.openstack.trove.internal;

import java.util.List;

import org.openstack4j.openstack.trove.domain.TroveDatastore;
import org.openstack4j.openstack.trove.domain.TroveDatastore.Datastores;
import org.openstack4j.openstack.trove.domain.TroveDatastoreVersion;
import org.openstack4j.openstack.trove.domain.TroveDatastoreVersion.Versions;

/**
 * The implementation of manipulation of {@link TroveDatastore}
 *
 * @author QianBiao.NG
 * @date   2017-07-31 11:41:17
 */
public class TroveDatastoreService extends BaseTroveServices {

	/**
	* Returns list of available datastores
	* @return the list of datastores
	*/
	public List<TroveDatastore> list() {
		return get(Datastores.class, uri("/datastores")).execute().getList();
	}

	/**
	 * Gets a datastore specified by ID
	 * @param id
	 * @return the datastore or null if not found
	 */
	public TroveDatastore get(String id) {
		return get(TroveDatastore.class, uri("/datastores/%s", id)).execute();
	}

	/**
	 * Returns list of all datastore versions
	 * @param datasoreId
	 * @return list of datastore versions
	 */
	public List<TroveDatastoreVersion> listDatastoreVersions(String datasoreId) {
		return get(Versions.class, uri("/datastores/%s/versions", datasoreId)).execute().getList();
	}

	/**
	 * Get the datastore version specified by ID
	 * 
	 * @param datastoreId
	 * @param versionId
	 * @return the datastore version or null if not found
	 */
	public TroveDatastoreVersion getDatastoreVersion(String datastoreId, String versionId) {
		return get(TroveDatastoreVersion.class, uri("/datastores/%s/versions/%s", datastoreId, versionId)).execute();
	}

}