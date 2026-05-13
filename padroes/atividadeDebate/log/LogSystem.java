package padroes.atividadeDebate.log;

public class LogSystem {


    private static LogSystem instancia;
    private String filePath = Caminho.CAMINHO_ARQUIVO;



    private LogSystem() {

    }


    // O synchronized garante que duas threads não criem instâncias simultâneas
    public static synchronized LogSystem getInstancia() {
        if (instancia == null) {
            instancia = new LogSystem();
        }
        return instancia;
    }


    public String getFilePath(){
        return filePath;
    }

    public boolean registrarLog(String msg){
        return GerenciarLogs.gravar(msg);
    }

    public String getLogsRegister(){
        // retorna todos os logs de uma vez
        return GerenciarLogs.lerLogs();
    }
}