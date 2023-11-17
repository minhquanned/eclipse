package com.java.be;

import java.util.Arrays;

public class User {
	public User(String firstName, String lastName, String doB, String poB, String sex, String[] freeDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		DoB = doB;
		PoB = poB;
		this.sex = sex;
		this.freeDay = freeDay;
	}
	String firstName;
	String lastName;
	String DoB;
	String PoB;
	String sex;
	String[] freeDay;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDoB() {
		return DoB;
	}
	public void setDoB(String doB) {
		DoB = doB;
	}
	public String getPoB() {
		return PoB;
	}
	public void setPoB(String poB) {
		PoB = poB;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getFreeDay() {
		return freeDay;
	}
	public void setFreeDay(String[] freeDay) {
		this.freeDay = freeDay;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", DoB=" + DoB + ", PoB=" + PoB + ", sex="
				+ sex + ", freeDay=" + Arrays.toString(freeDay) + "]";
	}
}
