package Telestra;

public class CapitalizeWords {
    public static void main(String args[]){
        System.out.println(capitalize("Hello world"));
    }
    public static String capitalize(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder resultString = new StringBuilder();
        for(String word : words){
            if(!word.isEmpty())
            resultString.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
          return resultString.toString().trim();
    }
}
