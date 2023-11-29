package org.example;

import java.sql.*;

public class ConexionJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tienda?serverTimezone=UTC";
        String username = "root";
        String password = "";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM productos");

            while(resultSet.next()){
                System.out.println(resultSet.getString("id") + " | " + resultSet.getString("nombre") + " | " + resultSet.getString("precio") );
            }

            connection.close();
            statement.close();
            resultSet.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
