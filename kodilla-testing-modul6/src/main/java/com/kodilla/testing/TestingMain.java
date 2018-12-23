package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int resultIntAdd = calculator.add(10, 5);
                if(resultIntAdd == 15){
                    System.out.println("Ok");
                }
                else{
                    System.out.println("Error");
                }
    }
}
