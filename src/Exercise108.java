/*
 * ------------------------------
 * 中級問題 108: 文字列中の母音の個数を数えよ
 * 問題:
 * 文字列内に含まれる母音（a, i, u, e, o）の個数をカウントして表示するプログラムを作成せよ。
 * 大文字小文字の違いは無視すること。
 * ------------------------------
 */

public class Exercise108 {
	public static void main(String[] args) {
		String text = "education";
		// TODO: 母音の数を数えて表示
		int count = 0;
		for(int i = 0; i < text.length(); i++) { //1文字ずつ母音かどうかを確認
			if(text.substring(i, i + 1).equalsIgnoreCase("a")) {//母音であった場合countに１を足す
				count++;
			}
			else if(text.substring(i, i + 1).equalsIgnoreCase("i")) {
				count++;
			}
            else if(text.substring(i, i + 1).equalsIgnoreCase("u")) {
            	count++;
			}
            else if(text.substring(i, i + 1).equalsIgnoreCase("e")) {
            	count++;
            }
            else if(text.substring(i, i + 1).equalsIgnoreCase("o")) {
            	count++;
            }
		}
		
		System.out.println("母音の数は" + count + "です"); //結果の表示
		
	}
}
