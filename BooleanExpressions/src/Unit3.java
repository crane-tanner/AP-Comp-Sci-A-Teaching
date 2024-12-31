public class Unit3 {
   public static String divisibleBy(int num) {
    if( num % 2 == 0) {
        if(num > 0) {
            return num + " is an even number and positive";
        }
        else if(num < 0) {
            return num + " is even and negative";
        }
    }

   if(num % 2 != 0) {
       if(num > 0) {
           return num + " is odd and positive";
       }
       else {
           return num +" is odd and negative";
       }
   }
       return num + " is neither positive or negative";
   }
}
