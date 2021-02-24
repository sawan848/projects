package com.company;

import com.daoImpl.MoviesDaoImpl;
import com.entities.Movies;




public class Main {
    private static final String url="jdbc:postgresql://localhost:4444/postgres";
    private static final String username="postgres";
    private static final String password="hope";

    public static void main(String[] args) {
        MoviesDaoImpl  moviesDao=new MoviesDaoImpl();
/*
        create table
                   moviesDao.createMoviesTable();
//        Insert Data*/
                   Movies movies=new Movies(2013,"The Wolverine");
                          moviesDao.insertMoviesData(movies);

                   /*Movies movies2=new Movies(2021,"Godzilla vs KingKong");
                          moviesDao.insertMoviesData(movies2);
                   Movies movies3=new Movies(2021,"Mortal Kombat");
                          moviesDao.insertMoviesData(movies3);
                   Movies movies4=new Movies(2021,"The Matrix 4");
                          moviesDao.insertMoviesData(movies4);
                   Movies movies5=new Movies(2021,"Sing 2 ");
                          moviesDao.insertMoviesData(movies5);

        View Data by id (select single value)
                   Movies moviesId1=moviesDao.selectById(1);
                          System.out.println(moviesId1.getSno()+","+moviesId1.getName()+","+moviesId1.getYear());
                   Movies moviesId2=moviesDao.selectById(3);
                          System.out.println(moviesId2.getSno()+","+moviesId2.getName()+","+moviesId2.getYear());

        select all values from table
                   List<Movies>movie=moviesDao.selectAll();
                       for (Movies movies:movie) {
                            System.out.println(movies.getSno()+","+movies.getName()+","+movies.getYear());
                        }

        Update values
                 Movies movies=new Movies(2013,"The Croods");
                 moviesDao.update(movies,5);

       Delete values using 'id'
        moviesDao.delete(1);

*/



        /*

write your code here
//        Connection connectction=null;
        try {
            Class.forName("org.postgresql.Driver");
            connectction=DriverManager.getConnection(url,username,password);
                    "jdbc:postgresql://localhost:4444/postgres","postgres","hope");
            connection= DriverManager.getConnection(
                    "jdbc.postgresql://localhost:4444/movies","postgres","hope"
            );
            if (connectction!=null){
                System.out.println("connection establisted (o_o)");
            }else {
                System.out.println("oop`s error !!! ... ");
            }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
**/
    }
}
