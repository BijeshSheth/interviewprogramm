package interviewprogramm.recursion;

public class PalindromeStringDemo {

    public static void main(String[] args) {

        String s = "acbbcaa";

        StringBuilder sb = new StringBuilder(s);

        if(s.equals(sb.reverse().toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
