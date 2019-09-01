import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * create at 2019/09/01
 * 罗马数字转换为汉字，letcode第13题
 *
 * @author zhy
 */
public class RomanNumerals {
    public static int romanToInt(String s) {
        Map<Character, Integer> nums = new HashMap<>();
        nums.put('I', 1);
        nums.put('V', 5);
        nums.put('X', 10);
        nums.put('L', 50);
        nums.put('C', 100);
        nums.put('D', 500);
        nums.put('M', 1000);
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && nums.get(chars[i]) < nums.get(chars[i + 1])) {
                result -= nums.get(chars[i]);
            } else
                result += nums.get(chars[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
