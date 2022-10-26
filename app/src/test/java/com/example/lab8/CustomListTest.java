package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){   //there is a custom list containing an empty arry list. THis will be used for the test.
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        // this is a test which will get the size of the list to us, then increase the list by adding a new city.
        //   - Check if: the current size matches the initial size plus one.
        list = MockCityList();
        int listSize = list.getCount();                          //get initial list size
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);        //Check if: the current size matches the initial size plus one.
    }

    @Test
    public void countCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Calgary", "AB"));
        list.addCity(new City("Fort McMurray", "AB"));
        assertEquals(list.getCount(),listSize + 3);        //Check if: the current count matches the actual count

    }


}
