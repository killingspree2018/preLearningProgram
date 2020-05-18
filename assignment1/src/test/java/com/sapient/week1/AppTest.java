package com.sapient.week1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
        boolean x = CheckEven.Check(4);
        assertTrue( x == true );
    }

     public void testApp2()
    {
        boolean x = CheckEven.Check(3);
        assertTrue( x == false );
    }

     public void testApp3()
    {
        boolean x = CheckEven.Check(8);
        assertTrue( x == true );
    }

     public void testApp4()
    {
        boolean x = CheckEven.Check(13);
        assertTrue( x == false );
    }

}
