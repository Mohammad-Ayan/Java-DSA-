// public class Strings {
//     public static void printLetters(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         // concatenation
//         String firstName = "Shradha";
//         String lastName = "Khapra";
//         String fullName = firstName + " " + lastName;

//         printLetters(fullName);
//     }

//     }

//     // -----------------Palindrome-----------------------

//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n - 1 - i)) {
//                 // not palindrome
//                 return false;
//             }
//         }
//         return true;

//     }

//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.println(isPalindrome(str));
//     }

//     // -----------------Shortest_Path----------------------

//     public static float getShortestPath(String path) {
//         int x = 0, y = 0;

//         for (int i = 0; i < path.length(); i++) {
//             char dir = path.charAt(i); // dir: store direction - E,W,N,S

//             // east
//             if (dir == 'E') {
//                 x++;
//             }
//             // west
//             else if (dir == 'W') {
//                 x--;
//             }
//             // north
//             else if (dir == 'N') {
//                 y++;
//             }
//             // south
//             else {
//                 y--;

//             }
//         }
//         int X2 = x * x;
//         int Y2 = y * y;
//         return (float) Math.sqrt(X2 + Y2);
//     }

//     public static void main(String[] args) {
//         String path = "WNEENESENNN";
//         System.out.println(getShortestPath(path));
//     }

//     // -------------------Comparing_Strings--------------------

//     public static void main(String[] args) {
//         String s1 = "Ayan";
//         String s2 = "Ayan";
//         String s3 = new String("Ayan");

//         // if(s1 == s2){
//         // System.out.println("Strings are equal");
//         // }
//         // else{
//         // System.out.println("Strings are not equal");
//         // }
//         // if( s1 == s3){ //s3 is separate object
//         // System.out.println("Strings are equal");
//         // }
//         // else{
//         // System.out.println("Strings are not equal");
//         // }

//         if (s1.equals(s3)) {
//             System.out.println("Strings are equal");
//         } else {
//             System.out.println("Strings are not equal");
//         }
//     }
//     // --------------------Substring---------------------

//     public static String substring(String str, int si, int ei) {
//         String substr = "";
//         for (int i = si; i < ei; i++) {
//             substr += str.charAt(i);
//         }
//         return substr;
//     } // (We don't need to use the loop and all when we use --str.subtring(sI, eI)--)

//     public static void main(String[] args) {

//         // Substring
//         String str = "MohdAyan";
//         // System.out.println(substring(str, 1, 5));
//         System.out.println(str.substring(2, 5)); // java
//     }

//     // ---------------Largest string(Lexicographic)---------------

//     public static void main(String[] args) {
//         String fruits[] = { "apple", "mango", "banana" };

//         String largest = fruits[0];
//         for (int i = 0; i < fruits.length; i++) {
//             if (largest.compareTo(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }

//     // ---------------------String_Builder------------------

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder(" ");
//         for (char ch = 'a'; ch <= 'z'; ch++) {
//             sb.append(ch); // joining up
//         }
//         System.out.println(sb);
//     }

//     // //-------------------LowerCase_to_UpperCase-------------------------

//     public static String toUpperCase(String str) {
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for (int i = 1; i < str.length(); i++) {
//             if (str.charAt(i) == ' ' && i < str.length() - 1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String str = "hi i am ayan";
//         System.out.println(toUpperCase(str));
//     }

//     // --------------------String Compression----------------

//     public static String compress(String str) {
//         String newStr = "";

//         for (int i = 0; i < str.length(); i++) {
//             Integer count = 1;
//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt(i); // Add the character to the result string
//             if (count > 1) {
//                 newStr += count.toString(); // Add the count if greater than 1
//                 // count.toString()--> adds "3" after 'a', making newStr show "a3"
//             }
//         }

//         return newStr;
//     }

//     public static void main(String[] args) {
//         String str = "aaabbbbccdddd";
//         System.out.println(compress(str));
//     }

//     // --------------------Practice_Questions----------------------

//     // --Ques 1 : Count how many times lowercase vowels occurred in a String entered
//     // by the user

//     // import java.util.Arrays;

//     public static void main(String[] args) {
//         String str1 = "earth";
//         String str2 = "heart";

//         // Convert strings to lowercase for uniform comparison
//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();

//         // Check if lengths are the same
//         if (str1.length() == str2.length()) {
//             // Convert strings into char arrays
//             char[] str1charArray = str1.toCharArray();
//             char[] str2charArray = str2.toCharArray();

//             // Sort the char arrays
//             Arrays.sort(str1charArray);
//             Arrays.sort(str2charArray);

//             // Check if the sorted char arrays are identical
//             boolean result = Arrays.equals(str1charArray, str2charArray);

//             if (result) {
//                 System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
//             } else {
//                 System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
//             }
//         } else {
//             // Case when lengths are not equal
//             System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
//         }
//     }

//     // --Ques 2 : What will be the output of the following code?
//     public static void main(String args[]) {
//     String str = "ShradhaDidi";
//     String str1 = "ApnaCollege";
//     String str2 = "ShradhaDidi";
//     System.out.println(str.equals(str1) + " " + str.equals(str2));
//     }
//     // Answer: False True

//     // --Ques 3 : What will be the output of the following code?
//     public static void main(String args[]) {
//     String str = "ApnaCollege".replace("l", "");
//     System.out.println(str);
//     }
//     // Answer: ApnaCoege

//     // --Ques 4 : Determine if 2 Strings are anagrams of each other.

//     // --Ques 5 : Search and read about
//     // a. intern( ) method in String

//     When you call str.intern() on a String object, Java checks if an identical String
//     already exists in a special memory area called the String pool.
//     If the same String is found there, Java will return a reference to it instead
//     of creating a new String object. If it’s not found, it adds that String to the
//     pool.

//     // In simple words: intern() makes sure that identical String objects share the
//     // same
//     // memory space, which can help reduce memory usage when working with many
//     // similar strings.

//     // b. StringBuffer
//     //
//     StringBuffer in Java is a type of object used to create and manipulate strings
//     when you need to change or build them frequently. Unlike regular String objects,
//     which are immutable (cannot be changed once created), StringBuffer allows modifications
//     directly without creating new objects. This makes it more efficient for tasks
//     like appending, deleting, or inserting characters in a string.

// }
