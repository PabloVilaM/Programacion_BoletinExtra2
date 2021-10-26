package boletinextra2;


public class Conta {
    
    //Atributos
    
    private String nome;
    private String numero;
    private double interes;
    private double saldo;
    
    //Constructores
            
    public Conta(){
        
    }
    
    public Conta(String no, String nu, double in, double sal){
        nome = no;
        numero = nu;
        interes = in;
        saldo = sal;
    }
    
    //Metodos de acceso(getters y setters)
    
    public void setNome(String no){
        no = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNumero(String nu){
        nu = numero;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setInteres(double in){
        in = interes;
    }
    
    public double getInteres(){
        return interes;
    }
    
    public void setSaldo(double sal){
        saldo = sal;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    //Metodos
    
    public float Ingreso(float cantidad){
        float total = (float)saldo + cantidad;
        saldo = total;
        return total;
    }
    
    public float reIntegro(float cantidad){
        float total = (float)saldo - cantidad;
        saldo = total;
        return total;
    }
    
    public void transferencia(Conta contaF, float importe){
        contaF.saldo = contaF.saldo+importe;       //Esta estupidez, me ah costado 10m. Estoy rápido 
        
    }
    
    
}
