
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
        
	}
}
