package CodExamples;

public class ProgramToRemoveAllWhitespaces {
    public static void main(String[] arg){
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence is: " + sentence);

        sentence = sentence.replaceAll("\\s+", "");
        System.out.println("New sentence is " + sentence);
    }
}
