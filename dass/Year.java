package dass;

public class Year {
	public boolean isYear(int n) {
		boolean result = false;
		if (n <= 0) {
			result = false;
		}else if(n % 400 == 0) {
			result = true; 
		}else if (n % 100 == 0) {
			result = false;
		}else if (n % 4 == 0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
