package answer;

/**
 * リファクタリングの練習2
 *
 * @author fujimura
 */
public class Exercise2 {

    /**
     * 回答例:
     */
    public void post(int year) {
        if (isLeapYear(year)) {
            //省略
        }
    }

    /**
     * 閏年(leap year)かどうかを判定するメソッド
     * @param year 判定する年
     * @return 閏年ならtrue
     */
    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}