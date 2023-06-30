package org.tnsif.springioc;



//Implementing a DebitCard interface
public class HDFCCard implements DebitCard{

	@Override
	public void deposit() {
		System.out.println("HDFC-Depositing an amount of 1 lakh rupees");
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC-Depositing an amount of 1 lakh rupees");
	}

}