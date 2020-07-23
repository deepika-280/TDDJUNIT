package Tdd.epam.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Tdd.epam.tdd.removeChar1;

class RemoveAchar {

	@Test
	void CharA() {
		removeChar1 achar=new removeChar1();
		String res=achar.Remove("ABCD");
		assertEquals("BCD",res);	
	}
	
	@Test
	void CharA2() {
		removeChar1 achar=new removeChar1();
		String res=achar.Remove("AACD");
		assertEquals("CD",res);	
	}
	@Test
	void CharA3() {
		removeChar1 achar=new removeChar1();
		String res=achar.Remove("BACD");
		assertEquals("BCD",res);	
	}
	@Test
	void CharA4() {
		removeChar1 achar=new removeChar1();
		String res=achar.Remove("BBAA");
		assertEquals("BBAA",res);	
	}
	@Test
	void CharA5() {
		removeChar1 achar=new removeChar1();
		String res=achar.Remove("AABAA");
		assertEquals("BAA",res);	
	}
	@Test
	void CharA6() {
		removeChar1 achar=new removeChar1();
		String res=achar.Remove("AA");
		assertEquals("",res);	
	}


}
