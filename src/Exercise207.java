/*
 * ------------------------------
 * 上級問題 207: 3けたの水仙花数（アームストロング数）を探す
 * ------------------------------
 * 3けたの数字の中で、各けたの数字を3乗して足したものが元の数になるものを探してください。
 * 例: 153 → 1^3 + 5^3 + 3^3 = 153
 */
import java.util.ArrayList;
import java.util.List;

public class Exercise207 {
	public static void main(String[] args) {
		// TODO: 100～999の中から水仙花数を表示
		List<Integer> list = new ArrayList<>();
		
		for(int i = 100; i < 1000; i++) {
			int[] checkBox = new int[3];
			int[] check = new int[3];
			
			//各桁の数値を取得=====
			checkBox[0] = i / 100 % 10;
			checkBox[1] = i / 10 % 10;
			checkBox[2] = i % 10;
			//=====End
			
			for(int j = 0; j < 3; j++) { //各桁の3乗の結果を取得
				check[j] = checkBox[j] * checkBox[j] * checkBox[j];
			}
			
			if(i == check[0] + check[1] + check[2]) { //各桁の3乗を足した数値がもとの数値と同じか確認
				list.add(i); //同じであればリストに追加
			}
		}
		
		System.out.println("100～999の中の水仙花数"); //結果の出力
		System.out.println(list);
		
	}
}
