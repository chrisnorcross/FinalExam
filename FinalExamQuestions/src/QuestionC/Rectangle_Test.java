package QuestionC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Rectangle_Test {


	@Test(expected = IllegalRectangle.class)
	public void Rectangle_Test1() throws IllegalRectangle{ 
			Rectangle r2 = new Rectangle(-5, -10);


	}
	
	@Test
	public void Rectangle_Test2() {
		
	
		Rectangle r2 = null;
		try {
			r2 = new Rectangle(5, 10);
		} catch (IllegalRectangle e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(r2.ComputeArea() == 50);
	}
	

}
