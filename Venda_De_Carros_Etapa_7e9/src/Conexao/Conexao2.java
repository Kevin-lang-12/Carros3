/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao2 {

    public static void main(String[] args) {
        Conexao2 conex = new Conexao2();
        Connection conn = conex.conectar();
    }
    public Connection conectar() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/venda_de_carros2", "root", "root");
System.out.println("Conectou com o banco de dados!!!!");
        } catch (SQLException ex) {
            System.out.println("Erro: Não foi possivel se conectar no banco de dados!");
} catch (ClassNotFoundException ex) {
            System.out.println("Erro: Driver JDBC nao encontrado!.");
        }
        return conn;
    }    
}
