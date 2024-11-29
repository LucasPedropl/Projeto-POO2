package Controller;
import Model.Movimentacao;


public abstract class MovimentacaoCtrl {
    
    public MovimentacaoCtrl(){
        // Abro conexão
        
        // Realizo operação
        
        // Fecho conexão O BANCO NAO PODE FICAR ABERTO
    }
    
    public void adicionaMovimentacao(Movimentacao movimentacao){
        // INSET INTO
        System.out.println("Movimentacao inserido com sucesso");
    }
    
}