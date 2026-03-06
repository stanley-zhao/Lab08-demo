package com.example.lab08;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }
    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
//    /**
//     * This delete the city from the list if exists, otherwise throw an exception
//     */
//    public void delete(City city) {
//        if(hasCity(city)){
//            //
//            cities.remove(city);
//        }else{
//            throw new NoSuchElementException();
//        }
//    }
//
//    /**
//     * return number of cities in the list
//     * @return number of cities in the list
//     */
//    public int countCities(){
//        return cities.size();
//    }
}
