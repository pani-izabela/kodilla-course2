package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> oddNumbersExterminator(ArrayList<Integer> numbers){
        ArrayList<Integer> odd = new ArrayList<>();
        for(int numbersOdd : numbers){
            if(numbersOdd%2!=0){
                odd.add(numbersOdd);
            }
        }
    return odd;
    }
}
