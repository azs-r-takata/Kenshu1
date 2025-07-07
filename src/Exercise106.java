/*
 * ------------------------------
 * 中級問題 106: 配列を逆順に表示せよ
 * 問題:
 * 与えられた配列の要素を逆順に並べて出力するプログラムを作成せよ。
 * 例: {1, 2, 3, 4} → 4 3 2 1
 * ------------------------------
 */

public class Exercise106 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		// TODO: 要素を逆順で出力
		int box = 0;
		
		for(int i = 0; i < nums.length; i++) { //要素分大きさを比べて並べ替え
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] < nums[j]) {
					box = nums[i];
					nums[i] = nums[j];
					nums[j] = box; 
				}
			}
		}
		
		for(int show : nums) {
			System.out.println(show); //結果の表示
		}
	}
}
