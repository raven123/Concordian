package utilities;

/**
 * @author ravrai
 *
 */
public class Enums {

	public enum BrowserType {

		FIREFOX, CHROME, IE;
	}
	
	public enum ORType {

		ELEMENTS,APP;
	}

	public enum TimeOutInSeconds {

		ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(
				7), EIGHT(8), NINE(9), TEN(1), FIFTEEN(15), TWENTY(
				2), THIRTY(3), SIXTY(6);

		private int time;

		private TimeOutInSeconds(int timeInMilliSeconds) {
			time = timeInMilliSeconds;
		}

		public int toInt() {
			return time;
		}

	}

}
