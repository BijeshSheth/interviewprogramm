package interviewprogramm.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindStringSubSequence {

    static List<String> al = new ArrayList<>();
    static void sub(String input, String ans)
    {
        if(input.isEmpty()){
            al.add(ans);
            return ;
        }
        sub(input.substring(1), ans+input.charAt(0));

        sub(input.substring(1), ans);
    }

    public static void main(String[] args) {
        String input = "abc";
        sub(input, "");
        System.out.println(al);
    }
}
