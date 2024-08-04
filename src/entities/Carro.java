package entities;

public class Carro {
    public String name;
    public String model;
    public int velocidade;
    public int ano;

    public Carro(){

    };

    public Carro(String name, String model, int velocidade, int ano) {
        this.name = name;
        this.model = model;
        this.velocidade = velocidade;
        this.ano = ano;
    }

    public void acelerar(int acelerar){
        this.velocidade += acelerar;
    }

    public void frear(int frear){
        this.velocidade -= frear;
    }

    public void buzinar(){
        System.out.println("Bibibib");
    }
}
