package com.velocity.dto;

public class PolicyDto {

	// id,name,status
	private int id;
	private String name;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PolicyDto [id=" + id + ", name=" + name + ", status=" + status + "]";
	}

}
