package unit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junittestone {

	@Test
	void addtest() {
		Unitclass u=new Unitclass();
		int result= u.add(2, 3);
	   assertEquals(5,result);
	   
	   String str5=null;
	   
	   int[] a1= {1,2,3,4};
	   int[] a2= {1,2,3,4};
	   assertSame(5,result);
	   assertNotSame(6,result);
	   assertNotNull(result);
	   assertNull(str5);
	   assertArrayEquals(a1,a2);
	   assertTrue(4<result);
	   

	   
	   
	   
	}

}
