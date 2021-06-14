package exercise;

/**
 * リファクタリングの練習1
 * @author fujimura
 */
public class Exercise1 {

    /**
     * <B>問題</B>
     * <P>変数名がその用途や目的を適切に説明していない。</P>
     *
     * <B>ヒント</B>
     * <P>目的を正しく表すように、変数の名前を変更してください</P>
     *
     * @param platform
     * @param browser
     */
    public void pre(String platform, String browser){
        boolean osFlag = platform.toUpperCase().indexOf("WINDOWS") > -1;
        boolean ieFlag = browser.toUpperCase().indexOf("IE") > -1;

        //OSがWINDOWSでかつIEであれば
        if(osFlag && ieFlag){
            //省略
        }
    }


}
