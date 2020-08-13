package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
		String name="";
		for( String param : args) {
			name+=param+" ";
		}
		if( "".contentEquals(name) ) {
			System.out.println(   "Hello world!" );
			
		}
		else {
			System.out.println(   "Hello "+name+"!" );
		}
    }
}
