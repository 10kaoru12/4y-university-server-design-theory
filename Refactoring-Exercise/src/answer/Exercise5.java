package answer;

/**
 * リファクタリングの練習5
 *
 * @author fujimura
 */
public class Exercise5 {

    /**
     * 回答例：
     */
    public void post(String number) {
        if (!isAnswerNumber(number)){
            System.out.println("Answer is incorrect...");
        }
    }

    /**
     * AnswerNumberかどうかを判定する
     * @param number
     * @return AnswerNumberならtrue
     */
    private boolean isAnswerNumber(String number) {
        if (number == null) {
            return false;
        }
        if (number.length() != 4) {
            return false;
        }
        if (number.getBytes().length != 4) {
            return false;
        }
        return true;
    }
}