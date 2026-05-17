package padroes.atividadeDebate.participantes;



import padroes.atividadeDebate.debate.MediarDebate;
import padroes.atividadeDebate.log.LogSystem;
import padroes.atividadeDebate.microfone.Microfone;

public class ColaboradorPolitico {
    protected String nome;
    protected String partido;
    protected boolean inquiridor;
    protected Microfone microfone;
    protected MediarDebate mediador;



    public ColaboradorPolitico(String nome,String partido){
        this.nome = nome;
        this.partido = partido;
        this.inquiridor = false;
    }

    public void operacaoMediada(){}

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

    public void setMediador(MediarDebate mediador){
        this.mediador = mediador;

    }
    public void setInquiridor(boolean inquiridor){
        this.inquiridor = inquiridor;
    }
    public boolean getInquiridor(){
        return inquiridor;
    }

}
