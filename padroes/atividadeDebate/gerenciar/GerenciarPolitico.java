package padroes.atividadeDebate.gerenciar;


import padroes.atividadeDebate.debate.MediarDebate;
import padroes.atividadeDebate.participantes.ColaboradorPolitico;
import java.util.List;
import java.util.Random;

public class GerenciarPolitico {
    private List<ColaboradorPolitico> politicos;
    private int quantidadePoliticos;


    public void criarPolitico(String nome, String partido, MediarDebate mediador){
        ColaboradorPolitico novoPolitico = new ColaboradorPolitico(nome, partido);
        novoPolitico.setMediador(mediador);
        politicos.add(novoPolitico);
        quantidadePoliticos++;
    }


    //Não esta fazendo sentido ainda
    public ColaboradorPolitico obterPolitico(String nome, String partido){
        for (ColaboradorPolitico p : politicos){
            if(p.getNome().equals(nome) && p.getPartido().equals(partido)){
                return p;
            }

        }
        return politicos.getFirst();
    }

    public ColaboradorPolitico sotearPolitico(){
    Random random = new Random();
        ColaboradorPolitico politico = new ColaboradorPolitico("generico", "Generico");
        do{
            politico = politicos.get(random.nextInt(quantidadePoliticos));

        }while(politico.getInquiridor() && quantidadePoliticos >= 2);
        if(quantidadePoliticos >= 2){
            politico.setInquiridor(true);
            quantidadePoliticos--;
        }else{
            for(ColaboradorPolitico p : politicos){
                if(!p.getInquiridor()){
                    p.setInquiridor(true);
                    return p;
                }
            }

        }

        return politico;
    }
}
