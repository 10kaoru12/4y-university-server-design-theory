package exercise;

public class Exercise {

	/**
	 * このメソッドをデバッグモードで実行して、
	 * バグを特定して適切に修正せよ。
	 * @param args
	 */
	public static void main(String[] args) {

		//テストの点数
		int[] scores = { 90, 80, 100, 70, 70 };

		//本来は平均点82点と算出されるべきだが、64点と算出される
		int avgScore = calcAvg(scores);
		System.out.println("平均点は" + avgScore + "点です。");

		//本来は最高点100点と算出されるべきだが、エラーとなる。
		int maxScore = findMax(scores);
		System.out.println("最高点は" + maxScore + "点です。");

	}

	/**
	 * 引数で与えられた点数の平均点を計算する。小数点以下は切り捨て。
	 * @param scores テストの点数リスト
	 * @return 平均点
	 */
	private static int calcAvg(int[] scores) {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return total / scores.length;
	}

	/**
	 * 引数で与えられた点数のうち最高点数を返す。
	 * @param scores テストの点数リスト
	 * @return 最高点数
	 */
	private static int findMax(int[] scores) {
		int max = 0;
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}

}
