package Assignmentmockito.mockito;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class calcimplementaionTest extends TestCase {
	
	calcimplementaion obj;
	int a,b;
	protected void setUp() throws Exception {
		obj=new calcimplementaion();
		a=12;
		b=6;
		calinterface mockObj=mock(calinterface.class);
		when(mockObj.add(a,b)).thenReturn(a+b);
		obj.setIntObj(mockObj);
		
		when(mockObj.subtract(a,b)).thenReturn(a-b);
		obj.setIntObj(mockObj);
		
		when(mockObj.multiply(a,b)).thenReturn(a*b);
		obj.setIntObj(mockObj);
		
		when(mockObj.divide(a,b)).thenReturn(a/b);
		obj.setIntObj(mockObj);
		
	}
     public void testAddTwoNums() {
    	 assertEquals(18,obj.AddTwoNums(a,b));
	
}
     
    	 	public void  testSubTwoNums() {
    	 		 assertEquals(6,obj.SubTwoNums(a,b));
    	 		
    	 	}

    	 	
    	 	public void testmultiplyTwoNums() {
    	 		 assertEquals(72,obj.multiplyTwoNums(a,b));
    	 		 
    	 	}
    	 	public void testdivideTwoNums(){
    	 		assertEquals(2,obj.divideTwoNums(a,b));
    	 	}
    	 	
	protected void tearDown() throws Exception {
		obj=null;
		a=0;
		b=0;
		
	
	}

}
