package br.com.menezo.factory.apple.after.factory;

import br.com.menezo.factory.apple.after.model.IPhone;
import br.com.menezo.factory.apple.after.model.IPhone11;

public class Iphone11Factory extends IPhoneFactory{
    @Override
    protected IPhone createIphone() {
        return new IPhone11();
    }
}
