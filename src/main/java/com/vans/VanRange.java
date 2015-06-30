package com.vans;

import com.car.Vehicle;
import com.engine.StandardEngine;
import com.engine.TurboEngine;
import com.iterator.Iterator;

public class VanRange implements Iterator<Vehicle>{
	private Vehicle[] vans;
	private int indice;
	
	public VanRange(){
		indice = 0;
		vans = new Vehicle[3];
		
		vans[0] = new BoxVan(new StandardEngine(1600));
		vans[1] = new BoxVan(new StandardEngine(2000));
		vans[2] = new Pickup(new TurboEngine(2200));
	}
	
	public Vehicle[] getRange(){
		return vans;
	}

	public boolean hasNext() {
		while(indice < vans.length){
			if(vans[indice] != null)
				return true;
			indice++;
		}	
		return false;
	}

	public Vehicle next() {
		Vehicle next = null;
		while(indice < vans.length){
			if(vans[indice] != null){
				next =  vans[indice];
				break;
			}
			indice++;
		}	
		indice++;
		return next;
	}

	public void remove() {
		vans[indice-1] = null;
	}

}
