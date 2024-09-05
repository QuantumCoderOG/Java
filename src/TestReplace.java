package src;


import java.util.Scanner;
public class TestReplace {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        String input = scanner.nextLine();

        String output = replaceXOddNumber(input);
        System.out.println(output);
        scanner.close();

    }
    public static String replaceXOddNumber(String input){

        String[] segments = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        StringBuilder result = new StringBuilder();

        // Iterate over the segments and process the numeric ones
        for (String segment : segments) {
            if (segment.matches("\\d{2,}")) {
                // If the segment is a number and ends in 1, 3, 7, or 9, replace it with "X"
                if (segment.matches("\\d+[1379]")) {
                    result.append("X");
                } else {
                    result.append(segment);
                }
            } else {
                // If the segment is not numeric, append it as is
                result.append(segment);
            }
        }
        return result.toString();
    }
}


//In t=33.37seconds 3 of 15 will increase 12x times
//In t=X.Xseconds 3 of 15 will increase 12x times