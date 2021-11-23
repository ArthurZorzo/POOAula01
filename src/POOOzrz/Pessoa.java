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
public class Pessoa {
    //Atributos
    String nome;
    String sexo;
    int idade;
    double altura;
    String corCabelo;
    String bioTipo;
    
    //Metódos
    void imprimeDadosPessoa(){
        //Imprimindo os atributos do objeto:
        System.out.println("Pessoa:");
        System.out.println("Nome: "+nome);
        System.out.println("Sexo da pessoa: "+sexo);
        System.out.println("Idade da pessoa: "+corCabelo);
        System.out.println("Altura da pessoa: "+altura);
        System.out.println("BioTipo da pessoa: "+bioTipo);
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public String getCorCabelo(){
        return corCabelo;
    }
    
    public void setCorCabelo(String corCabelo){
        this.corCabelo = corCabelo;
    }
    
    public String getBioTipo(){
        return bioTipo;
    }
    
    public void setBioTipo(String bioTipo){
        this.bioTipo = bioTipo;
    }
}