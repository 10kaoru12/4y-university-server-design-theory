package exercise;

/**
 * リファクタリングの練習5
 *
 * @author fujimura
 */
public class Exercise5 {

    /**
     * <B>問題</B>
     * <P>条件分岐が入れ子になっていて処理の流れが不明瞭</P>
     *
     * <B>ヒント</B>
     * <P>まず、「メソッドの抽出」を行ったあと、抽出したメソッドの出口を
     * 複数にすることで、「一時変数を削除」してください。</P>
     * <P>つぎに、「ガード節による入れ子条件の記述の置き換え」を行い、
     * 入れ子になってい条件分岐を削除してください。</P>
     *
     * @param number
     */
    public void pre(String number) {

        //AnswerNumberかどうかを判定する
        boolean isAnswerNumber = false;
        if (number == null) {
            isAnswerNumber = false;
        } else {
            if (number.length() == 4) {
                if (number.getBytes().length == 4) {
                    isAnswerNumber = true;
                } else {
                    isAnswerNumber = false;
                }
            } else {
                isAnswerNumber = false;
            }
        }

        if (!isAnswerNumber){
            System.out.println("Answer is incorrect...");
        }
    }


}