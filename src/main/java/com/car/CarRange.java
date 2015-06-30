package com.car;

import java.util.ArrayList;
import java.util.List;

import com.engine.StandardEngine;
import com.engine.TurboEngine;
import com.iterator.Iterator;

public class CarRange implements Iterator<Vehicle>{
	private List<Vehicle> cars;
	private int indice;
	
	public CarRange(){
		indice = 0;
		cars = new ArrayList<Vehicle>();
		cars.add(new Saloon(new StandardEngine(1300)));
		cars.add(new Saloon(new StandardEngine(1600)));
		cars.add(new Coupe(new StandardEngine(2600)));
		cars.add(new Sport(new TurboEngine(2500)));
	}
	
	public List<Vehicle> getRange(){
		return cars;
	}

	// ========= ITERATOR ==========
	
	public boolean hasNext() {
		return indice < cars.size();
	}

	public Vehicle next() {
		Vehicle next = cars.get(indice);
		indice++;
		return next;
	}

	public void remove() {
		cars.remove(indice-1);
	}
}
