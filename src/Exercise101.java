/*
 * ------------------------------
 * 中級問題 101: 配列の最大値とインデックスを求めよ
 * 問題:
 * 整数の配列が与えられている。最大値とそのインデックス（最初に現れる位置）を表示するプログラムを作成せよ。
 * 例: {4, 8, 1, 6, 3} → 最大値: 8, インデックス: 1
 * ------------------------------
 */

public class Exercise101 {
	public static void main(String[] args) {
		int[] nums = {4, 8 ,1, 6, 3};
		// TODO: 最大値とインデックスを求めて表示
		int max = 0;
		int index = 0;
		int count = 0;
		
		for(int compare : nums) { //配列の要素分を繰り返し
			if(max < compare){ //最大値であればmaxに代入、現在のインデックスのカウント数をindexに代入
				max = compare;
				index = count;
			}
			count++; //インデックスのカウント
		}
		
		System.out.println("最大値 : " + max + " インデックス : " + index); //結果の表示
	}
}
