package exercise;

/**
 * リファクタリングの練習2
 *
 * @author fujimura
 */
public class Exercise2 {

    /**
     * <B>問題</B>
     * <P>条件式の意味が理解しづらい。</P>
     *
     * <B>ヒント</B>
     * <P>コメントが無ければ理解できない処理に対して、
     *  その断片を「メソッドに抽出」し、目的をあらわすような名前をつけてください。</P>
     *
     * @param year
     */
    public void pre(int year) {
        //閏年(leap year)であれば
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            //省略
        }
    }


}