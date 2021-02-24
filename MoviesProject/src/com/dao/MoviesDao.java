package com.dao;

import com.entities.Movies;

import java.util.List;

/*
 * @author:Saawan
 * @created:[2/23/2021],Tuesday
 * Time:4:59 PM
 */
public interface MoviesDao {
    void createMoviesTable();
    void insertMoviesData(Movies movies);
    Movies selectById(int id);
    List<Movies>selectAll();
    void delete(int id);
    void update(Movies movies,int id);
}
