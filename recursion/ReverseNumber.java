package interviewprogramm.recursion;

public class ReverseNumber {

    public static void rev(int number)
    {
        if (number < 10)
        {
            System.out.print(number);
            return;
        }
        else{
            System.out.print(number%10);
            rev(number/10);
        }

    }
    public static void main(String[] args) {
        rev(1254);
    }
}
