package br.com.menezo.prototype.functionalCloneBuilder;

import br.com.menezo.prototype.functionalCloneBuilder.model.Address;
import br.com.menezo.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		System.out.println(user);
	}
}