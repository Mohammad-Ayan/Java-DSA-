public class Strings {
    // public static void printLetters(String str){
    // for(int i = 0; i<str.length(); i++){
    // System.out.print(str.charAt(i)+" ");
    // }
    // System.out.println();
    // }
    // public static void main(String[] args) {
    // //concatenation
    // String firstName = "Shradha";
    // String lastName = "Khapra";
    // String fullName = firstName + " " + lastName;

    // printLetters(fullName);
    // }
    // }

    // -----------------Palindrome-----------------------

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not palindrome
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    // -----------------Shortest_Path----------------------

    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i); // dir: store direction - E,W,N,S

            // east
            if (dir == 'E') {
                x++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // south
            else {
                y--;

            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }

    // -------------------Comparing_Strings--------------------

    public static void main(String[] args) {
        String s1 = "Ayan";
        String s2 = "Ayan";
        String s3 = new String("Ayan");

        // if(s1 == s2){
        // System.out.println("Strings are equal");
        // }
        // else{
        // System.out.println("Strings are not equal");
        // }
        // if( s1 == s3){ //s3 is separate object
        // System.out.println("Strings are equal");
        // }
        // else{
        // System.out.println("Strings are not equal");
        // }

        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
    // --------------------Substring---------------------

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    } // (We don't need to use the loop and all when we use --str.subtring(sI, eI)--)

    public static void main(String[] args) {

        // Substring
        String str = "MohdAyan";
        // System.out.println(substring(str, 1, 5));
        System.out.println(str.substring(2, 5)); // java
    }

    // ---------------Largest string(Lexicographic)---------------

    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };

        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

    // ---------------------String_Builder------------------

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // joining up
        }
        System.out.println(sb);
    }

    // //-------------------LowerCase_to_UpperCase-------------------------

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i am ayan";
        System.out.println(toUpperCase(str));
    }

    //--------------------String Compression----------------

    public static String compress (string str){
        String newStr = " ";
    }


    public static void main(String[] args) {
        String str = "aaabbbbccdddd"
    }

    // -------------------------------------------Questions---------------------------------------

    // public static void main(String args[]) {
    // String str = "ShradhaDidi";
    // String str1 = "ApnaCollege";
    // String str2 = "ShradhaDidi";
    // System.out.println(str.equals(str1) + " " + str.equals(str2));
    // }
    // public static void main(String args[]) {
    // String str = "ApnaCollege".replace("l", "");
    // System.out.println(str);
    // }
    // }

}
