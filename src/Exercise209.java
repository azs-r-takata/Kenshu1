/*
 * ------------------------------
 * 上級問題 209: 単語の数をかぞえる
 * ------------------------------
 * 文の中で、どの単語が何回出てきたかを数えてみましょう。
 * 単語はスペースで区切られているとします。
 * 例: "I like Java and I like coding" → I:2, like:2, Java:1...
 */

public class Exercise209 {
	public static void main(String[] args) {
		String sentence = "I like Java and I like coding";
		// TODO: 単語の出現回数を数えて表示
		int iCount = 0;
		int likeCount = 0;
		int javaCount = 0;
		int andCount = 0;
		int codingCount = 0;
		
		String[] word = sentence.split(" "); //sentenceの内容を単語に分けてword[]に格納
		
		for(String show : word) {
			if(show.equals("I")) {
				iCount++;
			}
			else if(show.equals("like")){
				likeCount++;
			}
			else if(show.equals("Java")) {
				javaCount++;
			}
			else if(show.equals("and")) {
				andCount++;
			}
			else if(show.equals("coding")) {
				codingCount++;
			}
		}
		
		System.out.print("I:" + iCount + ", ");
		System.out.print("like:" + likeCount + ", ");
		System.out.print("Java:" + javaCount + ", ");
		System.out.print("and:" + andCount + ", ");
		System.out.print("coding:" + codingCount);
	}
}
