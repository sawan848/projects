package com.daoImpl;

import com.dao.MoviesDao;
import com.entities.Movies;
import com.util.ConnectionConfiguration;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 * @author:Saawan
 * @created:[2/23/2021],Tuesday
 * Time:5:06 PM
 */
public class MoviesDaoImpl implements MoviesDao {

    @Override
    public void createMoviesTable() {
        Connection connection=null;
        Statement statement=null;

        try {
            connection= ConnectionConfiguration.getConnection();
            statement=connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS hollywood (id SERIAL primary key ,name TEXT NOT NULL,year INT NOT NULL)");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void insertMoviesData(Movies movies) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection=ConnectionConfiguration.getConnection();
            preparedStatement=connection.prepareStatement
                    ("INSERT INTO hollywood (name,year) VALUES (?,?)");
            preparedStatement.setString(1,movies.getName());
            preparedStatement.setInt(2, movies.getYear());
            preparedStatement.executeUpdate();
            System.out.println
            ("INSERT INTO hollywood (name ,year) VALUES ("+movies.getName()+","+movies.getYear()+")");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    @Override
    public Movies selectById(int id) {
        Movies movies=new Movies();
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            connection=ConnectionConfiguration.getConnection();
            preparedStatement=connection.prepareStatement
                    ("SELECT * FROM hollywood WHERE id=?");
            preparedStatement.setInt(1,id);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                movies.setSno(resultSet.getInt("id"));
                movies.setName(resultSet.getString("name"));
                movies.setYear(resultSet.getInt("year"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return movies;
    }

    @Override
    public List<Movies> selectAll() {
        List<Movies>movie=new ArrayList<>();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        try {

            connection=ConnectionConfiguration.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM hollywood");

            while (resultSet.next()){
                Movies movies=new Movies();
                movies.setSno(resultSet.getInt("id"));
                movies.setName(resultSet.getString("name"));
                movies.setYear(resultSet.getInt("year"));
                movie.add(movies);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return movie;
    }

    @Override
    public void delete(int id) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;

            try {
                connection=ConnectionConfiguration.getConnection();
                preparedStatement= connection.prepareStatement("DELETE FROM hollywood WHERE id=?");
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
                System.out.println("DELETE FROM hollywood WHERE id=?"+id);

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                if (preparedStatement!=null){
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (connection!=null){
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }



    @Override
    public void update(Movies movies, int id) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try {
            connection=ConnectionConfiguration.getConnection();
            preparedStatement=connection.prepareStatement
                    ("UPDATE hollywood SET name= ?,year=? WHERE id=?");
            preparedStatement.setString(1,movies.getName());
            preparedStatement.setInt(2,movies.getYear());
            preparedStatement.setInt(3,id);
            preparedStatement.executeUpdate();
            System.out.println(
                    "UPDATE hollywood SET name=?,year=? WHERE id=?"+movies.getName()+","+movies.getYear()+"id="+id);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (preparedStatement!=null){
                try {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }


    }
}
