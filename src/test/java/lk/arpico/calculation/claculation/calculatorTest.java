package lk.arpico.calculation.claculation;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class calculatorTest {

	private static final Double DELTA=0.01;
	private Calculator calculator;
	
	@Test
	public void fetureTest() {
		String equation= "3+4*5-6";
		double expectedResult = 17;
		Calculator calculator=new Calculator();
		double actualResult =calculator.calculate(equation);
		
		assertEquals(expectedResult,actualResult,DELTA);
		System.out.println(actualResult);
	}
	
	@Before
	public void beforeEachTest() {
		calculator =new Calculator();
	}
	
	@Test
	public void whenIHaveAStringOfOneThenIGetADoubleOne() {
		String equation = "1";
		double expectedResult = 1.0;
		
		
		calculator=new Calculator();
		double actualResult =calculator.calculate(equation);
		
		assertEquals(expectedResult,actualResult,DELTA);
	}
	
	@Test
	public void whenIHaveAStringOfTwoThenIGetDoubleTwo() {
		String equation = "2";
		double expectedResult= 2.0;
		
		
		calculator=new Calculator();
		double actualResult= calculator.calculate(equation);
		
		assertEquals(expectedResult,actualResult,DELTA);
		System.out.println(actualResult);
		
	}
	
	@Test
	public void whenIHaveAStringOfOnePlusOneThenIGetADoubleTwo() {
		String equation = "1+1";
		double expectedResult = 2.0;
		
//		calculator=new Calculator();
		double actualResult=calculator.calculate(equation);
		
		assertEquals(expectedResult,actualResult,DELTA);
		System.out.println(actualResult);
	}
	
	@Test
	public void whenIHaveAStringOfOnePlusOnePlusOneThenIGetADOubleThree() {
		String equation = "1+1+1";
		double expectedResult = 3.0;
		
//		calculator=new Calculator();
		double actualResult=calculator.calculate(equation);
		
		assertEquals(expectedResult , actualResult , DELTA);
		System.out.println(actualResult);
	}
	
	@Test
	public void whenIHaveAStringOfTwoTimesTwoThenIGetADoubleFour() {
		String equation = "2+2";
		double expectedResult = 4.0;
		
//		calculator=new Calculator();
		double actualResult=calculator.calculate(equation);
		
		assertEquals(expectedResult , actualResult , DELTA);
		System.out.println(actualResult);
	}
	
	@Test
	public void whenIHaveAStringOfTwoMinusOneThenIGetDoubleOne() {
		String equation ="2-1";
		double expectedResult =0.1;
		
		double actualResult=calculator.calculate(equation);
		
		assertEquals(expectedResult , actualResult , DELTA);
		System.out.println(actualResult);
	}
}
