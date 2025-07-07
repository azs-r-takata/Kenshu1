/*
 * ------------------------------
 * 上級問題 206: アナグラム（文字の並べかえ）を判定
 * ------------------------------
 * 2つの単語が同じ文字を使っていれば「アナグラム」と呼ばれます。
 * たとえば "listen" と "silent" は文字の順番がちがうだけで同じ文字です。
 * そういう関係かどうかを調べてみましょう。
 */
import java.util.Arrays;

public class Exercise206 {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		// TODO: アナグラムかどうか判定
		char[] chars1 = str1.toCharArray(); //文字列を文字配列に変換
		char[] chars2 = str2.toCharArray();
		
		Arrays.sort(chars1); //文字をアルファベット順に並べ替え
		Arrays.sort(chars2);
		
		String sorted1 = new String(chars1); //文字配列を文字列に変換
		String sorted2 = new String(chars2);
		
		if(sorted1.equals(sorted2)) { //アナグラムであるか判断
			System.out.println("アナグラムです"); //結果の出力
		}
		else {
			System.out.println("アナグラムではありません");//結果の出力
		}
	}
}
