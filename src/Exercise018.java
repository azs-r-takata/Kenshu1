/*
 * ------------------------------
 * 初級問題 018: 配列の合計（while）
 * ------------------------------
 */

public class Exercise018 {
	public static void main(String[] args) {
		int[] data = {1, 3, 5, 7};
		// TODO: while文で合計を計算
		int i = 0;
		int sum = 0;
		while(i < 4) {
			sum += data[i];
			i++;
		}
		System.out.print(sum);
	}
}
