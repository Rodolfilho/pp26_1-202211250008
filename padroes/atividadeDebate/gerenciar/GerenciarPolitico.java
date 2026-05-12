package padroes.atividadeDebate.gerenciar;

import padroes.atividadeDebate.debate.MediadorBase;
import padroes.atividadeDebate.participantes.ColaboradorPolitico;

import java.util.List;

public class GerenciarPolitico {
    private List<ColaboradorPolitico> politicos;
    private int quantidadePoliticos;


    public void criarPolitico(String nome, String partido, MediadorBase mediador){

    }

    public ColaboradorPolitico obterPolitico(){
        //so para não gerar erro
        return politicos.getFirst();
    }

    public ColaboradorPolitico sotearPolitico(){
        //so para não gerar erro
        return politicos.getFirst();
    }
}
