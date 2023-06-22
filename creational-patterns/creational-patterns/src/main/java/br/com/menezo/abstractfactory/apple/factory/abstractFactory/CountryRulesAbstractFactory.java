package br.com.menezo.abstractfactory.apple.factory.abstractFactory;

import br.com.menezo.abstractfactory.apple.model.certificate.Certificate;
import br.com.menezo.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
