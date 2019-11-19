package com.springboot.k8s.DockerK8S;

public class FizzBuzz {

    public String fizzbuzz(int number) {
        if(number==0) throw new IllegalArgumentException("Number must not be 0");
        if((number%3==0 )&& (number%5==0)) return "FizzBuzz";
         if(number%3==0) return "Fizz";
         if(number%5==0) return "Buzz";

         return String.valueOf(number);

    }
}
