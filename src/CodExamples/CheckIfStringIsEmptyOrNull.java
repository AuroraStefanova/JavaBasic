package CodExamples;

public class CheckIfStringIsEmptyOrNull {
    public static void main(String[] arg){

        String str1 = null;
        String str2 = "тттт";
        String str3 = "";
        System.out.println("String is: " + isNullOrEmpty(str1));
        System.out.println("String is: " + isNullOrEmpty(str2));
        System.out.println("String is: " + isNullOrEmpty(str3));

    }

    public static String isNullOrEmpty(String str){
        if(str == null){
            return "Null";
        }
        else if(str.isEmpty()){
            return  "Empty";
        }
        else {
            return "String is not Empty or Null";
        }
    }
}
