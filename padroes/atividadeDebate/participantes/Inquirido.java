package padroes.atividadeDebate.participantes;

import padroes.atividadeDebate.configurartempo.ConfigurarTempo;
import padroes.atividadeDebate.log.LogSystem;

public class Inquirido extends ColaboradorPolitico{

    public Inquirido(String nome, String partido){
        super(nome, partido);
    }

    @Override
    public void operacaoMediada(){

    }

    public void responder(int tempo, LogSystem log){
            microfone.ligar();
            log.registrarLog("Microfone ligado para resposta do candidato " + this.nome);
            microfone.passaTempo(tempo);
            microfone.desligar();
            log.registrarLog("Microfone desligado para a resposta do candidato " + this.nome);
    }

    public void treplica(int tempo, LogSystem log){
            microfone.ligar();
            log.registrarLog("Microfone ligado para a treplica do candidato" + this.nome);
            microfone.passaTempo(tempo);
            microfone.desligar();
            log.registrarLog("Microfone desligado para a treplica do candidato " + this.nome);
    }
}
