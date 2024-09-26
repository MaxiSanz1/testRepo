package cuentasBancarias;

import java.util.ArrayList;

public abstract class Cuenta {
    protected int dni;
    protected String titular;
    protected int nroCuenta;
    protected double saldo;
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String toString(){
        return "[dni= " + dni + "]" + "[Titular= " +  titular + "]" + "[Saldo= $" + this.saldo + " ]"; 
    }
    public abstract void extraer(double monto);
    public abstract double ingresar(double monto);
    public abstract double transferir(double monto);

    public static void main(String[] args) {
        ArrayList <Cuenta> lasCuentas = new ArrayList<Cuenta>();
        Cuenta ca1 = new CajaAhorro(12345678,"Maxi",10000);
        Cuenta ca2 = new CajaAhorro(41560994,"Lautaro Sanz",500000);
        lasCuentas.add(ca1);
        lasCuentas.add(ca2);
        //System.out.println(ca1);

        ca1.extraer(5000);
        //System.out.println(ca1);
        for (Cuenta a : lasCuentas) {  
            System.out.println(a);
        }
    }
}
