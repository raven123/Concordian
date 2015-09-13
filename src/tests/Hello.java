package tests;

public class Hello {

	 public String getGreeting(String userName){
	      return "Hello " + userName + "!";
	   }
	 
	 public int sum(int firstNumber, int secondNumber) {
	      return firstNumber + secondNumber;
	   }
	 
	 public Result split(String userName){
		
	      Result result = new Result();
	      String[] words = userName.split(" ");
	      result.setFirst(words[0]);
	      result.setLast(words[1]);
	      return result;
	   }
}
