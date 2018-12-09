package com.hcc.advweb;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT5")
public class Student implements Serializable {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="FNAME")
	private String fname;
	@Column(name="LNAME")
	private String lname;
	@Column(name="PHONE")
	private String phone;
	@Column(name="ADDRESS1")
	private String address1;
	@Column(name="ADDRESS2")
	private String address2;
	@Column(name="CITY")
	private String city;
	@Column(name="ZIP")
	private String zip;
	@Column(name="STATE")
	private String state;
	@Column(name="COUNTRY")
	private String country;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String fname, String lname) {
		setId(id);
		setFname(fname);
		setLname(lname);		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", address1="
				+ address1 + ", address2=" + address2 + ", city=" + city + ", zip=" + zip + ", state=" + state
				+ ", country=" + country + ", getId()=" + getId() + ", getFname()=" + getFname() + ", getLname()="
				+ getLname() + ", getPhone()=" + getPhone() + ", getAddress1()=" + getAddress1() + ", getAddress2()="
				+ getAddress2() + ", getCity()=" + getCity() + ", getZip()=" + getZip() + ", getState()=" + getState()
				+ ", getCountry()=" + getCountry() + "]";
	}
	
	

}
