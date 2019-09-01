/**
 * create at 2019/09/01
 * 找出公共前缀，letcode第14题
 *
 * @author zhy
 */
public class CommonStartStr {
    public static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        String pre = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
                if(pre.isEmpty()){
                    return "";
                }
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(strs[0].indexOf("a"));
        System.out.println(longestCommonPrefix(strs));
    }
}
