/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinematicket;

/**
 *
 * @author user
 */
public class Connectionsql {

    private static Connection con;

    public static Connection getConnection() {
        try {

            if (con == null) {
                //driver class load
                Class.forName("com.mysql.cj.jdbc.Driver");

                //create a connection..
                con = DriverManager.
                        getConnection("jdbc:mysql://localhost:3306/bus", "root", "Bhanu@123");
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    private static class Connection {

        public Connection() {
        }
    }
}