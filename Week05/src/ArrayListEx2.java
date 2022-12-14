import java.util.*;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter name >> ");
			String s = sc.next();
			a.add(s);
		}
		
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;
			}
		}
		System.out.println("\nThe longest name : " + a.get(longestIndex) );
		sc.close();
	}
}
