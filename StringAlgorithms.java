public class StringAlgorithms {

   public static void printCharacters(String word) {
      for(int i = 0; i < word.length(); i ++) {
         System.out.println(word.substring(i, i+1));
      }
   }   

   public static void reverseWord(String word) {
      String newString = "";
      for(int i = word.length(); i > 0; i --) {
         newString += word.substring(i-1, i);
         
      }  
      System.out.println(newString); 
   }
   
   /* public static void capitalizeString(String sentence) {
      String newString = "";
      for(int i = 0; i <= sentence.length(); i ++) {
         if (sentence.indexOf(i) = 0) {
            newString += sentence.substring(i, i+1).toUpperCase();
         } else if (sentence.substring(i-1, i) == " ") {
            newString += sentence.substring(i, i+1).toUpperCase();
         }
          
         newString += sentence.substring(i, i+1);    
      }
      System.out.println(newString);   
   } */
   
   public static boolean detectPalindrome(String word) {
      String newString = "";
      for(int i = word.length(); i > 0; i --) {
         newString += word.substring(i-1, i);
         
      }  
      if (newString.equals(word)){
         return true;
      } else {
         return false;
      } 
   }

   public static void main(String[] args) {
      printCharacters("hello");
      reverseWord("hello");
     // capitalizeString("the quick brown fox");
      System.out.println(detectPalindrome("racecar"));
   }
}