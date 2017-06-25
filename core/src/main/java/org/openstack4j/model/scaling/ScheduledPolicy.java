/*******************************************************************************
 * 	Copyright 2017 HuaWei Tld                                     
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
package org.openstack4j.model.scaling;

import java.util.Date;

import org.openstack4j.model.ModelEntity;
import org.openstack4j.openstack.common.DateTimeUtils;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ScheduledPolicy implements ModelEntity {

	private static final long serialVersionUID = -6411187348817338454L;

	@JsonProperty("launch_time")
	private String launchTime;

	@JsonProperty("recurrence_type")
	private String recurrenceType;

	@JsonProperty("recurrence_value")
	private String recurrenceValue;

	@JsonProperty("start_time")
	@JsonFormat(pattern = DateTimeUtils.FORMAT_YMDTHMZ)
	private Date startTime;

	@JsonProperty("end_time")
	@JsonFormat(pattern = DateTimeUtils.FORMAT_YMDTHMZ)
	private Date endTime;
	
	public enum RecurrenceType {
		Daily,
		Weekly,
		Monthly,
		;
	}
}
