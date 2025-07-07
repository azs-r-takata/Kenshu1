/*
 * ------------------------------
 * 上級問題 204: 数を探そう（ソートしてから探す）
 * ------------------------------
 * まず数字の配列を小さい順に並べてから、指定した数字が含まれているかを
 * すばやく探す方法（数字を半分ずつに分けながら調べる）で検索してください。
 * 結果として、「何番目にあるか」または「見つかりません」を表示しましょう。
 */

public class Exercise204 {
	public static void main(String[] args) {
		int[] arr = {12, 5, 9, 20, 1, 17};
		int target = 9;
		// TODO: 小さい順に並べてから、targetを探す
		int box = 0;
		int count = 0;
		
		int left = 0;
		int right = arr.length - 1;
		
		//並べ替え処理=====
		while(count < arr.length - 1) {
			count = 0;
			
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
			
		}
		//=====End
		
		//二分探索の処理=====
		while(left <= right) {
			int mid = left + (right - left) / 2; //中央のインデックスを代入
			
			if(arr[mid] == target) { //targetが見つかった場合
				System.out.println(mid + "番目にある"); //結果の出力
				break;
			}
			else if(arr[mid] < target) { //targetが右側にある場合
				left = mid + 1;
			}
			else {//targetが左側にある場合
				right = mid - 1;
			}
		}
		if(left > right) { //targetが見つからなかった場合
			System.out.println("含まれていない"); //結果の出力
		}
		//=====End
		
	}
}
