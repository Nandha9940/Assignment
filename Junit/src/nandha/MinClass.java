package nandha;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinClass {
@Test
public void add(){
	JunitClass ref=new JunitClass();
	int result1=ref.add(100, 200);
	assertEquals(300,result1);
	
}
@Test
public void Concat() {
	
	JunitClass ref=new JunitClass();
	String result2=ref.concat("Nandha", "kumar");
	assertEquals("Nandhakumar",result2);
}

}

