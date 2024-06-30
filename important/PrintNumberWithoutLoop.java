package interviewprogramm.important;

public class PrintNumberWithoutLoop {

    public static void printNumber(int n)
    {
        if(n>=100)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }

    public static void main(String[] args) {
        printNumber(1);
    }
}
