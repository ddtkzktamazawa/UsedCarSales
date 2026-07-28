package Question12_1;

/*
 * クラス名          : Car2
 * 概要              : 車の情報を管理するクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.5.11
 */
public class Car2 {
	//名前の情報を格納する
	private String nameInformation;
	//横幅の情報を格納する
	private int widthInformation;
	//高さの情報を格納する
	private int heigthInformation;
	//長さの情報を格納する
	private int lengthInformation;
	//燃料の情報を格納する
	private double fuelInformation;
	//購入日の情報を格納する
	private Day7 purchaseDay;

	//x座標の情報を格納する
	private double xCoordinate;
	//y座標の情報を格納する
	private double yCoordinate;

	/**
	 * コンストラクタ   : Car2
	 * メソッドの説明   : 名前・幅・高さ・長さ・現在位置のx,y座標・燃料・購入日を
	 * 					　初期化してインスタンスを生成する
	 * パラメータの説明 : 名前、幅、高さ、長さ、現在位置のx,y座標、燃料、購入日
	 * 返り値			: なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.11
	 */
	public Car2(String nameInformation, int widthInformation, int heigthInformation, int lengthInformation, double fuelInformation, Day7 purchaseDay) {
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
		//購入日のコピーを作ってフィールドに保存する
		this.purchaseDay = new Day7(purchaseDay);

		//x座標の指定
		this.xCoordinate = 0.0;
		//y座標の指定
		this.yCoordinate = 0.0;
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
	 * 作成日           : 2026.5.11
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
	 * 作成日           : 2026.5.11
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
	 * 作成日           : 2026.5.11
	 */
	public int getheigth() {
		//高さの情報を返却
		return heigthInformation;
	}

	/**
	 * 関数名           : getlength
	 * メソッドの説明   : 長さのフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 長さ
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.11
	 */
	public int getlength() {
		//長さの情報を返却
		return lengthInformation;
	}

	/**
	 * 関数名           : getpurchaseDay
	 * メソッドの説明   : 購入日のフィールド値を返却する
	 * パラメータの説明 : なし
	 * 返り値           : 購入日
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.11
	 */
	public Day7 getpurchaseDay() {
		//購入日の日付を返却
		return new Day7(purchaseDay);
	}

	/**
	 * 関数名           : printSpec
	 * メソッドの説明   : インスタンスが持つプロパティ（名前・幅・高さ・長さ・購入日）を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.5.11
	 */
	public void printSpec() {
		//"名前：nameInformation"を表示して改行する
		System.out.println("名前　：" + nameInformation);
		//"車幅：widthInformation"を表示して改行する
		System.out.println("車幅　：" + widthInformation + "mm");
		//"車高：heigthInformation"を表示して改行する
		System.out.println("車高　：" + heigthInformation + "mm");
		//"車長：lengthInformation"を表示して改行する
		System.out.println("車長　：" + lengthInformation + "mm");
	}
	/**
	 * 関数名           : move
	 * メソッドの説明   : 指定された目的地までの直線距離を計算し燃料が足りれば移動処理を行う
	 * パラメータの説明 : dx、dy
	 * 返り値           : 移動に成功した場合はtrue、燃料不足で移動できない場合はfalse
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.11
	 */
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
