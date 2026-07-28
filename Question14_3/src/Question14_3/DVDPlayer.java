package Question14_3;

/**
 * クラス名         : DVDPlayer
 * 概要				: ExPlayerインタフェースを実装し、再生、停止、スロー再生を行うクラス。
 * @author 			: 玉澤 一輝
 * 作成日			: 2026.05.14
 */
public class DVDPlayer implements ExPlayer {
	/**
	 * 関数名           : play
	 * メソッドの説明   : DVDの再生を開始するメッセージを表示する
	 * @param          	: なし
	 * @return         	: なし
	 * @author        	: 玉澤 一輝
	 * 作成日           : 2026.05.14
	 */
	public void play() {
		//"■DVD再生開始！"と表示して改行する
		System.out.println("■DVD再生開始！");
	}
	/**
	 * 関数名           : stop
	 * メソッドの説明   : DVDの再生を停止するメッセージを表示する
	 * @param          	: なし
	 * @return         	: なし
	 * @author        	: 玉澤 一輝
	 * 作成日           : 2026.05.14
	 */
	public void stop() {
		//"■DVD再生終了！"と表示して改行する
		System.out.println("■DVD再生終了！");
	}
	/**
	 * 関数名           : slow
	 * メソッドの説明   : DVDのスロー再生を開始するメッセージを表示する
	 * @param          	: なし
	 * @return         	: なし
	 * @author        	: 玉澤 一輝
	 * 作成日           : 2026.05.14
	 */
	public void slow() {
		//"■DVDスロー再生開始！"と表示して改行する
		System.out.println("■DVDスロー再生開始！");
	}
}