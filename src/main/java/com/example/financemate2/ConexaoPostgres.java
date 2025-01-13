package com.example.financemate2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoPostgres {
    static Connection conn = null;
    static String url = "jdbc:postgresql://localhost:5432/financemate";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "financemate";

    // public static void main(String[] args){
    //     try{
    //         System.out.println("Carregando o driver...");
    //         Class.forName(driver);
    //         System.out.println("Driver carregado com sucesso!");
    //         }catch(Exception e){
    //         System.out.println("Falha no carregamento!");
    //     }

    //     try{
    //         System.out.println("Tentando conectar o BD...");
    //         conn = DriverManager.getConnection(url,user,senha);
    //         System.out.println("BD conectado com sucesso!");
    //     }catch(Exception e){
    //         System.out.println("Falha no carregamento!");
    //     }

//         Connection conn = null;
//         Statement st = null;
        
//         String sql1 = "CREATE TABLE aluno("
//         + "id int primary key not null,"
//         + "nome text,"
//         + "email text)";
//         try{
//         Class.forName(driver);
//         conn = DriverManager.getConnection(url,user,senha);
//         System.out.println("Criando a tabela...");
//         st = conn.createStatement();
//         st.executeUpdate(sql1);
//         System.out.println("Tabela criada com sucesso!");
//         st.close();
//         conn.close();
//         }catch(Exception ex){
//         System.out.println(ex);
//  }

//    }

}
