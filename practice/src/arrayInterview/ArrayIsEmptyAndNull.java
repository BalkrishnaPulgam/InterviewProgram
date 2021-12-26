package arrayInterview;

public class ArrayIsEmptyAndNull {

	public static boolean IsEmpty(String[] str) {
		if (str == null) {
			return true;
		} else if (str.length == 0) {
			return true;
		} else {
			for (String aa : str) {
				if (aa != null) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String[] str = null;
		if (IsEmpty(str)) {
			System.out.println("arr is empty.");
		} else {
			System.out.println("arr is not empty.");
		}

		String[] str1 = {};
		if (IsEmpty(str1)) {
			System.out.println("arr is empty.");
		} else {
			System.out.println("arr is not empty.");
		}

		String[] str2 = { "Banana" };
		if (IsEmpty(str2)) {
			System.out.println("arr is empty.");
		} else {
			System.out.println("arr is not empty.");
		}
	}

}
