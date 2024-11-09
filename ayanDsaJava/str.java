public class str {
    // public static String compress(String str) {
    //     String newStr = "";
    
    //     for (int i = 0; i < str.length(); i++) {
    //         Integer count = 1;
    //         while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    //             count++;
    //             i++;
    //         }
    //         newStr += str.charAt(i);     // Add the character to the result string
    //         if (count > 1) {
    //             newStr += count.toString(); // Add the count if greater than 1
    //         }
    //     }
    
    //     return newStr;
    // }
    
    // public static void main(String[] args) {
    //     String str = "aaabbbbccdddd";
    //     System.out.println(compress(str));
    // }




    // public static void main(String args[]) {
    //     String str = "ShradhaDidi";
    //     String str1 = "ApnaCollege";
    //     String str2 = "ShradhaDidi";
    //     System.out.println(str.equals(str1) + " " + str.equals(str2));
    // }

    
        public static void main(String args[]) {
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);
        }
        
        
}

