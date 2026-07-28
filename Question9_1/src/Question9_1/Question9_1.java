package Question9_1;
/*
 * クラス名          : Question9_1
 * 概要              : Humanクラスの配列を生成し初期化子および代入による
 * 					   複数パターンのインスタンス動作を確認する
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.28
 */
public class Question9_1 {
	/**
	 * 関数名           : main
	 * メソッドの説明   : 生成時に要素の初期化をするものと生成後に要素に値を代入する
	 * 					  2パターンで生成しそれぞれの内容を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.04.28
	 */
	public static void main(String[] args) {
		//列の宣言と同時に中身（インスタンス）を生成して初期化
		Human[] humanBoxA = {
				//1番目の要素としてHumanインスタンスを生成
				new Human("佐藤", 173.5, 63.1),
				//2番目の要素としてHumanインスタンスを生成
				new Human("鈴木", 182.2, 68.5),
				//3番目の要素としてHumanインスタンスを生成
				new Human("高橋", 179.1, 59.8),
				//4番目の要素としてHumanインスタンスを生成
				new Human("田中", 181.1, 65.4),
				//5番目の要素としてHumanインスタンスを生成
				new Human("伊藤", 175.7, 57.3)
		};
		//humanBoxAの全要素を1つずつ変数 variableNumber に取り出して繰り返す
		for (Human variableNumber : humanBoxA) {
			//取り出したインスタンスのプロフィールを表示
			variableNumber.printProfile();
			//改行する
			System.out.println();
		}
		//Humanクラスのインスタンスを2つ格納できる配列を生成
		Human[] humanBoxB = new Human[2];
		//配列の1番目にインスタンスを生成して代入
		humanBoxB[0] = new Human("渡辺", 168.0, 55.0);
		//配列の2番目にインスタンスを生成して代入
		humanBoxB[1] = new Human("山本", 172.5, 70.2);
		//変数iが0から始めて1ずつ増やしていき要素の数繰り返す
		for (int i = 0; i < humanBoxB.length; i++) {
			//"1人目のデータ："と表示して改行する
			System.out.println((i + 1) + "人目のデータ：");
			// 配列のi番目にあるインスタンスのメソッドを呼び出す
			humanBoxB[i].printProfile();
			//改行する
			System.out.println();
		}
	}
}