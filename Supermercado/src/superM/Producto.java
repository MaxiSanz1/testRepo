package superM;

public class Producto {
    private double precio;
    private double peso;
    private String fechaVencimiento;
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    public void setFechaVencimiento(String fecha){
        this.fechaVencimiento = fecha;
    }
    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    public Producto(){

    }
}
