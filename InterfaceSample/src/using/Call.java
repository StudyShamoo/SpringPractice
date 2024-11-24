package using;

import used.Calculator;
import used.SubCalc;

/**
 * インターフェース依存を確認するクラス。
 */
public class Call {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 加算クラスをインスタンス化
		Calculator calculator = new SubCalc();
		// メソッドを実行
		Integer result = calculator.calc(10, 5);
		// 結果の表示
		System.out.println("計算結果は「" + result + "」です。");
	}

}
