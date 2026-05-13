package Question12_1;

/*
 * クラス名          : ExCar
 * 概要              : 自動車クラス Car（第2版）から派生したクラス
 * 					   総走行距離の管理機能を追加している
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.05.11
 */
public class ExCar extends Car2 {
	//総走行距離の情報を格納する
	private double totalMileage;

	/**
	 * コンストラクタ名   	  : ExCar
	 * コンストラクタの説明   : 車の名前、サイズ、燃料、購入日を初期化し、
	 * 							「総走行距離を用いて親クラスのコンストラクタを呼び出し
	 * 							基本情報を設定した後、自クラスのフィールドを初期化する
	 * パラメータ       	  : 名前、幅、高さ、長さ、燃料、購入日
	 * 返り値           	  : なし
	 * 作成者           	  : 玉澤一輝
	 * 作成日           	  : 2026.05.11
	 */
	public ExCar(String name, int width, int height, int length, double fuel, Day7 purchaseDay) {
		//親クラスのコンストラクタを呼び出す
		super(name, width, height, length, fuel, purchaseDay);
		//総走行距離を0.0で新しく作成する
		this.totalMileage = 0.0;
	}

	/**
	 * メソッド名       : getTotalMileage
	 * メソッドの説明   : 総走行距離を返却する
	 * パラメータ       : なし
	 * 返り値           : 総走行距離
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.11
	 */
	public double getTotalMileage() {
		//totalMileageを返却する
		return totalMileage;
	}
	/**
	 * メソッド名       : move
	 * メソッドの説明   : 指定された距離を移動し、成功した場合は総走行距離を加算する
	 * パラメータ       : dx、dy
	 * 返り値           : 移動成功ならtrue、燃料不足ならfalse
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.05.11
	 */
	@Override
	public boolean move(double dx, double dy) {
		//moveメソッドを呼び出す
		boolean success = super.move(dx, dy);
		//もし移動に成功した場合
		if (success) {
			//移動距離（直線距離）を計算する
			double distanceTraveled = Math.sqrt(dx * dx + dy * dy);
			//総走行距離を更新する
			totalMileage += distanceTraveled;
		}
		//移動の結果を返却する
		return success; 
	}
}