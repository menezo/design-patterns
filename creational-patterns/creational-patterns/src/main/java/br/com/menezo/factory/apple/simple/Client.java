package br.com.menezo.factory.apple.simple;

import br.com.menezo.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.menezo.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIphone("X", "standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone X HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIphone("X", "highEnd");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone3 = IPhoneSimpleFactory.orderIphone("11", "standard");
		System.out.println(iphone3);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone4 = IPhoneSimpleFactory.orderIphone("11", "highEnd");
		System.out.println(iphone4);
	}
}
