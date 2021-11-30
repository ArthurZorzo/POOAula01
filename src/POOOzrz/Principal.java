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
        Carro carro = new Carro();
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Jorge");
        pessoa.setSexo("Masculino");
        pessoa.setIdade(96);
        pessoa.setCorCabelo("Branco");
        pessoa.setAltura(1.77);
        pessoa.setBioTipo("Magro");
        
        carro.setTipo("Gol");
        carro.setCor("Vermelho");
        carro.setPlaca("TYK-576");
        carro.setNumPortas(4);
        carro.setDono(pessoa);
        
       pessoa.imprimeDadosPessoa();
       System.out.println("\n");
       carro.imprimeDadosCarro();
    }
}