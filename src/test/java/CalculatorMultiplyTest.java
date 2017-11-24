import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorMultiplyTest {
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
	
}
