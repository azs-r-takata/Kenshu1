/*
 * ------------------------------
 * 中級問題 104: 文字列が回文かどうかを判定せよ
 * 問題:
 * 文字列が前から読んでも後ろから読んでも同じかどうかを判定し、結果を表示するプログラムを作成せよ。
 * 例: "level" → 回文, "hello" → 回文ではない
 * ------------------------------
 */

public class Exercise104 {
	public static void main(String[] args) {
		String word = "level";
		// TODO: 回文かどうかを判定
		int wordLength = word.length(); //wordの文字数を取得
		
		boolean check = false;
		int j = 0;
		
		for(int i = 1; i <= wordLength / 2; i++) { //文字の両端から順に同じ文字であるか照合
			j = i - 1;
			
			if(word.substring(j, i).equals(word.substring(wordLength - i, wordLength - j))) {
				check = true;
			}
			else 
			{
				check = false;
				break;
			}
		}
		
		if(check == true) {
			System.out.println("回文である"); //結果の表示
		}
		else
		{
			System.out.println("回文ではない"); //結果の表示
		}
	}
}
