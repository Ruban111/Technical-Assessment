package Telestra;

/*
Longest Word
Programming challenge description:
In this challenge you need to find the longest word in a sentence. If the sentence has more than one word of the same length you should pick the one that appears first.
Input:
Your program should read lines from standard input. Each line has one or more words. Each word is separated by a space char.
Output:
Print the longest word in the sentence.
Test 1
Test Input
Download Test 1 Input
some line with text
Expected Output
Download Test 1 Output
some
Test 2
Test Input
Download Test 2 Input
another line
Expected Output
Download Test 2 Output
another
 */

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
