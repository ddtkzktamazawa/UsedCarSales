package Question10_2;
/*
 * クラス名          : Question10_2
 * 概要              : ExIdクラスの増分変更機能を検証するテストクラス
 * 作成者            : 玉澤一輝
 * 作成日            : 2026.04.30
 */
public class ExIdTester {
	/**
	 * 関数名           : main
	 * メソッドの説明   : ExIdクラスのインスタンスを生成し増分値の変更が
	 *                    生成されるインスタンスの識別番号に正しく反映されるかの検証
	 * パラメータの説明 : なし
	 * 返り値           : なし
	 * 作成者           : 玉澤一輝
	 * 作成日           : 2026.4.30
	 */
	public static void main(String[] args) {

		//変数identificationNumber1にインスタンスを生成して代入
		ExId identificationNumber1 = new ExId();
		//変数identificationNumber2にインスタンスを生成して代入
		ExId identificationNumber2 = new ExId();
		//変数identificationNumber3にインスタンスを生成して代入
		ExId identificationNumber3 = new ExId();
		//"aの識別番号：identificationNumber1.getId()"を表示して改行する
		System.out.println("aの識別番号：" + identificationNumber1.getId());
		//"bの識別番号：identificationNumber2.getId()"を表示して改行する
		System.out.println("bの識別番号：" + identificationNumber2.getId());
		//"cの識別番号：identificationNumber3.getId()"を表示して改行する
		System.out.println("cの識別番号：" + identificationNumber3.getId());

		//識別番号の増分値を4に設定する
		ExId.setspecifiedIncrement(4);
		//"--- 増分をExId.getspecifiedIncrement()に変更しました ---"を表示して改行する
		System.out.println("--- 増分を " + ExId.getspecifiedIncrement() + " に変更しました ---");

		//変数identificationNumber4にインスタンスを生成して代入
		ExId identificationNumber4 = new ExId();
		//変数identificationNumber5にインスタンスを生成して代入
		ExId identificationNumber5 = new ExId();
		//変数identificationNumber6にインスタンスを生成して代入
		ExId identificationNumber6 = new ExId();
		//"dの識別番号：identificationNumber4.getId()"を表示して改行する
		System.out.println("dの識別番号：" + identificationNumber4.getId());
		//"dの識別番号：identificationNumber5.getId()"を表示して改行する
		System.out.println("eの識別番号：" + identificationNumber5.getId());
		//"dの識別番号：identificationNumber6.getId()"を表示して改行する
		System.out.println("fの識別番号：" + identificationNumber6.getId());
		//"最後に与えた識別番号：Id.getMaxId()"を表示して改行する
		System.out.println("最後に与えた識別番号：" + ExId.getMaxId());
	}
}