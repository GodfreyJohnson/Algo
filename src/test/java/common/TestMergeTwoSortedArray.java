package common;

import com.common.MergeTwoSortedArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMergeTwoSortedArray {
  private MergeTwoSortedArray m;

  @Before
  public void before() {
    m = new MergeTwoSortedArray();
  }

  @Test
  public void runTest() {
    int[] arr1 = new int[6];
    arr1[0] = 1;
    arr1[1] = 3;
    arr1[2] = 5;
    int[] arr2 = {2, 4, 6};
    int[] result = {1, 2, 3, 4, 5, 6};
    Assert.assertArrayEquals(m.solution(arr1, arr2), result);
  }

  @Test
  public void runTest2() {
    int[] arr1 = new int[4];
    arr1[0] = 1;
    arr1[1] = 3;
    arr1[2] = 5;
    int[] arr2 = {2};
    int[] result = {1, 2, 3, 5};
    Assert.assertArrayEquals(m.solution(arr1, arr2), result);
  }
}
