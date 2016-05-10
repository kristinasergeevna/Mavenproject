package org.kzn.itis.gr404;

import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Properties properties=new Properties();
        try {
            properties.load(App.class.getClassLoader().getResourceAsStream("data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("user"));
        System.out.println( "Hello World!" );
    }
}
