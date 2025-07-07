/*
 * ------------------------------
 * 上級問題 202: 数の並べ替え
 * ------------------------------
 * となりあう数字をくらべて、順番が逆なら入れかえるという操作をくり返して、
 * 小さい順に並びかえるプログラムを作りましょう。
 * 何回か入れかえると、すべての数字が小さい順になります。
 */

public class Exercise202 {
	public static void main(String[] args) {
		int[] arr = {9, 3, 7, 1, 5};
		// TODO: 数字を小さい順に並べ替えて表示
		int box = 0;
		int count = 0;
		
		while(count < arr.length - 1) { //並べ替え終わるまで処理を繰り返す
			count = 0;
			
			//となりあう数字を比べて、並べ替え処理=====
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] > arr[i + 1]) {
					box = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = box;
				}
				else {
					count++;
				}
			}
			//=====End
		}
		
		for(int show : arr) {
			System.out.println(show); //結果を出力
		}
	}
}
