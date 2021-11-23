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
        pessoa.setBioTipo("Magra");
        
        //Setando os atributos do objeto
        carro.setCor("Amarelo");
        carro.setNumPortas(4);
        carro.setPlaca("RQW-9054");
        carro.setTipo("Camaro");
        
        //Imprimindo os atributos do objeto:
        System.out.println("Pessoa:");
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Sexo da pessoa: "+pessoa.getSexo());
        System.out.println("Idade da pessoa: "+pessoa.getCorCabelo());
        System.out.println("Altura da pessoa: "+pessoa.getAltura());
        System.out.println("BioTipo da pessoa: "+pessoa.getBioTipo());
     
        //Pulando linha
        System.out.println("\n");
        
        //Imprimindo os atributos do objeto:
        System.out.println("Carro:");
        System.out.println("Cor do carro: "+carro.getCor());
        System.out.println("Numero de portas do carro: "+carro.getNumPortas());
        System.out.println("Placa do carro: "+carro.getPlaca());
        System.out.println("Tipo do carro: "+carro.getTipo());
    }
}