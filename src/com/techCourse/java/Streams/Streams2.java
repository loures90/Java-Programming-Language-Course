package com.techCourse.java.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


public class Streams2 {
    public static void main (String[] args) throws IOException {
      int arr[] = {1,2,3,4,5, 5, 5, 5, 2, 3};
      System.out.println("Distinct values");
      Arrays.stream(arr).distinct().forEach(System.out::println);
        
      System.out.println("Distinct values > 2");
      Arrays.stream(arr).distinct().filter(x -> x > 2).forEach(System.out::println);
      
      System.out.println("Distinct values > 2 and squares");
      Arrays.stream(arr).distinct().filter(x -> x > 2).map(x -> x*x).forEach(System.out::println);
      
      String arr2[] = {"this is", "a test", "test", "bla bla bla"};
      
      System.out.println("Using map()");
      Stream.of(arr2)
      	.map(x -> x.split(" "))
      	.forEach(x -> System.out.println(Arrays.toString(x)));
      
      System.out.println("arr2 = " + Arrays.toString(arr2));
      
      System.out.println("Using flatMap()");
      Stream.of(arr2)
      	.flatMap(x -> Stream.of(x.split(" ")))
      	.forEach(x -> System.out.println(x));
      
      
      
      String str = Stream.of(arr2)
    		  .skip(1)
    		  .limit(2)
    		  .collect(Collectors.joining(" "));
      
      System.out.println(str);
      
      System.out.println("\nsorted()");
      Stream.of(arr2).sorted().forEach(System.out::println);
      
      System.out.println("\nsorted()");
      Stream.of(arr2)
      	.sorted((a, b) -> -1 * a.compareToIgnoreCase(b))
      	.forEach(System.out::println);
      
      
          
    }
}