package com.example.financemate2.controller;


import com.example.financemate2.model.Categoria;
import com.example.financemate2.model.Entrada;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
//import java.sql.Date;
import java.sql.SQLException;



public class EntradaCtrl{

    static Connection conn = null;
    static String url = "jdbc:postgresql://localhost:5432/financemate";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "financemate";
    
    public void createEntrada(Entrada entrada){
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
            String sql1 = "INSERT INTO aluno(matricula,nome) VALUES(?,?);";
            ps = conn.prepareStatement(sql1);
            ps.setString(1, entrada.getData());
            //ps.setString(2, entrada.getCategoria()); // Categoria vai virar string?
            ps.setFloat(2, entrada.getValor());
            ps.setInt(3, entrada.getIdMov());
            ps.execute();
            ps.close();
            conn.close();
     
        }catch(Exception ex){
              System.out.println(ex);
        }
    }
    
    public void readEntrada(){
    
        ResultSet rs = null;
            String sql2 = "select *entrada"; 
            Connection conn = null;
            Statement st = null;
            try{
                Class.forName(driver);
                conn = DriverManager.getConnection(url,user,senha);
                st = conn.createStatement();
                rs = st.executeQuery(sql2);
            while(rs.next())
            {    
            /*Lógica de enviar os dados pro front*/
                
            } 
                rs.close();
                st.close();
                conn.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
    
    }
    
    
}