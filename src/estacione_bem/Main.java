/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacione_bem;

import java.util.concurrent.Semaphore;

/**
 *Um semáforo é uma estrutura de dados que controle o acesso de aplicações aos recursos, 
 *baseando-se em um número inteiro, que representa a quantidade de acessos que podem ser 
 *feitos. Assim utilizamos semáforos para controlar a quantidade de acesso a determinado 
 *recurso.
 * @author camila.soares
 * @author anita.nunes
 */
public class Main {
    /**
    *Estrutura main, possui atributos do tipo Semaphore, também é responsável por dar start
    *no controleEntrada e controleSaida. 
    */
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        
        Vagas vagas = new Vagas (12);
        
        Semaphore mutex = new Semaphore(1);
        Semaphore controle = new Semaphore(1);
        Semaphore vagaDisponivel = new Semaphore(1);
        
        ControleEntrada re = new ControleEntrada (vagas, mutex, vagaDisponivel);
        ControleSaida rs = new ControleSaida (vagas, mutex, vagaDisponivel);
        
        re.start();
        rs.start();
    }
    
}
