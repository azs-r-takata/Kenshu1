/*
 * ------------------------------
 * 初級問題 013: 合計を求める（1～100）
 * ------------------------------
 */

public class Exercise013 {
	public static void main(String[] args) {
		// TODO: 1~100までの合計を表示
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
}
