package superM;

public class Detergente extends Producto implements EsLiquido, ConDescuento {
    private String marca;
    private double precio;
    private double des;
    private double volumen;
    private String tipoEnvase;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Detergente() {

    }

    @Override
    public void setDescuento(double des) {
        this.des = des;

    }

    @Override
    public double getDescuento() {
        return des;
    }

    @Override
    public double getPrecioDescuento() {
        return this.precio -= des;
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public String toString() {
        return "La marca del detergente es: " + marca + "y el precio es: " + precio;
    }
}
