/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacione_bem;

/**
 *
 * @author camila.soares
 */
public class Funcionario {
    
    private Boolean salario;
    private int acordado;
    private int dormindo;
    
    public Funcionario() {
        
        salario = false;
        acordado = 0;
        dormindo = 0;
    }
    
    public void run() {
        
    }
    
    public synchronized void acordarFuncionarioEntrada (Vagas vagass){
        
        try{
            System.out.println("Chamando o atendente do estacionamento!");
            
            if (getAcordado() == 0)
            {
                setAcordado(1);
                setSalario((Boolean) true);
                
                System.out.println("O atendente está trabalhado!!");
            }
            
            setDormindo( 1);
            notifyAll();
            
            vagass.EstacionaCarro();
            
            setDormindo(0);
            notifyAll();
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
        public synchronized void acordarFuncionarioSaida (Vagas vagass){
        
        try{
            System.out.println("Chamando o atendente do estacionamento!");
            
            setDormindo(1);
            notifyAll();
            
            vagass.SaindoCarro();
            
            setDormindo(0);
            notifyAll();
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @return the salario
     */
    public Boolean getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Boolean salario) {
        this.salario = salario;
    }

    /**
     * @return the acordado
     */
    public int getAcordado() {
        return acordado;
    }

    /**
     * @param acordado the acordado to set
     */
    public void setAcordado(int acordado) {
        this.acordado = acordado;
    }

    /**
     * @return the dormindo
     */
    public int getDormindo() {
        return dormindo;
    }

    /**
     * @param dormindo the dormindo to set
     */
    public void setDormindo(int dormindo) {
        this.dormindo = dormindo;
    }

    
}
