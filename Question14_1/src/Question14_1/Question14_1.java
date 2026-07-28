package Question14_1;

/**
 * クラス名     : ShapeTester
 * 概要			: Shape3を継承した各図形クラスのインスタンスを生成し
 * 				  描画と面積計算の動作を確認するテスト用プログラム
 * @author  	: 玉澤 一輝
 * 作成日		: 2026.05.13
 */
public class Question14_1 {
	/**
	 * 関数名           : main
	 * メソッドの説明	: 長方形と平行四辺形のインスタンスを生成し
	 * 					  情報の表示、図形の描画、面積の出力を行う
	 * @param 			: なし
	 * @return 			: なし
	 * @author 			: 玉澤 一輝
	 * 作成日			: 2026.05.13
	 */
	public static void main(String[] args) {

		//図形クラスの配列を作成する
		Shape3[] shapeNumber = {
				//幅5、高さ3の長方形
				new Rectangle2(5, 3),
				//幅6、高さ4の平行四辺形
				new Parallelogram(6, 4)
		};
		//各図形に対して順に処理を実行する
		for (Shape3 s : shapeNumber) {
			//print()メソッドを呼び出す
			s.print();
			//インタフェースPlane2Dを実装していれば
			if (s instanceof Plane2D) {
				//確認して面積を表示する
				Plane2D p = (Plane2D) s;
				//"面積はp.getArea()です。"と表示して改行する
				System.out.println("面積は" + p.getArea() + "です。\n");
			}
		}
	}
}