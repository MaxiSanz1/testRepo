package superM;

public class Cereales extends Producto {
    private String marca;
    private String tipoDeCereal;
    private double precio;

    public String getTipoDeCereal() {
        return tipoDeCereal;
    }

    public void setTipoDeCereal(String tipoDeCereal) {
        this.tipoDeCereal = tipoDeCereal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public Cereales(String marca, String tipoDeCereal, double precio) {
        this.marca = marca;
        this.tipoDeCereal = tipoDeCereal;
        this.precio = precio;
    }

    public String toString() {
        return "La marca del cereal es: " + marca + "el tipo de cereal es: " + tipoDeCereal
                + "el precio del cereal es: " + precio;
    }
}
