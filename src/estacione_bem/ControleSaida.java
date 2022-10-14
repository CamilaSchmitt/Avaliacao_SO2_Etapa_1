/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacione_bem;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 * Classe ControleSaida
 * @author camila.soares
 * @author anita.nunes
 */
public class ControleSaida extends Thread {

    private Vagas vagas;
    private Semaphore mutex;
    private Semaphore c;

/**
  * Construtor da classe ControleSaida que serve para inicializar 
  * os atributos 
 */
    ControleSaida(Vagas vaga, Semaphore mutex, Semaphore controle) {
        this.vagas = vaga;
        this.mutex = mutex;
        this.c = controle;
    }

/**
   * Método herdado de Thread que chama o método EstacionarCarro.
   * Serve para controlar o tempo de pausa entre a saida de um carro 
   * e outro, também é importante lembrar que caso todas as vagas tenham
   * sido preenchidas o método não e utilizado.
 */
    @Override
    public void run() {

        while (true) {
            try {

                getC().release();
                getMutex().acquire();
                
                  sleep((long) (Math.random() * 1000));

                getVagas().SaindoCarro();

                getMutex().release();
                getC().acquire();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @return the vagas
     */
    public Vagas getVagas() {
        return vagas;
    }

    /**
     * @param vagas the vagas to set
     */
    public void setVagas(Vagas vagas) {
        this.vagas = vagas;
    }

    /**
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }

    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    /**
     * @return the c
     */
    public Semaphore getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Semaphore c) {
        this.c = c;
    }
}
