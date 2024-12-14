package TarefaClasse;

public class Classe1 {

    /**
     * Classe que representa um carro.
     * Contém propriedades para descrever um carro e métodos simples para simular ações de um carro.
     */
    public static class Carro {
        //Propriedades (atributos)
        private final String marca;
        private final String modelo;
        private final int ano;
        private double velocidade;

        //Construtor para inicializar os atributos
        public Carro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.velocidade = 0.0; // O carro começa parado
        }

        //Método para acelerar o carro
        public void acelerar(double incremento) {
            velocidade += incremento;
            System.out.println("O carro acelerou. Velocidade atual: " + velocidade + " km/h");
        }

        //Método para frear o carro
        public void frear(double decremento) {
            velocidade -= decremento;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println("O carro freou. Velocidade atual: " + velocidade + " km/h");
        }

        //Método para exibir as informações do carro
        public void exibirDetalhes() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Velocidade atual: " + velocidade + " km/h");
        }

        //Método principal para teste
        public static void main(String[] args) {
            //Criando um objeto da classe Carro
            Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

            //Chamando os métodos
            meuCarro.exibirDetalhes();
            meuCarro.acelerar(30);
            meuCarro.frear(10);
        }
    }
}
