public class Honda extends Carro {
    public Honda(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Honda modelo: " + getModelo());
    }
}
