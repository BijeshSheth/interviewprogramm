package interviewprogramm.nagaro;

public class DynamicVariableNameChange {

    public static String camelToSnake(String input) {
        StringBuilder result = new StringBuilder();
        char[] ch = input.toCharArray();
        for(char c : ch){
            if(Character.isUpperCase(c)){
                result.append("_").append(Character.toLowerCase(c));
            }
            else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static String snakeToCamel(String input) {
        StringBuilder result = new StringBuilder();
        char[] ch = input.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            if(ch[i] == '_'){
                result.append(Character.toUpperCase(ch[i+1]));
                i++;
            }
            else {
                result.append(ch[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String str1 = "thisIsJava";
        String str2 = "this_is_java";

        System.out.println(camelToSnake(str1));
        System.out.println(snakeToCamel(str2));
    }
}
