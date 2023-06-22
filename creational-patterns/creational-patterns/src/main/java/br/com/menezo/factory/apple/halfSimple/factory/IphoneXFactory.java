package br.com.menezo.factory.apple.halfSimple.factory;

import br.com.menezo.factory.apple.halfSimple.model.IPhone;
import br.com.menezo.factory.apple.halfSimple.model.IPhoneX;
import br.com.menezo.factory.apple.halfSimple.model.IPhoneXSMax;

public class IphoneXFactory extends IPhoneFactory{

    public IPhone createIphone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX();
        }
        else if (level.equals("highEnd")) {
            return new IPhoneXSMax();
        }
        else
            return null;
    }
}
