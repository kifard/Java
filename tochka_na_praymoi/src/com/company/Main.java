package com.company;

public class Main {
    public static void main(String[] args) {
        Function function1= new Function(3, 5);
        Function function2 = new Function();
        function2 = function1.MoveX(3);
        function2 = function2.MoveY(5);
        System.out.println(function2);

    }
}