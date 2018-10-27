/**
 * <p>
 * 描述：
 * </p>

 * @package ：com.andy.demo.axis2.bean<br>
 * @author ：wanglongjie<br>
 */
package com.andy.demo.axis2.bean;

import java.util.Date;

/**
 * <p>
 * 描述：
 * </p>
 * 
 * @author wanglongjie<br>
 * @version v1.0 2018年10月27日下午5:17:13
 */
public class People {
	private String name;
	private int age;
	private Date registerDate;

	public People() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param registerDate
	 */
	public People(String name, int age, Date registerDate) {
		super();
		this.name = name;
		this.age = age;
		this.registerDate = registerDate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the registerDate
	 */
	public Date getRegisterDate() {
		return registerDate;
	}

	/**
	 * @param registerDate
	 *            the registerDate to set
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", registerDate="
				+ registerDate + "]";
	}

}
