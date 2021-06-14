package answer;

/**
 * リファクタリングの練習1
 * @author fujimura
 */
public class Exercise1 {

    /**
     * 回答例：
     * @param platform
     * @param browser
     */
    public void post(String platform, String browser){
        boolean isWindows = platform.toUpperCase().indexOf("WINDOWS") > -1;
        boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;

        if(isWindows && isIEBrowser){
            //省略
        }
    }

}
