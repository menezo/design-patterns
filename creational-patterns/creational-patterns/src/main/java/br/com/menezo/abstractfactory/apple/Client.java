package br.com.menezo.abstractfactory.apple;

import br.com.menezo.abstractfactory.apple.factory.IPhone11Factory;
import br.com.menezo.abstractfactory.apple.factory.IPhoneFactory;
import br.com.menezo.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.menezo.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.menezo.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.menezo.abstractfactory.apple.factory.abstractFactory.UsRulesAbstractFactory;
import br.com.menezo.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory brRules = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory usRules = new UsRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(brRules);
		IPhoneFactory gen11Factory = new IPhone11Factory(usRules);

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
