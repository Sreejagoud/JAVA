package com.edu;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class SnapDragon implements Processor {

	public void processorFun() {
		System.out.println("snap dragon world best processsor");
		
	}

}
