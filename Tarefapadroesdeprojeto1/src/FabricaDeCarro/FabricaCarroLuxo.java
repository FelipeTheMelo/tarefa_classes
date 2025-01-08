package FabricaDeCarro;

import br.com.fmelo.CarroLuxo;
import br.com.fmelo.ICarro;

public class FabricaCarroLuxo implements FabricaDeCarro {
    @Override
    public ICarro criarCarro() {
        return new CarroLuxo();
    }
}
