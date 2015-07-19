/**
 * 
 */
package com.poc.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author MaRoy
 *
 */
public class MyAroundAdvice implements MethodBeforeAdvice{

	
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("Inside method ::"+arg0.getName());
		
	}

}
