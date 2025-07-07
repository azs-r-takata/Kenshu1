/*
 * ------------------------------
 * 中級問題 110: 2つの数の最大公約数（GCD）を求めよ
 * 問題:
 * ユークリッドの互除法を使って、2つの整数の最大公約数を求めるプログラムを作成せよ。
 * 例: 36と24 → 最大公約数は12
 * ------------------------------
 */

public class Exercise110 {
	public static void main(String[] args) {
		int a = 36, b = 24;
		// TODO: 最大公約数を求めて表示
		int change = 0;
		int ans = 0;
		
		while(true) { //ユークリッドの互除法を使用
			if(a % b != 0) {
				change = a % b;
				a = b;
				b = change;
			}
			else { //計算の余りが出ない場合に答えを入力
				ans = b; //答えを代入
				break;
			}
		}
		
		System.out.println("最大公約数は" + ans); //結果の表示
	}
}
