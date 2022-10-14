/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacione_bem;

/**
 *Classe Vagas, ela é responsável por controlar todo o processo, pode-se dizer que ela é a classe base
 *do programa. Possui dois atributo do tipo int: totalVagas e vagasOcupadas.
 * @author camila.soares
 * @author anita.nunes
 */
public class Vagas {
    int totalVagas;
    int vagasOcupadas;
    
    Vagas(int total){
        this.totalVagas = total;
        this.vagasOcupadas = 0;
    }
    
    public int getTotal(){
        return this.totalVagas;
    }
    
/**
 *Serve para controlar o estacionamento de carros, se as vagas ocupadas forem menores que 
 *o número total de vagas disponivel então há espaço, senão o estacionamento está vazio.
 * @author camila.soares
 */
    public void EstacionaCarro() {
        
        if (this.vagasOcupadas < getTotal())
        {
            this.vagasOcupadas++;
            
            System.out.println("Carro entrando..."
                    + "Total de carros estacionados: " + vagasOcupadas);
		} 
        else {
	System.out.println("Carro tentando entrar ... "
                                + "Nao ha vagas disponiveis");
		}
	}

/**
 *Serve para controlar a saida de carros, se as vagas ocupadas forem maiores que 
 *0, então ainda há vagas para serem desocupadas, senão o estacionamento está vazio.
 * @author camila.soares
 */
    public void SaindoCarro() {
        
        if(this.vagasOcupadas > 0) 
        {
            this.vagasOcupadas--;
            System.out.println("Carro saindo ... "
                    + "Total de carros estacionados: " + vagasOcupadas);
        }  else {
            System.out.println("ESTACIONAMENTO VAZIO!!");
        }   
        }
    
}
