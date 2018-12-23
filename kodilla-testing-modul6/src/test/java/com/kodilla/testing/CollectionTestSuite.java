package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Napis przed testem");
    }

    @After
    public void after(){
        System.out.println("Napis po teście");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        int sizeBeforeTest = list.size();
        System.out.println(sizeBeforeTest);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> listOdd = oddNumbersExterminator.oddNumbersExterminator(list);
        int sizeAfterTest = list.size();
        System.out.println(sizeAfterTest);
        //Then
        Assert.assertEquals(sizeBeforeTest, sizeAfterTest);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> listOdd = oddNumbersExterminator.oddNumbersExterminator(list);
        int sizeAfterTest = listOdd.size();
        System.out.println(listOdd);

        //Then
        Assert.assertEquals(2, sizeAfterTest);

    }

    @Test
    public void testOddNumbersExterminatorNormalList1(){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=10; i++) {
            list.add(random.nextInt(100));
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> listOdd = oddNumbersExterminator.oddNumbersExterminator(list);
        System.out.println(listOdd);

    }
}
