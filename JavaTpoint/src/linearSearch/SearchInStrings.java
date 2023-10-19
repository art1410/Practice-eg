package linearSearch;

public class SearchInStrings {
	public static void main() {
		String name = "Atharva";
		char target = 'A';
		System.out.println(search(name, target));
	}
	static boolean search(String str, char target) {
		if(str.length()== 0) {
			return false;
		}
		return true;
	}

}