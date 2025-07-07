/*
 * ------------------------------
 * 中級問題 105: 与えられた整数が素数かどうかを判定せよ
 * 問題:
 * 整数が素数（1と自分自身以外に約数を持たない）かどうかを判定するプログラムを作成せよ。
 * 例: 2, 3, 5, 7, 11 は素数。4, 6, 8 は素数ではない。
 * ------------------------------
 */

public class Exercise105 {
	public static void main(String[] args) {
		int number = 29;
		// TODO: 素数かどうかを判定
		boolean check = true;
		
		if(number != 0 && number != 1){ //numberが0または1出ない場合、処理を開始
			for(int i = 2; i < number; i++) { //2~number-1でnumberが割り切れないかを確認
				if(number % i != 0) {
					check = false;
				}
				else {
					check = true;
					break;
				}
			}
			
			if(check == true) { //割り切れた場合
				System.out.println("素数ではない");
			}
			else { //割り切れなかった場合
				System.out.println("素数である");
			}
		}
		else { //numberが0または1の場合、結果を出力
			System.out.println("素数ではない");
		}

		
	}
}
