package Program;

import entities.Carro;

public class ProgramCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.name = "Uno";
        c1.model = "Fiat";
        c1.ano = 1995;
        c1.velocidade = 70;
        System.out.println(c1.velocidade);


        c1.acelerar(10);
        System.out.println(c1.velocidade);

        c1.frear(10);
        System.out.println(c1.velocidade);


    }
}
