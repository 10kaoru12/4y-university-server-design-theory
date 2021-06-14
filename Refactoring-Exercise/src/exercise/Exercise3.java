package exercise;

/**
 * リファクタリングの練習3
 *
 * @author fujimura
 */
public class Exercise3 {

    /**
     * <B>問題</B>
     * <P>条件式の意味が理解しづらい。</P>
     *
     * <B>ヒント</B>
     * <P>式の結果、または部分的な結果をその目的を説明する名前を
     * つけた一時変数に代入してください（説明用変数の導入）。</P>
     *
     * @param platform
     * @param browser
     */
    public void pre(String platform, String browser) {
        if((platform.toUpperCase().indexOf("WINDOWS")>-1)&& (browser.toUpperCase().indexOf("IE")>-1)){
            //省略
        }
    }


}