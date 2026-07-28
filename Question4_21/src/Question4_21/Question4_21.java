package Question4_21;
/*
 * クラス名:Question4_21
 * 概要    :読み込んだ数の段で左上、右下、右上側が直角の直角三角形を表示する
 * 作成者  :玉澤一輝
 * 作成日  :2026.4.14
 */
public class Question4_21 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :読み込んだ数の段で左上、右下、右上側が直角の直角三角形を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :玉澤一輝
	 * 作成日           :2026.4.14
	 */
	public static void main(String[] args) {
		/*左上側が直角の場合
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数stageNumberの初期化
		int stageNumber = 0;
		//実行する
		do {
			//"整数値："と表示する
			System.out.print("整数値：");
			//stageNumberに数を読み込む
			stageNumber = standardInput.nextInt();
			//入力した数が0以下ならばdo文を再実行する
		}while(stageNumber <= 0);
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= stageNumber; i++) {
			//変数jを入力した数から始めて1つずつ減らしながら入力した数の回数ループ本体を繰り返す
			for(int j = stageNumber; i <= j; j--)
				//"*"と表示する
				System.out.print('*');
			//改行する
			System.out.println();
		}
		}*/

		/*右下側が直角の場合
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数stageNumberの初期化
		int stageNumber = 0;
		//実行する
		do {
			//"整数値："と表示する
			System.out.print("整数値：");
			//stageNumberに数を読み込む
			stageNumber = standardInput.nextInt();
			//入力した数が0以下ならばdo文を再実行する
		}while(stageNumber <= 0);
		//変数iを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 1; i <= stageNumber; i++) {
			//変数jを1から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
			for(int j = 1; j <= stageNumber; j++)
				//もし入力した数-iがj以上の場合
				if(stageNumber - i >= j ) {
					//" "と表示する
					System.out.print(" ");
					//その他の場合
				}else {
					//"*"と表示する
					System.out.print('*');
				}
			//改行する	
			System.out.println();
		}
		}*/

		/*右上側が直角の場合
		//キーボードから読み込みを行う
		Scanner standardInput = new Scanner(System.in);
		//変数stageNumberの初期化
		int stageNumber = 0;
		//実行する
		do {
			//"整数値："と表示する
			System.out.print("整数値：");
			//stageNumberに数を読み込む
			stageNumber = standardInput.nextInt();
			//入力した数が0以下ならばdo文を再実行する
		}while(stageNumber <= 0);
		//変数iを0から始めて1つずつ増やしながら入力した数の回数ループ本体を繰り返す
		for(int i = 0; i <= stageNumber; i++) {
			//変数jを1から始めて1つずつ増やしながら入力した数までループ本体を繰り返す
			for(int j = 1; j <= stageNumber; j++)
				//もしiがj以上の場合
				if( i >= j ) {
					//" "と表示する
					System.out.print(" ");
					//その他の場合
				}else {
					//"*"と表示する
					System.out.print('*');
				}
			//改行する
			System.out.println();
		}
		}*/
	}}
