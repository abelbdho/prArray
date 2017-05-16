package prArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArray {

	@Test
	public void size0(){
		ArrayAsociativo a = new ArrayAsociativo();
		assertTrue(0 == a.size());
		System.gc();
	}

}
