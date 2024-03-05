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

    // -----------------------Palindrome----------------------------

    // public static boolean isPalindrome(String str) {
    // for(int i = 0; i<str.length()/2;i++){
    // int n = str.length();
    // if(str.charAt(i) != str.charAt(n-1-i)){
    // // not palindrome
    // return false;
    // }
    // }
    // return true;

    // }
    // public static void main(String[] args) {
    // String str = "racecar";
    // System.out.println(isPalindrome(str));
    // }

    // -------------------------Shortest_Path-----------------------------
    // public static float getShortestPath(String path) {
    // int x = 0, y = 0;

    // for (int i = 0; i < path.length(); i++) {
    // char dir = path.charAt(i);
    // // east
    // if (dir == 'E') {
    // x++;
    // }
    // // west
    // else if (dir == 'W') {
    // x--;
    // }
    // // north
    // else if (dir == 'N') {
    // y++;
    // }
    // // south
    // else {
    // y--;

    // }
    // }
    // int X2 = x * x;
    // int Y2 = y * y;
    // return (float) Math.sqrt(X2 + Y2);
    // }

    // public static void main(String[] args) {
    // String path = "WNEENESENNN";
    // System.out.println(getShortestPath(path));
    // }

    // ----------------------------Comparing_Strings------------------------------

    // public static void main(String[] args) {
    //     String s1 = "Ayan";
    //     String s2 = "Ayan";
    //     String s3 = new String("Ayan");

    //     // if(s1 == s2){
    //     // System.out.println("Strings are equal");
    //     // }
    //     // else{
    //     // System.out.println("Strings are not equal");
    //     // }
    //     // if( s1 == s3){
    //     // System.out.println("Strings are equal");
    //     // } 
    //     // else{
    //     // System.out.println("Strings are not equal");
    //     // }

    //     if (s1.equals(s3)) {
    //         System.out.println("Strings are equal");
    //     } else {
    //         System.out.println("Strings are not equal");
    //     }
    // }
    //-------------------------Substring------------------------------

    // public static String substring(String str, int si, int ei) {
    //     String substr = "";
    //         for(int i = si; i<ei; i++){
    //             substr += str.charAt(i);
    //         }
    //         return substr;
    // }
    // public static void main(String[] args) {
        
    //     //Substring
    //     String str= "MohdAyan";
    //     // System.out.println(substring(str, 1, 5));
    //     System.out.println(str.substring(2,5));   //java
    // }
}