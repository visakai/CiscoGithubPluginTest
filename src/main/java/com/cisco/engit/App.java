package com.cisco.engit;

import java.util.*;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "***Hello World!" );
		System.out.println( "Smoke test" );

        System.out.println("Adding three numbers ??: "+addNumbers(2, 5, 1));
    }

    //Static Method????
    public static int addNumbers(int a, int b, int c){
        return (a + c) - b;
    }
}
