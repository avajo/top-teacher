package org.labcrypto.topteacher;

public class Instance {

	public enum InstanceTypeEnum {
		Unknown, Teacher, Student
	}

	private String id;
	private String name;
	private String ipAddress;
	private InstanceTypeEnum type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public InstanceTypeEnum getType() {
		return type;
	}
	public void setType(InstanceTypeEnum type) {
		this.type = type;
	}
}
