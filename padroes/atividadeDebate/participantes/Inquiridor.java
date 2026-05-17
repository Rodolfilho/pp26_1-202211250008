package padroes.atividadeDebate.participantes;

import padroes.atividadeDebate.log.LogSystem;


public class Inquiridor extends ColaboradorPolitico{


     public Inquiridor(String nome, String partido) {
        super(nome, partido);
    }

    @Override
    public void operacaoMediada(){

    }

    public void escolherInquirido(ColaboradorPolitico politico){
         mediador.setInquirido(politico);
    }

    //Colocar o tipolog
    public void perguntar(int tempo, LogSystem log){
        microfone.ligar();
        log.registrarLog("Microfone ligado para a pergunta do candidato " + this.nome);
        microfone.passaTempo(tempo);
        microfone.desligar();
        log.registrarLog("Microfone desligado para a pergunta do candidato " + this.nome);
    }

    public void replica(int tempo, LogSystem log){
        microfone.ligar();
        log.registrarLog("Microfone ligado para a replica do candidato " + this.nome);
        microfone.passaTempo(tempo);
        microfone.desligar();
        log.registrarLog("Microfone desligado para a replica do candidato " + this.nome);
    }
}
