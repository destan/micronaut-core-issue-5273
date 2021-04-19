package com.example;

import io.micronaut.aop.Around;

@SomeAnnotation // you can also try with @Around, it behaves the same
public class AnotherService implements AnotherInterface {

	@Override
	public String anotherDemo() {
		System.out.println("AnotherService.anotherDemo");
		return "anotherDemo";
	}

}
