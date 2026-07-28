package Question13_4;

/*
 * クラス名          : Human3
 * 概要              : 人間の情報を管理するクラス
 * @author           : 玉澤一輝
 * 作成日            : 2026.5.13
 */
public class Human3 {
	//名前の情報の初期化
	private String nameInformation = null;
	//身長の情報の初期化
	private double heightInformation = 0;
	//体重の情報の初期化
	private double weightInformation = 0;
	//誕生日の情報の初期化
	private Day8 birthdayInformation;
	/**
	 * コンストラクタ         : Human3
	 * コンストラクタの説明   : 名前・身長・体重を初期化してインスタンスを生成する
	 * @param       		  : 名前、身長、体重
	 * @return			      : なし
	 * @author               : 玉澤一輝
	 * 作成日                 : 2026.5.13
	 */
	public Human3(String nameInformation, double heightInformation, double weightInformation, Day8 birthdayInformation) {
		//インスタンスの変数に代入する
		this.nameInformation = nameInformation;
		//インスタンスの変数に代入する
		this.heightInformation = heightInformation;
		//インスタンスの変数に代入する
		this.weightInformation = weightInformation;
		//インスタンスの変数に代入する
		this.birthdayInformation = new Day8(birthdayInformation);
	}

	/**
	 * 関数名           : getName
	 * メソッドの説明   : 名前のフィールド値を返却する
	 * @param 			: なし
	 * @return         	: 名前
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public String getName() {
		//名前を返却する
		return nameInformation;
	}

	/**
	 * 関数名           : getHeight
	 * メソッドの説明   : 身長のフィールド値を返却する
	 * @param 			: なし
	 * @return         	: 身長
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public double getHeight() {
		//身長を返却する
		return heightInformation;
	}

	/**
	 * 関数名           : getWeight
	 * メソッドの説明   : 体重のフィールド値を返却する
	 * @param 			: なし
	 * @return         	: 体重
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public double getWeight() {
		//体重を返却する
		return weightInformation;
	}
	/**
	 * 関数名           : getBirthDay
	 * メソッドの説明   : 誕生日のフィールド値を返却する
	 * @param 			: なし
	 * @return         	: 誕生日
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public Day8 getBirthDay() {
		//誕生日を返却する
		return new Day8 (birthdayInformation);
	}
	/**
	 * 関数名           : toString
	 * メソッドの説明   : 人間のプロフィール情報を文字列として返却する
	 * @param 			: なし
	 * @return         	: 名前、身長、体重、誕生日を含む整形済み文字列
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
	 */
	public String toString() {
		//名前、身長、体重、誕生日を整形して返却する
		return String.format("【名前：%s / 身長：%.1fcm / 体重：%.1fkg / 誕生日：%s】",
				nameInformation, heightInformation, weightInformation, birthdayInformation);
	}

	/**
	 * 関数名           : printProfile
	 * メソッドの説明   : インスタンスが持つプロパティ（名前・身長・体重）を表示する
	 * @param 			: なし
	 * @return         	: なし
	 * @author         	: 玉澤一輝
	 * 作成日           : 2026.5.13
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
