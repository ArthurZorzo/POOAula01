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
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    private Pessoa dono;//Ligação de 1 para 1
    private int cambio;
    
    void ligar(){
        System.out.println("Ligando o Carro");
    }
    void desligar(){
        System.out.println("Desligando o Carro");
    }
    
    void acelerar(){
        System.out.println("Acelerando o Carro");
    }
    
    void frear(){
        System.out.println("Freando o carro"); 
    }
    
    public Carro(){
        
    }
    
    public Carro(String tipo, String cor, String placa, int numPortas){
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }
    
    //Metódos(Comportamentos)
    void imprimeDadosCarro(){//não estarei retornando informação
        //Imprimindo os atributos do objeto:
        System.out.println("Carro:");
        System.out.println("Cor do carro: "+cor);
        System.out.println("Numero de portas do carro: "+numPortas);
        System.out.println("Placa do carro: "+placa);
        System.out.println("Tipo do carro: "+tipo);
        System.out.println("Dono do carro: "+dono.nome);
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
    
    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    
    public int getCambio() {
        System.out.println("Marcha: "+this.cambio);
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
}