/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao_Principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {


        public Connection getConexao() {
        try {
            Connection conn2 = DriverManager.getConnection(
                    "jdbc:mysql://localhost/ venda_de_carros2 ", // linha de conexao
                    "root", // usuario do mysql
                    "root"// senha do mysql
            );
            return conn2;
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }    
}
