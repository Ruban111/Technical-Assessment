package Telestra;

public class LongestWord {
    public static void main(String[] args) {
        System.out.println(findLongestWord("Some linee with text"));
    }

    public static String findLongestWord(String sentence){
        String longestWord = "";

        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            if(words[i].length() > longestWord.length())
            longestWord = words[i];
        }

        return longestWord;
    }
}
