
class Configuracao {

    // Única instância da classe
    private static Configuracao instancia;

    // Idioma do aplicativo
    private String idioma = "Português";

    // Impede a criação de objetos fora da classe
    private Configuracao() {
    }

    // Retorna sempre a mesma instância
    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }

        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}

public class Main {
    public static void main(String[] args) {

        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();

        config1.setIdioma("Inglês");

        System.out.println("Configuração 1: " + config1.getIdioma());
        System.out.println("Configuração 2: " + config2.getIdioma());

        System.out.println("Mesmo objeto? " + (config1 == config2));
    }
}
