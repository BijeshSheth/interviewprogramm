package interviewprogramm.recursion;

public class PalindromeNumberDemo {

    public static int rev(int input){

        int result = 0;
        int rem;
        while(input>0){
            rem = input%10;
            result= (result * 10) + rem;
            input = input/10;
        }
        return result;
    }

    public static void main(String[] args) {

        int input = 51155;
        int rev = rev(input);

        if(input == rev){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
