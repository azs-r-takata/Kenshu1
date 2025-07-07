/*
 * ------------------------------
 * 初級問題 011: 1～10を表示（for）
 * ------------------------------
 */

public class Exercise011 {
	public static void main(String[] args) {
		// TODO: for文とifで偶数のみ表示
		int[] number = new int[20];
		int count = 0;
		
		for(int i =0; i < 20; i++) {
			int n = i + 1;
			if(n % 2 == 0) {
				number[count] = n;
				count++;
			}
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(number[i]);
		}
		
	}
}
