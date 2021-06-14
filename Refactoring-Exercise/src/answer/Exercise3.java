package answer;

/**
 * リファクタリングの練習3
 *
 * @author fujimura
 */
public class Exercise3 {


    /**
     * 回答例：
     */
    public void post(String platform, String browser) {
        boolean isWindows = platform.toUpperCase().indexOf("WINDOWS")>-1;
        boolean isIEBrowser = browser.toUpperCase().indexOf("IE")>01;

        if(isWindows&& isIEBrowser){
            //省略
        }
    }

}