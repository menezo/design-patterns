package br.com.menezo.factory.apple.halfSimple;

import br.com.menezo.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.menezo.factory.apple.halfSimple.factory.IphoneXFactory;
import br.com.menezo.factory.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		IphoneXFactory iphoneXFactory = new IphoneXFactory();
		IPhone11Factory iPhone11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIphone("standard");
		System.out.println(iphone);

		System.out.println("### Ordering an iPhone X HighEnd");
		IPhone iphone2 = iphoneXFactory.orderIphone("highEnd");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iphone3 = iPhone11Factory.orderIphone("standard");
		System.out.println(iphone3);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone4 = iPhone11Factory.orderIphone("highEnd");
		System.out.println(iphone4);
	}
}
