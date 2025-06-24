/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao_medicamentos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public static Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/medicamentos_db"; // nome do banco
        String usuario = "root"; // altere se necessário
        String senha = "";       // sua senha do MySQL

        return DriverManager.getConnection(url, usuario, senha);
    }


}
