package org.openstack4j.openstack.senlin.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.openstack4j.model.senlin.Cluster;
import org.openstack4j.model.senlin.ClusterStatus;
import org.openstack4j.openstack.common.ListResult;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * This is a model of a senlinCluster. It uses Jackson annotations for
 * (de)serialization into JSON format
 * 
 * @author lion
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("cluster")
public class SenlinCluster implements Cluster {
	private static final long serialVersionUID = -4148491479364580015L;

	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("data")
	private Map<String, String> data;
	@JsonProperty("desired_capacity")
	private Integer desiredCapacity;
	@JsonProperty("domain")
	private String domain;
	@JsonProperty("id")
	private String id;
	@JsonProperty("init_at")
	private Date initAt;
	@JsonProperty("max_size")
	private Integer maxSize;
	@JsonProperty("metadata")
	private Map<String, String> metadata;
	@JsonProperty("min_size")
	private Integer minSize;
	@JsonProperty("name")
	private String name;
	@JsonProperty("nodes")
	private ArrayList<String> nodes;
	@JsonProperty("policies")
	private ArrayList<String> policies;
	@JsonProperty("profile_id")
	private String profileID;
	@JsonProperty("profile_name")
	private String profileName;
	@JsonProperty("project")
	private String project;
	@JsonProperty("status")
	private ClusterStatus status;
	@JsonProperty("status_reason")
	private String statusReason;
	@JsonProperty("timeout")
	private Integer timeout;
	@JsonProperty("updated_at")
	private Date updatedAt;
	@JsonProperty("user")
	private String user;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "SenlinCluster{" +
				"created_at='" + createdAt + '\'' +
				", data=" + data +
				", desired_capacity='" + desiredCapacity + '\'' +
				", domain='" + domain + '\'' +
				", id='" + id + '\'' +
				", init_at='" + initAt + '\'' +
				", max_size='" + maxSize + '\'' +
				", metadata=" + metadata +
				", min_size='" + minSize + '\'' +
				", name='" + name + '\'' +
				", nodes=" + nodes +
				", policies=" + policies +
				", profile_id='" + profileID + '\'' +
				", profile_name='" + profileName + '\'' +
				", project='" + project + '\'' +
				", status='" + status + '\'' +
				", status_reason='" + statusReason + '\'' +
				", timeout='" + timeout + '\'' +
				", updated_at='" + updatedAt + '\'' +
				", user='" + user + '\'' +
				'}';
	}

	/**
	 * An inner class for representing lists of senlinCluster
	 * 
	 * @author lion
	 * 
	 */
	public static class Cluster extends ListResult<SenlinCluster> {
		private static final long serialVersionUID = -3382404528209154988L;
		@JsonProperty("clusters")
		private List<SenlinCluster> list;

		protected List<SenlinCluster> value() {
			return list;
		}
	}
}
