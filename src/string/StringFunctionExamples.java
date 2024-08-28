package src.string;

public class StringFunctionExamples {
    public static void main(String[] args) {

        // 1. charAt(int index)
        String str1 = "Hello, World!";
        char ch = str1.charAt(7);
        System.out.println("Character at index 7: " + ch); // Output: W
        System.out.println();

        // 2. length()
        String str2 = "Hello, World!";
        int length = str2.length();
        System.out.println("Length of the string: " + length); // Output: 13
        System.out.println();

        // 3. substring(int beginIndex) and substring(int beginIndex, int endIndex)
        String str3 = "Hello, World!";
        String sub1 = str3.substring(7); // From index 7 to the end
        String sub2 = str3.substring(0, 5); // From index 0 to 5 (exclusive)
        System.out.println("Substring from index 7: " + sub1); // Output: World!
        System.out.println("Substring from index 0 to 5: " + sub2); // Output: Hello
        System.out.println();

        // 4. indexOf(String str) and indexOf(String str, int fromIndex)
        String str4 = "Hello, World!";
        int index1 = str4.indexOf("World");
        int index2 = str4.indexOf("o", 5); // Start search from index 5
        System.out.println("Index of 'World': " + index1); // Output: 7
        System.out.println("Index of 'o' after index 5: " + index2); // Output: 8
        System.out.println();

        // 5. equals(Object obj) and equalsIgnoreCase(String anotherString)
        String str5a = "Hello";
        String str5b = "hello";
        boolean result1 = str5a.equals(str5b); // Case-sensitive comparison
        boolean result2 = str5a.equalsIgnoreCase(str5b); // Case-insensitive comparison
        System.out.println("str5a equals str5b: " + result1); // Output: false
        System.out.println("str5a equalsIgnoreCase str5b: " + result2); // Output: true
        System.out.println();

        // 6. replace(CharSequence target, CharSequence replacement)
        String str6 = "Hello, World!";
        String replacedStr = str6.replace("World", "Java");
        System.out.println("Replaced string: " + replacedStr); // Output: Hello, Java!
        System.out.println();

        // 7. toLowerCase() and toUpperCase()
        String str7 = "Hello, World!";
        String lowerStr = str7.toLowerCase();
        String upperStr = str7.toUpperCase();
        System.out.println("Lowercase: " + lowerStr); // Output: hello, world!
        System.out.println("Uppercase: " + upperStr); // Output: HELLO, WORLD!
        System.out.println();

        // 8. trim()
        String str8 = "   Hello, World!   ";
        String trimmedStr = str8.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'"); // Output: 'Hello, World!'
        System.out.println();

        // 9. split(String regex) and split(String regex, int limit)
        String str9 = "apple,banana,orange";
        String[] fruits = str9.split(",");
        System.out.println("Split string:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Output:
        // apple
        // banana
        // orange
        System.out.println();

        // 10. join(CharSequence delimiter, CharSequence... elements)
        String joinedStr = String.join("-", "2024", "08", "28");
        System.out.println("Joined string: " + joinedStr); // Output: 2024-08-28
        System.out.println();

        // 11. contains(CharSequence s)
        String str11 = "Hello, World!";
        boolean containsHello = str11.contains("Hello");
        boolean containsJava = str11.contains("Java");
        System.out.println("Contains 'Hello': " + containsHello); // Output: true
        System.out.println("Contains 'Java': " + containsJava); // Output: false
        System.out.println();

        // 12. startsWith(String prefix) and endsWith(String suffix)
        String str12 = "Hello, World!";
        boolean startsWithHello = str12.startsWith("Hello");
        boolean endsWithWorld = str12.endsWith("World!");
        System.out.println("Starts with 'Hello': " + startsWithHello); // Output: true
        System.out.println("Ends with 'World!': " + endsWithWorld); // Output: true
        System.out.println();

        // 13. compareTo(String anotherString) and compareToIgnoreCase(String str)
        String str13a = "apple";
        String str13b = "banana";
        int result13 = str13a.compareTo(str13b);
        System.out.println("Comparison result: " + result13); // Output: -1 (apple is lexicographically less than banana)
        System.out.println();

        // 14. isEmpty() and isBlank()
        String str14a = "";
        String str14b = "   ";
        String str14c = "Hello";

        System.out.println("str14a is empty: " + str14a.isEmpty()); // Output: true
        System.out.println("str14b is blank: " + str14b.isBlank()); // Output: true
        System.out.println("str14c is empty: " + str14c.isEmpty()); // Output: false
        System.out.println("str14c is blank: " + str14c.isBlank()); // Output: false
        System.out.println();
    }
}
