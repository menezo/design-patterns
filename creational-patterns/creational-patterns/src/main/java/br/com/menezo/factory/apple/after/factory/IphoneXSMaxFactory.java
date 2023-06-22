package br.com.menezo.factory.apple.after.factory;

import br.com.menezo.factory.apple.after.model.IPhone;
import br.com.menezo.factory.apple.after.model.IPhoneXSMax;

public class IphoneXSMaxFactory extends IPhoneFactory{
    @Override
    protected IPhone createIphone() {
        return new IPhoneXSMax();
    }
}
