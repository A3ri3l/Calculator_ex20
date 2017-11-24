import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorSubtractTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testSubtractSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the subtract method with: "+ firstNumber +" and " + secondNumber + " ("+result+")");
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the subtract method with: "+ firstNumber +" and " + secondNumber + " ("+result+")");
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the subtract method with: "+ firstNumber +" and " + secondNumber + " ("+result+")");
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(-10)));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the subtract method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(-100)));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the subtract method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*(-1000)));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the subtract method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		}
	}
	
	@Test
	public void testSubtractZeros() {
		//0 - 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber - secondNumber;
			
			LOG.info("Testing the subtract method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
			
		for(int i = 0;i<200;i++) {	
		//0 - random
		firstNumber = 0;
		secondNumber = Double.valueOf(df.format(random.nextDouble()*(1000)));
		result = firstNumber - secondNumber;
			
			LOG.info("Testing the subtract method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);	
			
		//random - 0
		firstNumber = Double.valueOf(df.format(random.nextDouble()*(1000)));;
		secondNumber = 0;
		result = firstNumber - secondNumber;
				
			LOG.info("Testing the subtract method with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result),1);
		}	
					
	}
	
	
}
