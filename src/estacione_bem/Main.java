/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacione_bem;

import java.util.concurrent.Semaphore;

/**
 *
 * @author camila.soares
 */
public class Main {
    
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
