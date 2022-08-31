package program;

public class Demo3 {

	public static void main(String[] args) {
		// duplicate word in array
		String str = "I Love Java, i love selenium";
		str = str.toLowerCase();
		String[] words = str.split(" ");

		int count;
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(words[i]);
			}
		}

	}

}
