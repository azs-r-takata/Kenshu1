/*
 * ------------------------------
 * 初級問題 010: 最大値の判定（3値）
 * ------------------------------
 */

public class Exercise010 {
	public static void main(String[] args) {
		int a = 3, b = 8, c = 5;
		// TODO: 最大値を表示
		if(a > b) {
			if(a > c) {
				System.out.print("最大値 : " + a);
			}
			else{
				System.out.print("最大値 : " + c);
			}
		}
		else{
			if(b > c) {
				System.out.print("最大値 : " + b);
			}
			else{
				System.out.print("最大値 : " + c);
			}
		}
	}
}
