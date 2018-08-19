import static org.junit.Assert.*;

import org.junit.Test;


import com.nissan.training.AddtionServlet;

public class TestAll {

	AddtionServlet f=new AddtionServlet();
	@Test
	public void int_ast_Test() {
		String num1="3";
		String num2="!";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void float_3_12__4_13_Test() {
		String num1="3.12";
		String num2="4.13";
		assertEquals("7.25",f.Add(num1,num2));
		
	}
	@Test
	public void int_at_Test() {

		String num1="@";
		String num2="4.13";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void int_0_9999__1_Test() {

		String num1="0.9999";
		String num2="1";
		assertEquals("1.9999",f.Add(num1,num2));
		
	}
	@Test
	public void int__Test() {
		
		String num1="_";
		String num2="1";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void float_0_001__0_000001_Test() {
		
		String num1="0.001";
		String num2="0.000001";
		assertEquals("0.001001",f.Add(num1,num2));
		
	}
	@Test
	public void int_plus_Test() {
		
		String num1="1";
		String num2="+";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void float_amb_Test() {

		String num1="&";
		String num2="0.001";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void float_greaterthan_Test() {
		
		String num1=">";
		String num2="3.0";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void int_slash_Test() {
		String num1="1";
		String num2="/";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void int_colon_Test() {
		
		String num1="8";
		String num2=":";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void int_semi_colon_Test() {
	
		String num1="8";
		String num2=";";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void braces_Test() {
		
		String num1="(";
		String num2="}";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void mod_Test() {
		
		String num1="2";
		String num2="%";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void string_Test() {
		
		String num1="hello";
		String num2="1";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void empty_Test() {
		
		String num1="";
		String num2="1";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
		
	}
	@Test
	public void null_Test() {
		
		String num1=null; String num2="1";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
	}
	@Test
	public void qn_Test() {
		
		String num1="2"; String num2="?";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
	}
	@Test
	public void hypen_Test() {

		String num1="-";  String num2="1";
		assertEquals("Only numerals allowed!!",f.Add(num1,num2));
	}
}
