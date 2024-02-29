package com.techCourse.java.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Streams
* Enable to define a pipeline of operations to proccess collections fo data.
* Consists of three main parts:
*   - Source
*   - Zero of more intermediate operations
*   - Terminal operation.
* Pipeline is not evaluated till the terminal operation is invoked
*
*
* */


public class Streams1 {
    public static void main (String[] args) throws IOException {
        int arr[] = {1,2,3,4,5,6,7,8};

        // Imperative Programming
        int sum = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                sum += value * value;
            }
        }

        System.out.println("Sum is " + sum);
        
        int sum2 = Arrays.stream(arr)
//        		.parallel()
        		.filter(number -> (number % 2) == 0)
        		.map(number -> number * number)
        		.sum();
        
        System.out.println("Sum is " + sum2);
        
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("0");
        list.add("5");
        list.add("r");
        list.add("l");
        
        list.stream().forEach(System.out::println);
        
        
        Files.lines(Path.of(System.getProperty("user.dir") + "\\src\\com\\techCourse\\java\\IOStreams\\dest.txt"))
        	.forEach(System.out::println);
        
        
    }
}