package padroes.atividadeDebate.participantes;

import padroes.atividadeDebate.log.LogSystem;

public class Inquiridor extends ColaboradorPolitico{


    Inquiridor(String nome, String partido) {
        super(nome, partido);
    }

    @Override
    public void operacaoMediada(){
        System.out.println("operando");
    }

    public void escolherInquirido(ColaboradorPolitico politico){

    }

    //Colocar o tipolog
    public void perguntar(int tempo, LogSystem log){

    }

    public void replica(int tempo, LogSystem log){

    }
}
