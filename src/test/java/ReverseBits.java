public class ReverseBits {
   public static int reverseBits(int n) {
      int result = 0;
      for (int i = 0; i < 32; i++) {
         result <<= 1;
         if ((n & 1<<i) != 0) {
            result |=  1;
         }
      }
      return result;
   }
}
