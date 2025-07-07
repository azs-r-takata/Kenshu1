/*
 * ------------------------------
 * 中級問題 103: フィボナッチ数列の最初の10項を表示せよ
 * 問題:
 * フィボナッチ数列の最初の10項を出力するプログラムを作成せよ。
 * フィボナッチ数列とは、0, 1, 1, 2, 3, 5, 8... のように、前2つの数の和が次の数になる列である。
 * ------------------------------
 */

public class Exercise103 {
	public static void main(String[] args) {
        // TODO: フィボナッチ数列を表示
		int[] fiboNacci = new int[10];
		int fib1 = 0;
		int fib2 = 1;
		
		fiboNacci[0] = fib1;
		fiboNacci[1] = fib2;
		
		for(int i = 2; i < 10; i++) { //fiboNacci[2]~fiboNacci[9]の中に計算結果を代入
			fiboNacci[i] = fib1 + fib2;
			fib1 = fib2;
			fib2 = fiboNacci[i];
		}
		
		for(int show : fiboNacci) {
			System.out.println(show); //結果の表示
		}
		
    }
}
