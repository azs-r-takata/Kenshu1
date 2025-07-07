/*
 * ------------------------------
 * 中級問題 109: 配列の偶数・奇数を数えよ
 * 問題:
 * 与えられた整数配列の中に偶数がいくつ、奇数がいくつあるかを数えて表示せよ。
 * ------------------------------
 */

public class Exercise109 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6};
		// TODO: 偶数と奇数の個数を教えて表示
		int evenNumber = 0;
		int oddNumber = 0;
		
		for(int check : nums) { //要素分、偶数か奇数化を判定
			if(check % 2 == 0) { //偶数である場合
				evenNumber += 1;
			}
			else                 //奇数である場合
			{
				oddNumber += 1;
			}
		}
		
		System.out.println("偶数は" + evenNumber + "個"); //結果の表示
		System.out.println("奇数は" + oddNumber + "個");
		
	}
}
