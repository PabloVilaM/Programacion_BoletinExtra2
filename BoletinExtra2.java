package boletinextra2;

public class BoletinExtra2 {

    public static void main(String[] args) {
        
        //Distintos constructores
        
        Conta contaOrigen = new Conta();
        Conta contaDestino = new Conta("Pablo","7461893",55,20);
        
        //Probando metodos de acceso(settersm getters en el próximo parrafo)
        
        contaOrigen.setInteres(10);
        contaOrigen.setNome("Lucas");
        contaOrigen.setNumero("25724");
        contaOrigen.setSaldo(100);
        
        
        
        //Probando metodos
        contaOrigen.Ingreso(55);
        System.out.println("Tu nuevo saldo es de: "+ contaOrigen.getSaldo()); //Otro metodo diferente al de abajo.
        contaOrigen.reIntegro(55);
        double segundoNuevoSaldo = contaOrigen.getSaldo();
        System.out.println("Tu segundo saldo es de: "+ segundoNuevoSaldo);
        
       contaOrigen.transferencia(contaDestino, 30);
      double despuesTransferencia = contaDestino.getSaldo();
        System.out.println("Tu saldo despues de la transferencia es: " + despuesTransferencia);
        
        //Si funciona todo bien, lo va a hacer tambien con un usuario.
        
    }
    
}
