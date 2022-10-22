package interviewprogramm.recursion;

public class ReverseString {

    public static String rev(String str)
    {
        if (str.isEmpty())
        {
           // System.out.print(str);
            return str;
        }
        else{
            return rev(str.substring(1)) + str.charAt(0);
        }

    }
    public static void main(String[] args) {
        System.out.println(rev("Bijesh"));
    }
}
