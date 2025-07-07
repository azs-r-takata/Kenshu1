/*
 * ------------------------------
 * 上級問題 201: 素因数分解
 * ------------------------------
 * 整数を、かけ算で元の数になる「素数の組み合わせ」に分解してください。
 * たとえば 84 は 2 × 2 × 3 × 7 です。
 */

public class Exercise201 {
	public static void main(String[] args) {
		int number = 84;
		// TODO: 素因数分解して結果を表示
		int[] prime = {2, 3, 5, 7, 11, 13, 17, 19};
		int[] nums = new int[50];
		int count = 0;
		boolean check = false;
		
		while(check == false) {
			for(int split : prime) {
				if(number % split == 0) {
					number = number / split;
					nums[count] = split;
					break;
				}
			}
			
			for(int i = 2; i < number; i++) { //2~number-1でnumberが割り切れないかを確認
				if(number % i != 0) {
					check = true;
				}
				else {
					check = false;
					break;
				}
			}
			count++;
		}
		nums[count] = number;
		
		for(int i = 0; i < count + 1; i++) {
			System.out.print(nums[i]);
			if(i < count) {
				System.out.print(" x ");
			}
		}
	}
}
