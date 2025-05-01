package com.app.profile.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.profile.service.GenericService;

@Component
@Profile("uat")
public class UatService implements GenericService
{		
	@Value("${my.profile.code}")
	public String code;
	
	public String getCode()
	{
		return code;		
	}
	
	public void setCode(String code)
	{
		this.code=code;
	}
	
	public String toString()
	{
		return "UatService [code="+code+"]";
	}
	
	@Override
	public void executeTask()
	{
		System.out.println(this);
		System.out.println("from UAT profiles");
		System.out.println("code is : "+code);
	}
}