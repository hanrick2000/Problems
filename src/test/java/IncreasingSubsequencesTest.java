import static org.junit.Assert.*;

import org.junit.Test;

public class IncreasingSubsequencesTest {

   @Test
   public void findSubsequences() {
      assertEquals("[[4, 6], [4, 6, 7], [4, 6, 7, 7], [4, 7], [4, 7, 7], [6, 7], [6, 7, 7], [7, 7]]", IncreasingSubsequences.findSubsequences(new int[] { 4, 6, 7, 7 }).toString());
   }

   @Test
   public void findSubsequences2() {
      assertEquals("[[1, 1], [1, 1, 1], [1, 1, 1, 1]]", IncreasingSubsequences.findSubsequences(new int[] { 1,1,1,1 }).toString());
   }

   @Test
   public void findSubsequences3() {
      assertEquals("[[100, 100], [90, 90], [90, 90, 100], [90, 100], [80, 80], [80, 80, 90], [80, 80, 90, 100], [80, 80, 100], [80, 90], [80, 90, 100], [80, 100], [70, 70], [70, 70, 80], [70, 70, 80, 90], [70, 70, 80, 90, 100], [70, 70, 80, 100], [70, 70, 90], [70, 70, 90, 100], [70, 70, 100], [70, 80], [70, 80, 90], [70, 80, 90, 100], [70, 80, 100], [70, 90], [70, 90, 100], [70, 100], [60, 60], [60, 60, 70], [60, 60, 70, 80], [60, 60, 70, 80, 90], [60, 60, 70, 80, 90, 100], [60, 60, 70, 80, 100], [60, 60, 70, 90], [60, 60, 70, 90, 100], [60, 60, 70, 100], [60, 60, 80], [60, 60, 80, 90], [60, 60, 80, 90, 100], [60, 60, 80, 100], [60, 60, 90], [60, 60, 90, 100], [60, 60, 100], [60, 70], [60, 70, 80], [60, 70, 80, 90], [60, 70, 80, 90, 100], [60, 70, 80, 100], [60, 70, 90], [60, 70, 90, 100], [60, 70, 100], [60, 80], [60, 80, 90], [60, 80, 90, 100], [60, 80, 100], [60, 90], [60, 90, 100], [60, 100], [50, 60], [50, 60, 70], [50, 60, 70, 80], [50, 60, 70, 80, 90], [50, 60, 70, 80, 90, 100], [50, 60, 70, 80, 100], [50, 60, 70, 90], [50, 60, 70, 90, 100], [50, 60, 70, 100], [50, 60, 80], [50, 60, 80, 90], [50, 60, 80, 90, 100], [50, 60, 80, 100], [50, 60, 90], [50, 60, 90, 100], [50, 60, 100], [50, 70], [50, 70, 80], [50, 70, 80, 90], [50, 70, 80, 90, 100], [50, 70, 80, 100], [50, 70, 90], [50, 70, 90, 100], [50, 70, 100], [50, 80], [50, 80, 90], [50, 80, 90, 100], [50, 80, 100], [50, 90], [50, 90, 100], [50, 100]]",
        IncreasingSubsequences.findSubsequences(new int[] { 100,90,80,70,60,50,60,70,80,90,100}).toString());
   }
}