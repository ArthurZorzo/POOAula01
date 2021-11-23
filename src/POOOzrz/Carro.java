/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOOzrz;

/**
 *
 * @author IFSC
 */

public class Carro {
   //Atributos
    String tipo;
    String cor;
    String placa;
    int numPortas;
    
    //Metódos(Comportamentos)
    void imprimeDadosCarro(){//não estarei retornando informação
        //Imprimindo os atributos do objeto:
        System.out.println("Carro:");
        System.out.println("Cor do carro: "+cor);
        System.out.println("Numero de portas do carro: "+numPortas);
        System.out.println("Placa do carro: "+placa);
        System.out.println("Tipo do carro: "+tipo);
        System.out.println("\n");
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}