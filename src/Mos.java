/**
 * create at 2019/09/01
 * 回文数判定
 *
 * @author zhy
 */
public class Mos {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int endNum = 0;
        int startNum = x;
        while (x != 0) {
            endNum = endNum * 10 + x % 10;
            x /= 10;
        }
        if (endNum == startNum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }


}
