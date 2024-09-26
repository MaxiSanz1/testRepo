package cuentasBancarias;

public class CuentaCorriente extends Cuenta {
    private double saldo;
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public CuentaCorriente(){

    }
    @Override
    public void extraer(double monto) {
        if (this.getSaldo() >= monto){
            setSaldo(monto);
        }
        throw new UnsupportedOperationException("Unimplemented method 'extraer'");
    }

    @Override
    public double ingresar(double monto) {
        
        throw new UnsupportedOperationException("Unimplemented method 'ingresar'");
    }

    @Override
    public double transferir(double monto) {
        
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }
    
}
