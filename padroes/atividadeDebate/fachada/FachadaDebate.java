package padroes.atividadeDebate.fachada;

import padroes.atividadeDebate.configurartempo.ConfigurarTempo;
import padroes.atividadeDebate.debate.MediadorBase;
import padroes.atividadeDebate.gerenciar.GerenciarPolitico;
import padroes.atividadeDebate.log.LogSystem;

public class FachadaDebate {
    // 1. Instância privada e estática da própria classe
    private static FachadaDebate instancia;
    private ConfigurarTempo confg;
    private MediadorBase mediador;
    private GerenciarPolitico gerenciador;
    private LogSystem log;

    // 2. Construtor privado para evitar instanciação direta
    private FachadaDebate() {}

    // 3. Metodo público estático para obter a instância
    // O synchronized garante que duas threads não criem instâncias simultâneas
    public static synchronized FachadaDebate getInstancia() {
        if (instancia == null) {
            instancia = new FachadaDebate();
        }
        return instancia;
    }


    public void configuracao(int pergunta, int resposta, int replica, int treplica){}
    public void cadastrarPolitico(String nome, String partido, MediadorBase mediador){}
    public void SortearInquiridor(){}
    public void EscolherInquirido(String nome, String partido){}
    public void executaDebate(ConfigurarTempo config, LogSystem log){}
    public void acessaLog(){}

}
