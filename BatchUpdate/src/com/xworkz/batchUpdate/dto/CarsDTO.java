package com.xworkz.batchUpdate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "carsDetails")
public class CarsDTO implements Serializable{
	
	@Id
	@GenericGenerator(name = "car", strategy = "increment")
	@GeneratedValue(generator = "car")
	@Column(name = "c_id")
	private int id;
	@Column(name = "car_name")
	private String name;
	@Column(name = "company_name")
	private String company;
	@Column(name = "price")
	private Long price;
	@Column(name = "no_of_seats")
	private int noOfSeat;
	@Column(name = "auto_gear")
	private boolean autoGear;
	@Column(name = "sun_roof")
	private boolean sunRoof;
	
	public CarsDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	public boolean isAutoGear() {
		return autoGear;
	}
	public void setAutoGear(boolean autoGear) {
		this.autoGear = autoGear;
	}
	public boolean isSunRoof() {
		return sunRoof;
	}
	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}
	@Override
	public String toString() {
		return "CarsDTO [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + ", noOfSeat="
				+ noOfSeat + ", autoGear=" + autoGear + ", sunRoof=" + sunRoof + "]";
	}
}
