package specs;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import tests.Hello;
import tests.Result;

@RunWith(ConcordionRunner.class)
public class HelloFixture {
	Hello hello = new Hello();
	public String getGreeting(String userName) {
		
		return hello.getGreeting(userName);
	}

	public int sum(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public Result split(String userName) {
		return hello.split(userName);
	}
}
