package com.example.financemate2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySql {
    
    public static Connection conexao = null;
    public static String driverJDBC = "com.mysql.cj.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost:3306/financemate";
    public static String user= "root";
    public static String senha = "";

    public static void conectaBanco (String args[]){
    
        try{
            System.out.println("Carregando o driver...");
            Class.forName(driverJDBC);
            System.out.println("Driver carregado com sucesso");
            }catch(Exception e){
            System.out.println("Falha no carregamento");
            }
            try{
            System.out.println("Conectando o BD...");
            conexao = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexao realizada com sucesso");
            }catch(Exception e){
            System.out.println("Falha na conexao com o BD");
            }
    }
}
