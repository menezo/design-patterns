package br.com.menezo.factory.apple.halfSimple.factory;

import br.com.menezo.factory.apple.halfSimple.model.IPhone;
import br.com.menezo.factory.apple.halfSimple.model.IPhone11;
import br.com.menezo.factory.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory{

    public IPhone createIphone(String level) {
        if (level.equals("standard")) {
            return new IPhone11();
        }
        else if (level.equals("highEnd")) {
            return new IPhone11Pro();
        }
        else
            return null;
    }
}
