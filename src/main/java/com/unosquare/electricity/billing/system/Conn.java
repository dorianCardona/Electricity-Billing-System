package com.unosquare.electricity.billing.system;

import java.sql.*;

/**
 *
 * @author dorian.cardona
 */
public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "1234567890");
            s = c.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
