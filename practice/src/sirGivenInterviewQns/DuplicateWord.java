package sirGivenInterviewQns;

public class DuplicateWord {
	//Duplicates in a String?
	public static void main(String[] args) {

		String str = "Big black bug bit a big black dog on his big black nose";

		String[] words = str.split("\\s");
		int len = words.length;
		int count;

		for (int i = 1; i < len; i++) {
			count = 1;
			for (int j = i + 1; j < len; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					count++;
					words[j] = "0";
				}

			}

			if (count > 1 && words[i] != "0") {
				System.out.println(words[i]);
			}
		}

	}

}
