package Telestra;

/************************************************************************************************************************************************************************************************
Multiply Lists
Programming challenge description:
You have 2 lists of positive integers. Write a program which multiplies corresponding elements in these lists.
Input:
Your program should read lines from standard input. Each line contains two space-delimited lists. The lists are separated with a pipe char (|). Both lists have the same length, in range [1, 10]. Each element in the lists is a number in range [0, 99].
Output:
Print the multiplied list.
Test 1
Test Input
Download Test 1 Input
9 0 6 | 15 14 9
Expected Output
Download Test 1 Output
135 0 54
*************************************************************************************************************************************************************************************************/

public class MultiplyLists {
    public static void main(String args[]) {
        System.out.println(mutiplyList("9 0 6 | 15 14 9"));
    }

    public static String mutiplyList(String list) {

        String[] lists = list.split(" \\| ");
        String[] list1 = lists[0].split(" ");
        String[] list2 = lists[1].split(" ");
        int[] result = new int[list1.length];
        for (int i = 0; i < list1.length; i++) {
            result[i] = Integer.parseInt(list1[i]) * Integer.parseInt(list2[i]);
        }

        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            resultString.append(result[i]);
            if (i < result.length - 1) {
                resultString.append(" ");
            }
        }

        return resultString.toString();
    }
}