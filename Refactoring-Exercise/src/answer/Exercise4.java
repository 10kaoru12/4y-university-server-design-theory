package answer;

/**
 * リファクタリングの練習4
 *
 * @author fujimura
 */
public class Exercise4 {

    /**
     * 回答例：
     */
    public void post() {

        String[] languages = {"C", "C++", "Java", "Perl"};
        if (hasOOPLanguage(languages)){
            System.out.println("OOP language Found...");
        }
    }

    /**
     * 文字配列の要素にオブジェクト指向プログラム言語が
     * 含まれているか判定する
     * @param languages プログラム言語の配列
     * @return 文字配列の要素にオブジェクト指向プログラム言語が含まれていればtrue
     */
    private boolean hasOOPLanguage(String[] languages) {
        for (int i = 0; i < languages.length; i++) {
            if (languages[i].indexOf("Java") > -1) {
                return true;
            }
            if (languages[i].indexOf("C++") > -1) {
                return true;
            }
         }
        return false;
    }
}