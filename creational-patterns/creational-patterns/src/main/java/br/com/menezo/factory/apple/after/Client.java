package br.com.menezo.factory.apple.after;

import br.com.menezo.factory.apple.after.factory.Iphone11Factory;
import br.com.menezo.factory.apple.after.factory.Iphone11ProFactory;
import br.com.menezo.factory.apple.after.factory.IphoneXFactory;
import br.com.menezo.factory.apple.after.factory.IphoneXSMaxFactory;
import br.com.menezo.factory.apple.after.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone X");
		IphoneXFactory iphoneXFactory = new IphoneXFactory();
		IPhone iphone = iphoneXFactory.orderIphone();
		System.out.println(iphone);

		System.out.println("### Ordering an iPhone XS Max");
		IphoneXSMaxFactory iphoneXSMaxFactory = new IphoneXSMaxFactory();
		IPhone iphone2 = iphoneXSMaxFactory.orderIphone();
		System.out.println(iphone2);

		System.out.println("### Ordering an iPhone 11");
		Iphone11Factory iphone11Factory = new Iphone11Factory();
		IPhone iphone3 = iphone11Factory.orderIphone();
		System.out.println(iphone3);


		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		Iphone11ProFactory iphone11ProFactory = new Iphone11ProFactory();
		IPhone iphone4 = iphone11ProFactory.orderIphone();
		System.out.println(iphone4);
	}
}
