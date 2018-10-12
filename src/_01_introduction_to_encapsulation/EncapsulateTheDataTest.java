package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
	EncapsulateTheData etd = new EncapsulateTheData();
	@Test
	void test() {
		
		etd.setItemsRecieved(5);
		assertEquals(etd.getItemsRecieved(), 5);
		System.out.println(etd.getItemsRecieved());
		//fail("Not yet implemented");
		
		etd.setDegreesTurned(0);
		assertEquals(etd.getDegreesTurned(), 0);
		
		etd.setNomenClature("hello");
		assertEquals(etd.getNomenclature(), "hello");
		
		Object h = new Object();
		etd.setmemberObj(h);
		assertEquals(etd.getmemberObj(), h);
		
	}

}
