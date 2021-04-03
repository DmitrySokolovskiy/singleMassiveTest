package by.it.academia.main;

import org.junit.Assert;
import org.junit.Test;

public class SingleArrTest {
    @Test
    public void setSingleArrSuit() {
        int waitedEnum = 1;
        int waitedDenum = 0;

        SingleArr sngArr = new SingleArr();
        int[] arr = sngArr.setSingleArr(4);

        for (int i=0; i <arr.length; i++) {
            if (i % 2 == 0) {
                Assert.assertEquals(waitedEnum, arr[i]);
            } else {
                Assert.assertEquals(waitedDenum, arr[i]);
            }
        }
    }
}
