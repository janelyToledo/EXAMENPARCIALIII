/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionLT {
    public static Connection getConnection() throws SQLException {
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión a la base de datos
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/nombre_base_datos", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Error de conexión: " + e.getMessage());
        }
    }
}
