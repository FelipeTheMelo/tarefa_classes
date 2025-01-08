package FabricaDeCarro;

import br.com.fmelo.CarroPopular;
import br.com.fmelo.ICarro;

public class FabricaCarroPopular implements FabricaDeCarro {
    @Override
    public ICarro criarCarro() {
        return new CarroPopular();
    }
}
