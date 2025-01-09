public class BMW extends Carro {
    public BMW(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("BMW modelo: " + getModelo());
    }
}
