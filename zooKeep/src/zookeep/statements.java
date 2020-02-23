/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zookeep;

import java.sql.ResultSet;

/**
 *
 * @author tktks
 */
public class statements {
   
String ShowDB = "Select * FROM Animals1 ORDER BY id DESC;";

String query = "SET IDENTITY_INSERT Animals1 ON INSERT INTO Animals1 (id, Animal, Name, Age, HealthConc, Feedsched, Date, Comments)    VALUES ( ?, ? , ? , ? , ? , ? , ? , ?) ";

String query1 = "SELECT TOP (1000) * FROM animals1 ORDER BY id DESC";

String queryAnimal = "SELECT * FROM animals1 WHERE animal = ? ORDER BY id DESC";

String queryshow1 = "SELECT TOP(1) * FROM animals1 WHERE animal = ? ORDER BY id DESC";

String queryhabitatdb = "Select * FROM habitats1 ORDER BY id DESC;";

String queryinserthab = "SET IDENTITY_INSERT habitats1 ON INSERT INTO habitats1 (id, habitat, temp, foodsour, foodsupp, clean, date, comments)    VALUES ( ?, ? , ? , ? , ? , ? , ? , ?) ";

String queryshow1000 = "SELECT TOP (1000) * FROM habitats1 ORDER BY id DESC";

String queryhabshow1 = "SELECT * FROM habitats1 WHERE habitat = ? ORDER BY id DESC";

String queryhabalarm = "SELECT TOP(1) * FROM habitats1 WHERE habitat = ? ORDER BY id DESC";

String querylogin = "INSERT INTO userpass2 (username, password) VALUES (?,?)";

String querypass = "SELECT * FROM userpass2 WHERE username = ? and password = ?";

    ResultSet executeQuery(String querypass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
