package com.jap;

import java.util.*;

public class MovieService {

    public Map<Movie,Integer> getMovieWithRating(){

        //create five movie object by calling Movie class parameterized constructor
        Movie m1=new Movie(101,"jailer","Action","12/08/2023");
        Movie m2=new Movie(102,"bro","comedy","10/07/2023");
        Movie m3=new Movie(103,"xyz","fictional","10/07/2023");
        Movie m4=new Movie(104,"abcd","Action","21/06/2000");
        Movie m5=new Movie(105,"srii","comedy","21/05/2022");

        //create HashMap object and add all the Movie object inside it
        Map<Movie,Integer> map=new HashMap<>();
        //Key will be movie object and value will be rating ranging from 1 to 5
        map.put(m1,4);
        map.put(m2,3);
        map.put(m3,5);
        map.put(m4,4);
        map.put(m5,3);

        //return the HashMap object

        return map;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie,Integer> map,int rating){
        //Create a TreeSet object
        TreeSet<String> treeSet=new TreeSet<>();
        //Use entrySet() method to iterate through the map object
        //retrieve all the movies name having rating as 4
        //Store the movie name in TreeSet object

        for(Map.Entry<Movie,Integer> entry: map.entrySet()){
            if(entry.getValue()==4){
                treeSet.add(entry.getKey().getMovieName());
            }
        }
        //return the TreeSet object
      return treeSet;
    }

    public List<String> getMovieWithHighestRating(Map<Movie,Integer> map){
        //Create a ArrayList object of type String
        List<String> l=new ArrayList<>();
        //get the first value from the map and store it in the variable max
        // Use entrySet().iterator().next() method to retrieve the first value of Map object
        int max= map.entrySet().iterator().next().getValue();
        //get the name of the movie with the highest rating and add it in the List created
        for(Map.Entry<Movie,Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                l.add(entry.getKey().getMovieName());
            }

        }
        //return the List object
        return l;
    }
    public Map<String,String> getAllMoviesWithComedy(Map<Movie,Integer> map){
        //Create a Map object
        Map<String,String> map1=new HashMap<>();
        //use entrySet to iterate through the Map object
        //get all the movies name and their released date for the movie of genre "comedy"
        //store movie name with release date in the above created Map object and return the Map object
        for(Map.Entry<Movie,Integer> entry:map.entrySet()){
            if(entry.getKey().getGenre().equalsIgnoreCase("Comedy")){
                map1.put(entry.getKey().getMovieName(),entry.getKey().getReleaseDate());
            }
        }

        return map1;

    }

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map <Movie,Integer> map = movieService.getMovieWithRating();
        Set set = movieService.getMovieNameWithRating4(map,4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating((Map<Movie, Integer>) map);
        System.out.println("--------------");
        System.out.println("Highest Rating " +list);
    }
}
