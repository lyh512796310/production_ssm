package com.megagao.production.ssm.domain;

import java.util.Date;

public class Cultivate {
	private String id;
	private String name;
	private String type;
	private String teacher;
	private Date create_time;
	private Date over_time;
	private String address;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getOver_time() {
		return over_time;
	}
	public void setOver_time(Date over_time) {
		this.over_time = over_time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Cultivate [id=" + id + ", name=" + name + ", type=" + type
				+ ", teacher=" + teacher + ", create_time=" + create_time
				+ ", over_time=" + over_time + ", address=" + address + "]";
	}
	public Cultivate() {
		super();
	}
	public Cultivate(String id, String name, String type, String teacher,
			Date create_time, Date over_time, String address) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.teacher = teacher;
		this.create_time = create_time;
		this.over_time = over_time;
		this.address = address;
	}
	
}
	
	
