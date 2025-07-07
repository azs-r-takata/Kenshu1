/*
 * ------------------------------
 * 上級問題 203: 九九表をきれいに表示
 * ------------------------------
 * 1×1 から 9×9 までのかけ算の結果を、表の形にして出力してください。
 * 横に9列、縦に9行で、見た目もそろえて出力してみましょう。
 */

public class Exercise203 {
	public static void main(String[] args) {
		// TODO: 九九表を表のように表示
		int[][] kuku = new int[10][10]; //九九を入れる型
		
		kuku[0][0] = 99; 
		
		for(int i = 1; i < 10; i++) {
			kuku[i][0] = i;
		}
		
		for(int j = 1; j < 10; j++) {
			kuku[0][j] = j;
		}
		
		for(int i = 1; i < 10; i++) { //九九の計算結果をkuku[][]に代入
			for(int j = 1; j < 10; j++) {
				kuku[i][j] = i * j;
			}
		}
		
		for(int i = 0; i < 10; i++) { //結果を出力
			for(int j = 0; j < 10; j++) {
				if(j != 9) {
					System.out.print(kuku[i][j] + "\t");
				}
				else {
					System.out.println(kuku[i][j]);
				}
				
			}
		}
	}
}
