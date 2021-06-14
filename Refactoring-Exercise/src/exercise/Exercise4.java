package exercise;

/**
 * リファクタリングの練習4
 *
 * @author fujimura
 */
public class Exercise4 {

    /**
     * <B>問題</B>
     * <P>制御用変数があるために、処理の流れが複雑になっている。</P>
     *
     * <B>ヒント</B>
     * <P>まず、「メソッドの抽出」を行ったあと、抽出したメソッドの出口を
     * 複数にすることで、「制御フラグを削除」してください。</P>
     */
    public void pre() {

        String[] languages = {"C", "C++", "Java", "Perl"};

        //文字配列の要素にオブジェクト指向プログラム言語が
        //含まれているか判定する
        boolean found = false;
        for (int i = 0; i < languages.length; i++) {
            if (languages[i].indexOf("Java") > -1) {
                found = true;
                break;
            }
            if (languages[i].indexOf("C++") > -1) {
                found = true;
                break;
            }
         }

        //オブジェクト指向プログラム言語ならメッセージを出力
        if (found){
            System.out.println("OOP language Found...");
        }
    }

}