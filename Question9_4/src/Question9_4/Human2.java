package Question9_4;
/*
 * クラス名          : Human2
 * 概要              : 人間の情報を管理するクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.29
 */
public class Human2 {
	//名前の情報の初期化
	private String nameInformation = null;
	//身長の情報の初期化
	private double heightInformation = 0;
	//体重の情報の初期化
	private double weightInformation = 0;
	//誕生日の情報の初期化
	private Day3 birthdayInformation;
	/**
	 * コンストラクタ         : Human2
	 * コンストラクタの説明   : 名前・身長・体重を初期化してインスタンスを生成する
	 * パラメータの説明       : 名前、身長、体重
	 * 返り値			      : なし
	 * 作成者                 : 玉澤一輝
	 * 作成日                 : 2026.4.29
	 */
	public Human2(String nameInformation, double heightInformation, double weightInformation, Day3 birthdayInformation) {
		//インスタンスの変数に代入する
		this.nameInformation = nameInformation;
		//インスタンスの変数に代入する
		this.heightInformation = heightInformation;
		//インスタンスの変数に代入する
		this.weightInformation = weightInformation;
		//インスタンスの変数に代入する
		this.birthdayInformation = new Day3(birthdayInformation);
	}

	/**
	 * 関数名           : getName
	 * メソッドの説明   : 名前のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 名前
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public String getName() {
		//名前を返却する
		return nameInformation;
	}

	/**
	 * 関数名           : getHeight
	 * メソッドの説明   : 身長のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 身長
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public double getHeight() {
		//身長を返却する
		return heightInformation;
	}

	/**
	 * 関数名           : getWeight
	 * メソッドの説明   : 体重のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 体重
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public double getWeight() {
		//体重を返却する
		return weightInformation;
	}
	/**
	 * 関数名           : getBirthDay
	 * メソッドの説明   : 誕生日のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 誕生日
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public Day3 getBirthDay() {
		//誕生日を返却する
		return new Day3 (birthdayInformation);
	}
	/**
	 * 関数名           : toString
	 * メソッドの説明   : 人間のプロフィール情報を文字列として返却する
	 * パラメータの説明 : なし
	 * 返り値           : 名前、身長、体重、誕生日を含む整形済み文字列
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public String toString() {
		//名前、身長、体重、誕生日を整形して返却する
		return String.format("【名前：%s / 身長：%.1fcm / 体重：%.1fkg / 誕生日：%s】",
				nameInformation, heightInformation, weightInformation, birthdayInformation);
	}

	/**
	 * 関数名           : printProfile
	 * メソッドの説明   : インスタンスが持つプロパティ（名前・身長・体重）を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.29
	 */
	public void printProfile() {
		//もし名前がnullと一致、または身長、体重が0以下の場合
		if (nameInformation == null || heightInformation <= 0 || weightInformation <= 0) {
			// プログラムを終了して不正な配列作成をしない
			System.out.println("データが不完全なため、プロフィールを表示できません。");
			//返却する
			return;
		}
		//"名前：(nameInformation)"を表示して改行する
		System.out.println("名前　：" + nameInformation);
		//"身長：(heightInformation)cm"を表示して改行する
		System.out.println("身長　：" + heightInformation + "cm");
		//"体重：(weightInformation)kg"を表示して改行する
		System.out.println("体重　：" + weightInformation + "kg");
		//"誕生日：(birthdayInformation)"を表示して改行する
		System.out.println("誕生日：" + birthdayInformation);
	}
}
