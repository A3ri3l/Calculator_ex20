import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorDivideTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testDivideSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the division method with: "+ firstNumber +" and " + secondNumber + " ("+result+")");
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testDivideWithZero() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0.123456789;
		
		
		
		LOG.info("Testing the division method with: "+ firstNumber +" and " + secondNumber + " ("+result+")");
		assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result),1);
		
		for (int i = 0; i < 200; i++) {
		// random / 0
		firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
		secondNumber = 0;
		result = 0.123456789;
		
		LOG.info("Testing the division method with: "+ firstNumber +" and " + secondNumber + " ("+result+")");
		assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result),1);
		
		// 0 / random
		firstNumber = 0;
		secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
		result = firstNumber / secondNumber;
		
		LOG.info("Testing the division method with: "+ firstNumber +" and " + secondNumber + " ("+result+")");
		assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result),1);
		}
		
	}

}
