package Question7_8;
import java.util.Random;
/*
 * クラス名            :Question7_8
 * 概要                :乱数を生成し表示する
 * 作成者              :玉澤一輝
 * 作成日              :2026.4.22
 */
public class Question7_8 {
	/*
	 * 関数名           :random
	 * メソッドの説明   :第一引数が第二引数より小さければ第一引数以上第二引数未満の乱数を生成して返却し、
	 *                   第一引数が第二引数以上であれば第一引数を返却する
	 * パラメータの説明 :ランダム数1とランダム数2
	 * 返り値           :第一引数が第二引数より小さければ第一引数以上第二引数未満の乱数、
	 *                   第一引数が第二引数以上であれば第一引数
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	static int random(int firstRandom, int secondRandom) {
		//ランダムな数を入れる変数を作成
		Random randomNumber = new Random();
		//もしランダム数1がランダム数2以上の場合
		if(firstRandom >= secondRandom) {	
			//ランダム数1を返却する
			return firstRandom;
		}
		//(secondRandom - firstRandom) + firstRandom)内の乱数を計算して返却する
		return randomNumber.nextInt(secondRandom - firstRandom) + firstRandom;
	}
	/*
	 * 関数名           :main
	 * メソッドの説明   :readPlusIntメソッドの返却値を受け取る
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.22
	 */
	public static void main(String[] args) {
		//ランダムな数を入れる変数を作る
		Random randomNumber = new Random();
		//firstRandomに0-99のランダムな値を代入する
		int firstRandom = randomNumber.nextInt(100);
		//secondRandomに0-99のランダムな値を代入する
		int secondRandom = randomNumber.nextInt(100);
		//"ランダムな数：random(firstRandom, secondRandom)"表示して改行する
		System.out.println("ランダムな数：" + random(firstRandom, secondRandom));
	}
}
