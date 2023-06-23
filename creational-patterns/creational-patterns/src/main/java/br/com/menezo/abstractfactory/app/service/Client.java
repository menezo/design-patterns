package br.com.menezo.abstractfactory.app.service;

import br.com.menezo.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.menezo.abstractfactory.app.service.factory.RestApiAbstractFactory;
import br.com.menezo.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.menezo.abstractfactory.app.service.services.CarService;
import br.com.menezo.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {

		ServicesAbstractFactory ejbFactory = new EJBAbstractFactory();
		ServicesAbstractFactory restFactory = new RestApiAbstractFactory();

		UserService userService1 = ejbFactory.getUserService();
		userService1.save("John");
		userService1.delete(5);

		CarService carService1 = ejbFactory.getCarService();
		carService1.save("Prius");
		carService1.update("Tesla X");

		UserService userService2 = restFactory.getUserService();
		userService2.save("Allan");
		userService2.delete(10);

		CarService carService2 = restFactory.getCarService();
		carService2.save("Palio");
		carService2.update("Gol");

	}
}
