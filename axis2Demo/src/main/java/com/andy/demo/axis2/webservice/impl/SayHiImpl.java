/**
 * <p>
 * 描述：
 * </p>

 * @package ：com.andy.demo.axis2.webservice.impl<br>
 * @author ：wanglongjie<br>
 */
package com.andy.demo.axis2.webservice.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.andy.demo.axis2.bean.People;
import com.andy.demo.axis2.webservice.ISayHi;

/**
 * <p>
 * 描述：接口实现类（可以不要接口，直接写实现类）
 * </p>
 * 
 * @author wanglongjie<br>
 * @version v1.0 2018年10月27日下午3:49:44
 */
// 提供服务
// 注册成 spring组件，便于通过spring扫描，默认value是 类型（首字母小写）。
// （或者在 applicationContext.xml 配置）
@Component 
public class SayHiImpl implements ISayHi {

	/* (non-Javadoc)
	 * @see com.andy.demo.axis2.webservice.ISayHi#helloWorld()
	 */
	@Override
	public String helloWorld() {
		// TODO Auto-generated method stub
		return "hello world!";
	}

	/* (non-Javadoc)
	 * @see com.andy.demo.axis2.webservice.ISayHi#sayHi(java.lang.String)
	 */
	@Override
	public String sayHi(String name) {
		// TODO Auto-generated method stub
		return "hi " + name;
	}

	/* (non-Javadoc)
	 * @see com.andy.demo.axis2.webservice.ISayHi#people(java.lang.String, int, java.util.Date)
	 */
	@Override
	public People people(String name, int age, Date registerDate) {
		// TODO Auto-generated method stub
		return new People(name, age, registerDate);
	}

}
