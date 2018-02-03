public class SingleNumberIII {
   /**
    * The two numbers that appear only once must differ at some bit, this is how we can distinguish between them. Otherwise, they will be one of the duplicate numbers.

    One important point is that by XORing all the numbers, we actually get the XOR of the two target numbers (because XORing two duplicate numbers always results in 0). Consider the XOR result of the two target numbers; if some bit of the XOR result is 1, it means that the two target numbers differ at that location.

    Let’s say the at the ith bit, the two desired numbers differ from each other. which means one number has bit i equaling: 0, the other number has bit i equaling 1.

    Thus, all the numbers can be partitioned into two groups according to their bits at location i.
    the first group consists of all numbers whose bits at i is 0.
    the second group consists of all numbers whose bits at i is 1.

    Notice that, if a duplicate number has bit i as 0, then, two copies of it will belong to the first group. Similarly, if a duplicate number has bit i as 1, then, two copies of it will belong to the second group.

    by XoRing all numbers in the first group, we can get the first number.
    by XoRing all numbers in the second group, we can get the second number.
    * @param nums
    * @return
    */
   public static int[] singleNumber(int[] nums) {

      int n = 0;

      for (int num1 : nums) {
         n ^= num1;
      }

      int lowestOneBit = Integer.lowestOneBit(n);

      n = 0;
      int b = 0;
      for (int num : nums) {

         if ((num & lowestOneBit) == 0) {
            n ^= num;
         } else {
            b ^= num;
         }
      }

      return new int[] { n, b };
   }
}
