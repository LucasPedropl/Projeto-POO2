package com.example.financemate2.controller;

import com.example.financemate2.ConexaoPostgres;
import com.example.financemate2.model.Usuario;


public class UsuarioCtrl {
    
    String nome, email, senha;
    int preferencia;

    public UsuarioCtrl(){

        //ConexaoMySql conexao = new ConexaoMySql();

        // Abro conexão
        ///////////conexao.conectaBanco();
        // Realizo operação
        
        // Fecho conexão O BANCO NAO PODE FICAR ABERTO
    }
    
    public void adicionaUsuario(Usuario usuario){
        // INSET INTO
        System.out.println("Usuario inserido com sucesso");
    }
    
}