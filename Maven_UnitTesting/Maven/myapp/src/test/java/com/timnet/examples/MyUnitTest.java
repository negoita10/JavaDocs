package com.timnet.examples;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Alexandru.Negoita on 7/10/2017.
 */
public class MyUnitTest {

    @Test
    public void testConcatenate(){
        MyUnit myUnit= new MyUnit();
        String result= myUnit.concatenate("one","two");
        assertEquals("onetwo",result);
    }

    @Test
    public void testConcatNulls(){
        MyUnit unit=new MyUnit();
        String result=unit.concatenate(null, null);
        assertEquals(null, result);
        result = unit.concatenate("one", null);
        assertNotNull(result);
        assertEquals("one", result);
    }

    @Test
    public void testGetBoolean(){
        System.out.println("true");
    }
}
