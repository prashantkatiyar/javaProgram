package org.pkk.CreationalPatterns.BUILDERPATTERN;

public class ChickenBurger extends Burger {
	@Override
	public float price() {
		return 50.5f;
	}

	public String name() {
		return "Chicken Burger";
	}
}