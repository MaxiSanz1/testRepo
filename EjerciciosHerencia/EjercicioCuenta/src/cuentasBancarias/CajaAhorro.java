package cuentasBancarias;

public class CajaAhorro extends Cuenta {
    
    private double saldo;
    
    public CajaAhorro(){

    }
    
    public CajaAhorro(int dni, String titular, double saldo){
        this.dni = dni;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void extraer(double monto) {
        if(this.saldo >= monto){
            setSaldo(monto);
        }
    }

    @Override
    public double ingresar(double monto) {
        return 0.0;
    }

    @Override
    public double transferir(double monto) {
        return 0.0;
    }
   
    public String toString(){
    return  "[dni= " + dni + "]" + "[Titular= " +  titular + "]" + "[Saldo= $" + this.saldo + " ]"; 
    //toString().concat("[Saldo= $" + this.saldo + "]");
   }
}
