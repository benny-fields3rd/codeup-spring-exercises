package com.codeup.blog.models;

public class fizzBuzz {

    public static void main( String[] args ) {

        for(int i = 1; i <=100; i++){
            if (i % 15 == 0){ // or ((i % 3 == 0) && (i % 5 == 0)
                System.out.println("fizz buzz");
            } else if(i % 3 == 0){
                System.out.println("fizz");
            } else if (i % 5 == 0){
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
