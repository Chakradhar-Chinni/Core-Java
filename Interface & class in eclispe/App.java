package com.youtube.telusko.SpringDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        
        	Vehicle obj = new Car();  // Vehicle is an interface which implements the method of Bike & Car class
        	obj.run();
    }
}
