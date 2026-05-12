package padroes.atividadeDebate.microfone;

public class Microfone {
    //no diagrama o microfone está publico
    private boolean microfoneStatus;
    //atributo para diferentes tempos
    private int tempo;

    public void ligar(){
        microfoneStatus = true;
    }

    public void desligar(){
        microfoneStatus = false;
    }

    //metodo adicionado para não quebrar o encapsulamento
    public boolean getMicrooneStatus(){
        return microfoneStatus;
    }

    public void passaTempo(int tempo){
        for(int i = 0; i < tempo; i++);
    }


}
