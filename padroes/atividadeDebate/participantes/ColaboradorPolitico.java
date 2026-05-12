package padroes.atividadeDebate.participantes;


import padroes.atividadeDebate.debate.MediadorBase;
import padroes.atividadeDebate.microfone.Microfone;

public abstract class ColaboradorPolitico {
    protected String nome;
    protected String partido;
    protected boolean inquiridor;
    protected Microfone microfone;
    protected MediadorBase mediador;


    ColaboradorPolitico(String nome,String partido){
        this.nome = nome;
        this.partido = partido;
        this.inquiridor = false;
    }

    public abstract void operacaoMediada();

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPartido(String partido){
        this.partido = partido;
    }

    public String getPartido(){
        return partido;
    }

    public void setMediador(MediadorBase mediador){
        this.mediador = mediador;

    }


    //pRECISO VER MELHOR O QUE É
    public void setInquiridor(){}
    public void getInquiridor(){}

}
