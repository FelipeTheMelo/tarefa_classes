package br.com.fmelo;

import FabricaDeCarro.FabricaCarroLuxo;
import FabricaDeCarro.FabricaCarroPopular;
import FabricaDeCarro.LojaDeCarros;

public class app {
    public static void main(String[] args) {
        // Loja de carros populares
        LojaDeCarros lojaPopular = new LojaDeCarros(new FabricaCarroPopular());
        System.out.println("Cliente compra um carro:");
        lojaPopular.venderCarro();

        // Loja de carros de luxo
        LojaDeCarros lojaLuxo = new LojaDeCarros(new FabricaCarroLuxo());
        System.out.println("\nOutro cliente compra um carro:");
        lojaLuxo.venderCarro();
    }
}
