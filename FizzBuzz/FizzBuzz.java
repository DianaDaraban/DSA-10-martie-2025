package FizzBuzz;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void calculate(){
        for(int i = 1; i<=100; i+++){
            if(i % 15 == 0){
System.out.println("FizzBuzz");
            } else if(i % 5 == 0 ){
            System.out.println("Buzz");
        } else if(i % 5 == 0 ){
            System.out.println("Fizz");
        } else {
            System.out.println(i);
        }
        } 
    }


// NOT RECOMENDED - NOT CLEAR

    public static void calculateWithStreams(){
        IntStream.rangeClosed(1, 100)
            .mapToObj(number -> 
            (number % 15 == 0)? "FizzBuzz":
             (number % 3 == 0) ? "Fizz":
              (number % 5 == 0)? "Buzz":
               String.valueOf(number))
            .forEach(System.out::println);
    }
    public static void main(String[] args){
        FizzBuzz.calculate();
    }
}
