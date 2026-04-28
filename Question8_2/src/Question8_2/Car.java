package Question8_2;
/*
 * クラス名          : Car
 * 概要              : 車の情報を管理するクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.4.28
 */
public class Car {
	//名前の情報を格納
	private String nameInformation;
	//横幅の情報を格納
	private int widthInformation;
	//高さの情報を格納
	private int heigthInformation;
	//長さの情報を格納
	private int lengthInformation;
	//x座標の情報を格納
	private double xCoordinate;
	//y座標の情報を格納
	private double yCoordinate;
	//燃料の情報を格納
	private double fuelInformation;
	//ナンバーの情報を格納
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
		//フィールドと引数が同名のためthisを使ってインスタンス変数に代入
		this.nameInformation = nameInformation;
		//フィールドと引数が同名のためthisを使ってインスタンス変数に代入
		this.widthInformation = widthInformation;
		//フィールドと引数が同名のためthisを使ってインスタンス変数に代入
		this.heigthInformation = heigthInformation;
		//フィールドと引数が同名のためthisを使ってインスタンス変数に代入
		this.lengthInformation = lengthInformation;
		//フィールドと引数が同名のためthisを使ってインスタンス変数に代入
		this.fuelInformation = fuelInformation;
		//フィールドと引数が同名のためthisを使ってインスタンス変数に代入
		this.numberInformation = numberInformation;
		//x,y座標の指定
		xCoordinate = yCoordinate = 0.0;
	}
	//x座標を取得する
	double getX() {return xCoordinate;}
	//y座標を取得する
	double getY() {return yCoordinate;}
	//燃料量を取得する
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
		//名前情報を返却
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
		//幅の情報を返却
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
		//高さの情報を返却
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
		//長さの情報を返却
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
		//ナンバーの情報を返却
		return numberInformation;
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
		//"名前：nameInformation"を表示して改行する
		System.out.println("名前：" + nameInformation);
		//"車幅：widthInformation"を表示して改行する
		System.out.println("車幅：" + widthInformation + "mm");
		//"車高：heigthInformation"を表示して改行する
		System.out.println("車高：" + heigthInformation + "mm");
		//"車長：lengthInformation"を表示して改行する
		System.out.println("車長：" + lengthInformation + "mm");
		//"ナンバー：numberInformation"を表示して改行する
		System.out.println("ナンバー：" + numberInformation);
	}
	boolean move(double dx, double dy) {
		//移動距離（直線距離）を計算する
		double distValue = Math.sqrt(dx * dx + dy * dy);
		//もしdistValueがfuelInformationよりも大きい場合
		if(distValue > fuelInformation) {
			//falseを返却
			return false;
			//その他の場合
		}else {
			//fuelInformationからdistValueを引く
			fuelInformation -= distValue;
			//xCoordinateにdxを加える
			xCoordinate += dx;
			//yCoordinateにdyを加える
			yCoordinate += dy;
			//trueを返却
			return true;
		}
	}
}
