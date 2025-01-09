public class Mercedes extends Carro {
    public Mercedes(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Mercedes modelo: " + getModelo());
    }
}
