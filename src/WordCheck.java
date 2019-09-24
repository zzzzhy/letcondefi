import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class WordCheck {

    private Stack<Character> stack1;
    private Stack<Character> stack2;

    public WordCheck() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public String CheckWord(String word) {
        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!stack1.isEmpty()) {
                if (!stack2.isEmpty()) {
                    if (c == stack2.peek()) {
                        indexs.add(i);
                    } else {
                        stack1.clear();
                        stack2.clear();
                    }
                }
                if (stack1.size() == 2) {
                    if (c == stack1.peek()) {
                        indexs.add(i);
                    } else {
                        stack2.push(c);
                    }
                }
                if (stack1.size() == 1) {
                    if (c != stack1.peek()) {
                        stack1.pop();
                    }
                    stack1.push(c);
                }
            }else {
                stack1.push(c);
            }
        }
        char[] cs = word.toCharArray();
        for(int i : indexs){
            cs[i] = ' ';
        }
        return  String.valueOf(cs).replaceAll(" ","");
    }

    public static void main(String[] args) {
        WordCheck wordCheck = new WordCheck();
        System.out.println(wordCheck.CheckWord("AABB"));
    }

}
