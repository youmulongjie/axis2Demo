/**
 * <p>
 * 描述：
 * </p>

 * @package ：com.andy.demo.axis2.webservice<br>
 * @author ：wanglongjie<br>
 */
package com.andy.demo.axis2.webservice;

import java.util.Date;

import com.andy.demo.axis2.bean.People;

/**
 * <p>
 * 描述：接口 定义类
 * </p>
 * 
 * @author wanglongjie<br>
 * @version v1.0 2018年10月27日下午3:47:47
 */
public interface ISayHi {
	public String helloWorld();
	
	public String sayHi(String name);
	
	public People people(String name, int age, Date registerDate);
}
