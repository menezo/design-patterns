package br.com.menezo.factory.apple.after.factory;

import br.com.menezo.factory.apple.after.model.IPhone;
import br.com.menezo.factory.apple.after.model.IPhone11Pro;

public class Iphone11ProFactory extends IPhoneFactory{
    @Override
    protected IPhone createIphone() {
        return new IPhone11Pro();
    }
}
