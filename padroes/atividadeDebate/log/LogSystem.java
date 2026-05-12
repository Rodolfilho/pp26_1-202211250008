package padroes.atividadeDebate.log;

public class LogSystem {

    // 1. Instância privada e estática da própria classe
    private static LogSystem instancia;
    private String filePath;


    // 2. Construtor privado para evitar instanciação direta
    private LogSystem() {

    }

    // 3. Método público estático para obter a instância
    // O synchronized garante que duas threads não criem instâncias simultâneas
    public static synchronized LogSystem getInstancia() {
        if (instancia == null) {
            instancia = new LogSystem();
        }
        return instancia;
    }

    //não sei se faz muito sentido
    public String getFilePath(){
        return filePath;
    }

    public void registrarLog(String msg){
        //filePath.add(msg)
    }

    public String getLogsRegister(){
        //
        return "String com os logs fomatados certinho";
    }
}
