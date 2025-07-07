
public class Exercise402 {
	public static void main(String[] args) {
	     int[] data = new int[120]; // 10店舗×12ヶ月

	     // サンプルデータ作成（簡易ランダム）
	     for (int i = 0; i < 120; i++) {
	         data[i] = 5000 + (i * 71) % 10000; // 5000〜14999の値
	     }
	     // TODO
	     int[] storeSum = new int[10];
	     int[] monthSum = new int[12];
	     int[] ranking = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	     double[] ratio = new double[12];
	     int total = 0;
	     int avg = 0;
	     
	     
	     String[] rank = new String[10];
	     
	     int count = 0;
	     for(int i = 0; i < 120; i += 12) {
	    	 for(int j = i; j < i + 12;j++) {
	    		 storeSum[count] += data[j];
	    	 }
	    	 total += storeSum[count];
	    	 count++;
	     }
	     
	     avg = total / 10;
	     count = 1;
	     
	     System.out.println("【年間売上】");
	     
	     for(int i = 0; i < 10; i++) {
	    	 if(storeSum[i] >= avg) {
	    		 rank[i] = "A";
	    	 }
	    	 else if(storeSum[i] >= avg / 2) {
	    		 rank[i] = "B";
	    	 }
	    	 else if(storeSum[i] < avg / 2) {
	    		 rank[i] = "C";
	    	 }
	    	 
	    	 System.out.println("店舗" + count + ": " + storeSum[i] + "円（ランク: " + rank[i] + "）");
	    	 count++;
	     }
	     System.out.println();
	     
	     System.out.println("【月別総売上と割合】");
	     count = 1;
	     for(int i = 0; i < 12; i++) {
	    	 for(int j = i; j < 120; j += 12 ) {
	    		 monthSum[i] += data[j];
	    	 }
	    	 ratio[i] = (double)monthSum[i] / (double)total * 100;
	    	 System.out.println(count + "月: " + monthSum[i] + "円（" + (int)ratio[i] + "%）");
	    	 count++;
	     }
	     System.out.println();
	     
	     int max = monthSum[0];
	     for(int i = 1; i < 12; i++) {
	    		 if(max < monthSum[i]) {
	    			 max = i;
	    	 }
	     }
	     
	     System.out.println("最も売り上げの高かった月: " + (max + 1) + "月（" + monthSum[max] + "円）");
	     System.out.println();
	     
	     System.out.println("【売上ランキング】 (降順)");
	     
	     for(int i = 0; i < 10; i++) {
	    	 for(int j = 0; j < 10 - (i + 1); j++) {
	    		 if(storeSum[j] < storeSum[j + 1]) {
	    			 int temp = storeSum[j];
	    			 int num = ranking[j];
	    			 storeSum[j] = storeSum[j + 1];
	    			 ranking[j] = ranking[j + 1];
	    			 storeSum[j + 1] = temp	;
	    			 ranking[j + 1] = num;
	    		 }
	    	 }
	     }
	     
	     for(int i = 0; i < 10; i++) {
	    	 System.out.println(i + 1 + "位: 店舗" + ranking[i] + " " + storeSum[i] + "円");
	     }
	     System.out.println();
	     
	     
	     int storeMax = storeSum[0];
	     int storeMin = storeSum[0];
	     for(int i = 1; i < 10; i++) {
	    	 if(storeMax < storeSum[i]) {
	    		 storeMax = storeSum[i];
	    	 }
	    	 
	    	 if(storeMin > storeSum[i]) {
	    		 storeMin = storeSum[i];
	    	 }
	     }
	     
	     System.out.println("平均売上: " + avg + "円");
	     System.out.println("最高売上: " + storeMax + "円");
	     System.out.println("最低売上: " + storeMin + "円");
	}
}
