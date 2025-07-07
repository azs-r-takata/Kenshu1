/*
 * ------------------------------
 * 上級問題 205: アルファベットの数を数えよう
 * ------------------------------
 * 文の中に出てくるアルファベット（a～z）が、
 * それぞれ何回出てきたかを数えて表示してください。
 * 小文字と大文字は区別しなくてOKです。
 */

public class Exercise205 {
	public static void main(String[] args) {
		String text = "Programing in Java is fan!";
		// TODO: アルファベットの出現回数を表示
		int[] alfaCount = new int[26]; //各アルファベットのカウント用の型
		String[] alfa = new String[26];  //各アルファベットを入れる型
		
		for(int i = 0; i < 26;i++) { //各アルファベットをalfa[]に代入
			alfa[i] = String.valueOf((char)('a' + i)); 
		}
		
		for(int i = 0; i < 26; i++ ) { //アルファベット26文字分を処理
			for(int j = 0; j < text.length(); j++) { //textを１文字ずつ処理
				if(text.substring(j,j + 1).equalsIgnoreCase(alfa[i])) { //同じ文字かどうかを照合
					alfaCount[i]++;
				}
			}
		}
		
		System.out.println("各アルファベットの出現回数");
		for(int i = 0; i < 26; i++) {
			System.out.println(alfa[i] + " : " + alfaCount[i]); //結果の出力
		}
	}
}
