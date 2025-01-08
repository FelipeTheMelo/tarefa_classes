package FabricaDeCarro;

import br.com.fmelo.ICarro;

public class LojaDeCarros {
    private FabricaDeCarro fabrica;

    public LojaDeCarros(FabricaDeCarro fabrica) {
        this.fabrica = fabrica;
    }

    public ICarro venderCarro() {
        ICarro carro = fabrica.criarCarro();
        carro.exibirInfo();
        return carro;
    }
}
