package iterator;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.car.CarRange;
import com.car.Vehicle;
import com.vans.VanRange;


public class MainTest {
	private CarRange car;
	private VanRange van;
	
	@Before
	public void Before(){
		car  = new CarRange();
		van = new VanRange();
	}
	
	@Test
	public void TestCarRange(){
		Assert.assertEquals(car.hasNext(), true);
		Vehicle a = car.next();
		Assert.assertNotNull(a);
		Assert.assertEquals(car.hasNext(), true);
	}
	
	@Test
	public void TestVanRange(){
		Assert.assertEquals(van.hasNext(), true);
		Vehicle a = van.next();
		Assert.assertNotNull(a);
		Assert.assertEquals(van.hasNext(), true);
	}
}
