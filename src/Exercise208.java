/*
 * ------------------------------
 * 上級問題 208: 階乗（1×2×3…）を使った合計の計算
 * ------------------------------
 * 1からnまでの各数の階乗（かいじょう）を出して、それらの合計も出力してください。
 * 例: 1! + 2! + 3! + ... + 5!
 */

public class Exercise208 {
	public static void main(String[] args) {
		int n = 5;
		// TODO: 各階乗とその合計を表示
		int[] ans = {1, 1, 1, 1, 1}; //各階乗の結果を入れる型
		int sum = 0; //合計を入れる型
		
		for(int i = 1; i <= n; i++) {
			if(i != n) {
				System.out.print(i + "! + ");
			}
			else {
				System.out.println(i + "!");
			}
		}
		
		for(int i = 0; i < n; i++) { //n回分、処理を行う
			int m = i + 1;
			//階乗の計算処理=====
			while(true) { 
				ans[i] = ans[i] * m;
				m--;
				if(m < 1) {
					break;
				}
			}
			//=====End
			
			System.out.println(i + 1 + "! = " + ans[i]); //結果の出力
			sum = sum + ans[i]; //合計を計算
		}
		
		System.out.println("合計 : " + sum); //結果の出力
	}
}
