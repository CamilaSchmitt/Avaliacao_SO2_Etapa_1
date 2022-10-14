/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacione_bem;

/**
 *
 * @author camila.soares
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
