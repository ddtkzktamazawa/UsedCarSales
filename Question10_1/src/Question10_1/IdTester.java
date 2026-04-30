package Question10_1;
/*
 * クラス名          : IdTester
 * 概要              : Idクラスの動作を確認するテストクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.30
 */
public class IdTester {
	/**
	 * 関数名           : main
	 * メソッドの説明   : Idクラスのインスタンスを複数生成し識別番号および
	 *                    最後に発行された識別番号を表示する
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.30
	 */
	public static void main(String[] args) {
		//変数identificationNumber1にインスタンスを生成して代入
		Id identificationNumber1 = new Id();
		//変数identificationNumber2にインスタンスを生成して代入
		Id identificationNumber2 = new Id();
		//"aの識別番号：identificationNumber1.getId()"を表示して改行する
		System.out.println("aの識別番号：" + identificationNumber1.getId());
		//"bの識別番号：identificationNumber2.getId()"を表示して改行する
		System.out.println("bの識別番号：" + identificationNumber2.getId());
		//"Id.counter = (今までの識別番号)"を表示して改行する
		System.out.println("Id.counter = " + Id.counter);
		//"a.counter  = identificationNumber1.counter"を表示して改行する
		System.out.println("a.counter  = " + identificationNumber1.counter);
		//"b.counter  = identificationNumber2.counter"を表示して改行する
		System.out.println("b.counter  = " + identificationNumber2.counter);
		//"最後に与えた識別番号：Id.getMaxId()"を表示して改行する
		System.out.println("最後に与えた識別番号：" + Id.getMaxId());

		//改行する
		System.out.println();

		//変数identificationNumber3にインスタンスを生成して代入
		Id identificationNumber3 = new Id();
		//変数identificationNumber4にインスタンスを生成して代入
		Id identificationNumber4 = new Id();
		//"cの識別番号：identificationNumber3.getId()"を表示して改行する
		System.out.println("cの識別番号：" + identificationNumber3.getId());
		//"dの識別番号：identificationNumber4.getId()"を表示して改行する
		System.out.println("dの識別番号：" + identificationNumber4.getId());
		//"Id.counter = (今までの識別番号)"を表示して改行する
		System.out.println("Id.counter = " + Id.counter);
		//"c.counter  = identificationNumber3.counter"を表示して改行する
		System.out.println("c.counter  = " + identificationNumber3.counter);
		//"d.counter  = identificationNumber4.counter"を表示して改行する
		System.out.println("d.counter  = " + identificationNumber4.counter);
		//"最後に与えた識別番号：Id.getMaxId()"を表示して改行する
		System.out.println("最後に与えた識別番号：" + Id.getMaxId());

	}
}