package com.SpringQualifier;

import org.springframework.stereotype.Component;

@Component
public class AqualicLife implements Animal {

	@Override
	public void head() {
		System.out.println("Am aquatic head");
	}

	@Override
	public void tail() {
		System.out.println("Am aquatic tails");

	}

	@Override
	public void legs() {
		System.out.println("Am aquatic , I may not have legs");

	}

}
