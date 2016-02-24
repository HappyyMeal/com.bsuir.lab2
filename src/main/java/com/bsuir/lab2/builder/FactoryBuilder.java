package com.bsuir.lab2.builder;

import java.util.List;

import com.bsuir.lab2.absract_factory.AbstractFactory;
import com.bsuir.lab2.model.Transport;

public class FactoryBuilder {

	private static FactoryBuilder factoryBuilder = initBuilder();

	private FactoryBuilder() {
	}

	private static FactoryBuilder initBuilder() {
		if (factoryBuilder == null)
			factoryBuilder = new FactoryBuilder();

		return factoryBuilder;
	}

	public static FactoryBuilder getInstance() {
		return factoryBuilder;
	}

	public List<Transport> build(AbstractFactory factory) {
		return factory.create();
	}
}
