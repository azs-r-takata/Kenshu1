/*
 * ------------------------------
 * 初級問題 019: switchで曜日表示
 * ------------------------------
 */

public class Exercise019 {
	public static void main(String[] args) {
		int day = 2;
		// TODO: switch文で「火曜日」などを表示（月:1,火:2,水:3,木:4,金:5,土:6,日:7）
		switch(day) {
		case 1 -> System.out.println("月曜日");
		case 2 -> System.out.println("火曜日");
		case 3 -> System.out.println("水曜日");
		case 4 -> System.out.println("木曜日");
		case 5 -> System.out.println("金曜日");
		case 6 -> System.out.println("土曜日");
		case 7 -> System.out.println("日曜日");
		}
	}
}
