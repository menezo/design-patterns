package br.com.menezo.abstractfactory.app.service.factory;

import br.com.menezo.abstractfactory.app.service.services.CarRestApiService;
import br.com.menezo.abstractfactory.app.service.services.CarService;
import br.com.menezo.abstractfactory.app.service.services.UserRestApiService;
import br.com.menezo.abstractfactory.app.service.services.UserService;

public class RestApiAbstractFactory implements ServicesAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }
}
