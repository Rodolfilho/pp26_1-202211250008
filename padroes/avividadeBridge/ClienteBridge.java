// Implementador.java
interface Implementador {
    void getDados(String tipo);
}

// PublicacaoImplBD.java
class PublicacaoImplBD implements Implementador {
    @Override
    public void getDados(String tipo) {
        System.out.println("[BD] PublicacaoImplBD.getDados() chamado para: " + tipo);
    }
}

// PublicacaoImplXML.java
class PublicacaoImplXML implements Implementador {
    @Override
    public void getDados(String tipo) {
        System.out.println("[XML] PublicacaoImplXML.getDados() chamado para: " + tipo);
    }
}

// Publicacao.java
abstract class Publicacao {
    protected Implementador imp;

    public Publicacao(Implementador imp) {
        this.imp = imp;
    }

    public void obterDados(String tipo) {
        System.out.println("Publicacao.obterDados() chamado.");
        imp.getDados(tipo); // Delega para a implementação
    }

    public abstract String getTitulo();
    public abstract String getAutor(int id);
}

// Livro.java
class Livro extends Publicacao {
    public Livro(Implementador imp) {
        super(imp);
    }

    public String getISBN() {
        System.out.println("Livro.getISBN() chamado.");
        return "123-456-789";
    }

    @Override
    public String getTitulo() {
        System.out.println("Livro.getTitulo() chamado.");
        return "Titulo do Livro";
    }

    @Override
    public String getAutor(int id) {
        System.out.println("Livro.getAutor() chamado com id: " + id);
        return "Autor do Livro";
    }
}

// Revista.java
class Revista extends Publicacao {
    public Revista(Implementador imp) {
        super(imp);
    }

    public String getArtigo() {
        System.out.println("Revista.getArtigo() chamado.");
        return "Artigo da Revista";
    }

    @Override
    public String getTitulo() {
        System.out.println("Revista.getTitulo() chamado.");
        return "Titulo da Revista";
    }

    @Override
    public String getAutor(int id) {
        System.out.println("Revista.getAutor() chamado com id: " + id);
        return "Autor da Revista";
    }
}


public class ClienteBridge {
    public static void main(String[] args) {
        System.out.println("=== TESTANDO O PADRAO BRIDGE ===");

        System.out.println("\n1. Instanciando um Livro com implementacao em Banco de Dados:");
        Implementador implBD = new PublicacaoImplBD();
        Publicacao meuLivro = new Livro(implBD);
        meuLivro.obterDados("Livro XPTO");
        meuLivro.getTitulo();
        ((Livro) meuLivro).getISBN();

        System.out.println("\n2. Instanciando uma Revista com implementacao em XML:");
        Implementador implXML = new PublicacaoImplXML();
        Publicacao minhaRevista = new Revista(implXML);
        minhaRevista.obterDados("Revista Tech");
        minhaRevista.getAutor(42);
        ((Revista) minhaRevista).getArtigo();
    }
}