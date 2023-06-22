package br.com.menezo.factory.apple.after.factory;

import br.com.menezo.factory.apple.after.model.IPhone;
import br.com.menezo.factory.apple.after.model.IPhoneX;

public class IphoneXFactory extends IPhoneFactory {
    @Override
    public IPhone createIphone() {
        return new IPhoneX();
    }
}
