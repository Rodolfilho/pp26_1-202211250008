package padroes.atividadeDebate.log;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerenciarLogs {


    private static final Path CAMINHO = Path.of(Caminho.CAMINHO_ARQUIVO);

    // Formato da data e hora (Ex: 13/05/2026 19:30:00)
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static boolean gravar(String mensagem) {
        //Grava uma nova linha de log no final do arquivo, preservando os antigos

        String dataHora = LocalDateTime.now().format(FORMATADOR);
        String linhaLog = "[" + dataHora + "] " + mensagem + "\n";

        try {

            Files.writeString(CAMINHO, linhaLog, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            return false;
        }
    }


    public static String lerLogs() {
        //retorna todos os logs de uma vez
        try {
            if (Files.exists(CAMINHO)) {
                return Files.readString(CAMINHO);
            }
            return "Nenhum log registrado ainda.";
        } catch (IOException e) {
            return "Erro ao ler arquivo: " + e.getMessage();
        }
    }


}