/*
 * ------------------------------
 * 中級問題 102: 成績に応じてランクを表示せよ
 * 問題:
 * 整数の点数（0〜100）が与えられている。
 * 点数に応じて以下のようにランクを表示せよ。
 * A: 90以上、B: 80以上、C: 70以上、D: 60以上、F: 60未満
 * ------------------------------
 */

public class Exercise102 {
	public static void main(String[] args) {
        int score = 85;
        // TODO: ランクを表示する
        if(score >= 90) {      //90点以上は下記の処理を行う
        	System.out.println("スコア : A");
        }
        else if(score >= 80){ //80点以上90点未満は下記の処理を行う
        	System.out.println("スコア : B");
        }
        else if(score >= 70){ //70点以上80点未満は下記の処理を行う
        	System.out.println("スコア : C");
        }
        else if(score >= 60){ //60点以上70点未満は下記の処理を行う
        	System.out.println("スコア : D");
        }
        else{                 //60点未満は下記の処理を行う
        	System.out.println("スコア : F");
        }
    }
}
