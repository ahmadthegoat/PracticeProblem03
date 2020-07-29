package com.stayready;

import junit.framework.Assert;
import org.junit.Test;

public class Problem03Test {
    Problem03 problem03 = new Problem03();

    @Test
    public void checkvaliditytest(){
        Integer[] given = new Integer[]{2,1,5,3,4};
        String result = problem03.checkValidity(given);
        String expected = "3";

        Assert.assertEquals(result,expected);

    }

    @Test
    public void checkvaliditytest1(){
        Integer[] given = new Integer[]{2,5,1,3,4};
        String result = problem03.checkValidity(given);
        String expected = "Too Chaotic";

        Assert.assertEquals(result,expected);

    }

    @Test
    public void checkvaliditytest2(){
        Integer[] given = new Integer[]{2,1,5,4,3};
        String result = problem03.checkValidity(given);
        String expected = "4";

        Assert.assertEquals(result,expected);

    }


    @Test
    public void checkvaliditytest3(){
        Integer[] given = new Integer[]{1,2,3,4,5};
        String result = problem03.checkValidity(given);
        String expected = "0";

        Assert.assertEquals(result,expected);

    }

    @Test
    public void checkvaliditytest4(){
        Integer[] given = new Integer[]{2,1,3,4,5};
        String result = problem03.checkValidity(given);
        String expected = "2";

        Assert.assertEquals(result,expected);

    }
}

