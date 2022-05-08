package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Samsung {
	@Autowired
	//@Qualifier("snapDragon")
	//@Qualifier("mediaTek")
	Processor processorob;

	public Processor getProcessorob() {
		return processorob;
	}

	public void setProcessorob(Processor processorob) {
		this.processorob = processorob;
	}

public void samsungFun()
{
	System.out.println("Heaving Good features");
	processorob.processorFun();
	}

}
