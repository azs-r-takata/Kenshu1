/*
 * ------------------------------
 * 中級問題 107: 累積和の配列を作成せよ
 * 問題:
 * 元の配列から累積和の配列を作成せよ。
 * 累積和とは、各インデックスでそれまでの合計を格納した配列である。
 * 例: {1, 2, 3} → {1, 3, 6}
 * ------------------------------
 */

public class Exercise107 {
	public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        // TODO: 累積和の配列を作成して表示
        int[] cumSum = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) { //要素分、累積和の処理を行う
        	for(int j = 0; j < i + 1; j++) { 
        		cumSum[i] += nums[j];
        	}
        }
        
        for(int show : cumSum) {
        	System.out.println(show); //結果の表示
        }
    }
}
