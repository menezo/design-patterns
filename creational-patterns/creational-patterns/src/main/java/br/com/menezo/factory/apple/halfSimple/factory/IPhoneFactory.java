package br.com.menezo.factory.apple.halfSimple.factory;

import br.com.menezo.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIphone(String level) {
        IPhone device = null;

        device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone(String level);
}
