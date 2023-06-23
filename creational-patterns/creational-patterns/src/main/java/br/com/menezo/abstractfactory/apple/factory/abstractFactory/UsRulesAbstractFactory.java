package br.com.menezo.abstractfactory.apple.factory.abstractFactory;

import br.com.menezo.abstractfactory.apple.model.certificate.Certificate;
import br.com.menezo.abstractfactory.apple.model.certificate.USCertificate;
import br.com.menezo.abstractfactory.apple.model.packing.Packing;
import br.com.menezo.abstractfactory.apple.model.packing.USPacking;

public class UsRulesAbstractFactory implements CountryRulesAbstractFactory{

    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
