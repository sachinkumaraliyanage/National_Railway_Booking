package com.train.details.train.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("train")
public class Train {
	
	@Id
	private String id;
	private String name;
	private String starttime;
	private String endtime;
	private String startlocation;
	private String endlocation;
	private double firstclass;
	private double secondclass;
	private double thirdclass;
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
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getStartlocation() {
		return startlocation;
	}
	public void setStartlocation(String startlocation) {
		this.startlocation = startlocation;
	}
	public String getEndlocation() {
		return endlocation;
	}
	public void setEndlocation(String endlocation) {
		this.endlocation = endlocation;
	}
	public double getFirstclass() {
		return firstclass;
	}
	public void setFirstclass(double firstclass) {
		this.firstclass = firstclass;
	}
	public double getSecondclass() {
		return secondclass;
	}
	public void setSecondclass(double secondclass) {
		this.secondclass = secondclass;
	}
	public double getThirdclass() {
		return thirdclass;
	}
	public void setThirdclass(double thirdclass) {
		this.thirdclass = thirdclass;
	}
	
	
	

}
