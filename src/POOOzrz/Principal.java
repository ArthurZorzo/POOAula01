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
public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();//Setando a variavel carro é igual ao objeto Carro
        Pessoa pessoa = new Pessoa();//Setando a variavel pessoa é igual ao objeto pessoa
        double imc;
        
        //Setando os atributos do objeto      
        pessoa.setNome("Jorge");
        pessoa.setSexo("Masculino");
        pessoa.setIdade(96);
        pessoa.setCorCabelo("Branco");
        pessoa.setAltura(1.77);
        pessoa.setBioTipo("Magro");
        
        //Setando os atributos do objeto
        carro.setCor("Amarelo");
        carro.setNumPortas(4);
        carro.setPlaca("RQW-9054");
        carro.setTipo("Camaro");
        
        //carro.imprimeDadosCarro();
        //pessoa.imprimeDadosPessoa();
        
        double a = 3;
        double b = 2;
        
        System.out.println("Quadrado de "+a+" é :"+Calculo.elevar(a));
    }
}