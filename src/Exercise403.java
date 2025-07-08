
public class Exercise403 {
	public static void main(String[] args) {
        int[] data = new int[100 * 3]; // 最大100件分
        int recordCount = 60; // 実データ数（例）

        // 仮のサンプルデータ（ドライバー1〜10）
        for (int i = 0; i < recordCount; i++) {
            data[i * 3] = (i % 10) + 1; // ドライバーID
            data[i * 3 + 1] = 5 + (i * 7) % 26; // 距離5〜30km
            data[i * 3 + 2] = 1 + (i % 3); // サイズ1〜3
        }
        // TODO
        int[] driverSum = new int[10];
        int[] ranking = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        int avg = 0;
        
        //各ドライバーの報酬を計算=====
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j <recordCount; j++) {
            	int size = 0;
            	
            	if(data[j * 3] == i + 1) {
            		switch(data[j * 3 + 2]) {
            		    case 1 -> size = 0;
            		    case 2 -> size = 300;
            		    case 3 -> size = 600;
            		}
            		
            		driverSum[i] += data[j * 3 + 1] * 100 + size;
            	}
            	
            }
        	total += driverSum[i]; //全体合計の計算
        }
        //=====End
        
        avg = total / 10; //全体平均の計算
        
        //ドライバー別報酬一覧の出力・最高報酬、最低報酬の検出=====
        System.out.println("【ドライバー別報酬一覧】");
        int max = driverSum[0];
        int min = driverSum[0];
        for(int i = 0; i < 10; i++) {
        	if(driverSum[i] > avg) {
        		System.out.println("ドライバー" + (i + 1) + ": " + driverSum[i] + "円 ★"); // 平均報酬より高ければ★を付ける
        	}
        	else {
        		System.out.println("ドライバー" + (i + 1) + ": " + driverSum[i] + "円");
        	}
        	
        	if(max < driverSum[i]) {
        		max = driverSum[i];
        	}
        	
        	if(min > driverSum[i]) {
        		min = driverSum[i];
        	}
        }
        System.out.println();
        //=====End
        
        //各項目の結果出力=====
        System.out.println("全体報酬合計: " + total + "円");
        System.out.println("平均報酬: " + avg + "円");
        System.out.println("最高報酬: " + max + "円");
        System.out.println("最低報酬: " + min + "円");
        System.out.println();
        //=====End
        
        //ランキングの出力=====
        System.out.println("【報酬ランキング】");
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < 10 - (i + 1); j++) {
        		if(driverSum[j] < driverSum[j + 1]) {
        			int temp = driverSum[j];
        			int num = ranking[j];
        			driverSum[j] = driverSum[j + 1];
        			ranking[j] = ranking[j + 1];
        			driverSum[j + 1] = temp;
        			ranking[j + 1] = num;
        		}
        	}
        }
        
        for(int i = 0; i < 10; i++) {
        	System.out.println((i + 1) + "位: ドライバー" + ranking[i] + " " + driverSum[i] + "円");
        }
        //=====End
	}
}
