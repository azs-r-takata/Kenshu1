/*
 * ------------------------------
 * 上級問題 210: 複数の配列から共通する値を抽出する
 * ------------------------------
 * 与えられた複数の配列（例：3つ）からすべてに共通して存在する値だけを抽出し、昇順で表示
 */
import java.util.ArrayList;
import java.util.List;

public class Exercise210 {
	public static void main(String[] args) {
		int[] a = {2, 3, 5, 7, 11, 13};
		int[] b = {1, 3, 7, 13, 17};
		int[] c = {0, 3, 6, 7, 13};
		// TODO: 共通する値を昇順で表示
		List<Integer> checkList = new ArrayList<>(); //a[]とb[]の共通の値を入れる型
		List<Integer> ansList = new ArrayList<>();   //a[]とb[]とc[]の共通の値を入れる型
		
		//a[]とb[]の共通の値を抽出=====
		for(int check1 : a) {
			for(int check2 : b) {
				if(check1 == check2) {
					checkList.add(check1);
				}
			}
		}
		//=====End
		
		//a[]とb[]とc[]の共通の値を抽出=====
		for(int check1 : checkList) {
			for(int check2 : c) {
				if(check1 == check2) {
					ansList.add(check1);
				}
			}
		}
		//=====End
		
		System.out.println(ansList); //結果の出力
	}
}
