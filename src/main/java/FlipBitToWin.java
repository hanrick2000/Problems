public class FlipBitToWin {
   // following the left/right pointers pattern
   private int flip3(int value){
      String bits = Integer.toBinaryString(value);
      int bitsCount = bits.length();

      int numberOfZerosNeeded = 32 - bitsCount;

      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < numberOfZerosNeeded; i++) {
         stringBuilder.append('0');
      }
      bits = stringBuilder.append(bits).toString();
      bitsCount = bits.length();

      int accaptableFlips = 1;

      int start = 0;
      int end = -1;

      int bestStart = 0;
      int bestEnd = 0;

      while (end < bitsCount - 1) {

         while (end < bitsCount - 1&& accaptableFlips >= 0) {
            char c = bits.charAt(++end);

            if (c == '0') {
               accaptableFlips--;
            }
         }

         int temp = accaptableFlips < 0 ? end - 1 : end;
         if (temp  - start > bestEnd - bestStart) {
            bestEnd = temp;
            bestStart = start;
         }

         while (start < end && accaptableFlips < 0) {
            char c = bits.charAt(start++);

            if (c == '0') {
               accaptableFlips++;
            }
         }
      }

      return bestEnd - bestStart + 1;
   }

   public static int flip(int n){
      int firstZero = -1;
      int secondZero = -1;

      int index = 0;
      int mask = 1;
      int longestSequence = 0;

      while(index < 32) {
         if ((mask & n) == 0) {
            longestSequence = Math.max(longestSequence, index - secondZero - 1);
            secondZero = firstZero;
            firstZero = index;
         }
         mask <<= 1;
         ++index;
      }

      return Math.max(longestSequence, index - secondZero - 1);
   }

   static int flip2(int n) {
      int lastZero = -1;
      int currentLength = 0;
      int maxLength = 0;

      int index = 1;

      for(int i = 0; i < 32; ++i) {
         int valueI = index & n;

         ++currentLength;
         if (valueI ==0) {
            if (lastZero > i - currentLength) {
               currentLength = i - lastZero;
            }

            lastZero = i;
         }


         maxLength = Math.max(maxLength, currentLength);
         index <<=1;
      }
      return maxLength;
   }
}
