package padroes.atividadeDebate.debate;

import padroes.atividadeDebate.configurartempo.ConfigurarTempo;
import padroes.atividadeDebate.log.LogSystem;
import padroes.atividadeDebate.participantes.*;

public class MediarDebate extends MediadorBase {
        private Inquirido inquirido;
        private Inquiridor inquiridor;


        public String debate(ConfigurarTempo config, LogSystem log){
            log.registrarLog("---- Inicio do Debate ----");
            inquiridor.perguntar(config.getTempoPergunta(), log);
            inquirido.responder(config.getTempoResposta(), log);
            inquiridor.replica(config.getTempoReplica(), log);
            inquirido.treplica(config.getTempoTreplica(), log);
            log.registrarLog("---- Fim do Debate ----");
            return "Fim do Debate! Faca um novo sorteio e configure os tempos";

        }


        //ajeitar essa criação do inquirido para passar o objeto completo
        public void setInquirido(ColaboradorPolitico politico) {
            this.inquirido = new Inquirido(politico.getNome(), politico.getPartido());
        }

        public void setInquiridor(ColaboradorPolitico politico) {
            this.inquiridor = new Inquiridor(politico.getNome(), politico.getPartido());
        }

        public Inquiridor getInquiridor(){return this.inquiridor;}
        public Inquirido getInquirido(){return this.inquirido;}
}
