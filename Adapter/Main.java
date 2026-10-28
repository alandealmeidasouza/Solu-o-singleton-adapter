package Adapter;


interface USBC {
    void carregar();
}

// Carregador antigo
class CarregadorAntigo {
    public void carregarUSB() {
        System.out.println("Carregando com USB antigo...");
    }
}

// Adaptador
class Adaptador implements USBC {

    private CarregadorAntigo carregador;

    public Adaptador(CarregadorAntigo carregador) {
        this.carregador = carregador;
    }

    @Override
    public void carregar() {
        carregador.carregarUSB();
    }
}

// Programa principal
public class Main {
    public static void main(String[] args) {

        CarregadorAntigo antigo = new CarregadorAntigo();

        USBC adaptador = new Adaptador(antigo);

        adaptador.carregar();
    }
}

