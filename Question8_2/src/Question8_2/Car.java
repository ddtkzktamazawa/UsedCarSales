package Question8_2;
/*
 * クラス名          : Car
 * 概要              : 車の情報を管理するクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.28
 */
public class Car {
	private String nameInformation;
	private int widthInformation;
	private int heigthInformation;
	private int lengthInformation;
	private double xCoordinate;
	private double yCoordinate;
	private double fuelInformation;
	private int numberInformation;

	/**
	 * コンストラクタ   : Car
	 * メソッドの説明   : 名前・幅・高さ・長さ・現在位置x,x座標・燃料・ナンバーを
	 * 					　初期化してインスタンスを生成する
	 * パラメータの説明 : 名前、幅、高さ、長さ、現在位置x,x座標、燃料、ナンバー
	 * 返り値			: なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.28
	 */
	public Car(String nameInformation, int widthInformation, int heigthInformation, int lengthInformation, double xCoordinate, double yCoordinate, double fuelInformation, int numberInformation) {
		this.nameInformation = nameInformation;
		this.widthInformation = widthInformation;
		this.heigthInformation = heigthInformation;
		this.lengthInformation = lengthInformation;
		this.fuelInformation = fuelInformation;
		this.numberInformation = numberInformation;
		xCoordinate = yCoordinate = 0.0;
	}
	double getX() {return xCoordinate;}
	double getY() {return yCoordinate;}
	double getFuel() {return fuelInformation;}

	/**
	 * 関数名           : getName
	 * メソッドの説明   : 名前のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 名前
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.28
	 */
	public String getName() {
		return nameInformation;
	}

	/**
	 * 関数名           : getwidth
	 * メソッドの説明   : 幅のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 幅
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.28
	 */
	public int getwidth() {
		return widthInformation;
	}

	/**
	 * 関数名           : getheigth
	 * メソッドの説明   : 高さのフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 高さ
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.28
	 */
	public int getheigth() {
		return heigthInformation;
	}

	/**
	 * 関数名           : getweigth
	 * メソッドの説明   : 長さのフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 長さ
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.28
	 */
	public int getlength() {
		return lengthInformation;
	}

	/**
	 * 関数名           : getNumber
	 * メソッドの説明   : ナンバーのフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : ナンバー
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.28
	 */
	public int getNumber() {
		return numberInformation;
	}
	/**
	 * 関数名           : reFuel
	 * メソッドの説明   : 指定された量だけ燃料を補給する
	 * パラメータの説明 : 補給する量
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 */
	public void reFuel(double fuelInformation) {
		this.fuelInformation += fuelInformation;
		System.out.println(fuelInformation + "L 給油しました。");
	}
	/**
	 * 関数名           : printSpec
	 * メソッドの説明   : インスタンスが持つプロパティ（名前・幅・高さ・長さ・ナンバー）を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.28
	 */
	public void printSpec() {
		System.out.println("名前：" + nameInformation);
		System.out.println("車幅：" + widthInformation + "mm");
		System.out.println("車高：" + heigthInformation + "mm");
		System.out.println("車長：" + lengthInformation + "mm");
		System.out.println("ナンバー：" + numberInformation);
	}
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);
		if(dist > fuelInformation) {
			return false;
		}else {
			fuelInformation -= dist;
			xCoordinate += dx;
			yCoordinate += dy;
			return true;
		}
	}
}
