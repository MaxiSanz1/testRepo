package superM;

public class Vino extends Producto implements EsLiquido, ConDescuento {
    private String marca;
    private String tipoDeVino;
    private double gradosDeAlcohol;
    private double precio;
    private double valorDescuento;
    private double volumen;
    private String tipoEnvase;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setTipoDeVino(String tipoDeVino) {
        this.tipoDeVino = tipoDeVino;
    }

    public String getTipoDeVino() {
        return tipoDeVino;
    }

    public void setGradosDeAlcohol(int gradosDeAlcohol) {
        this.gradosDeAlcohol = gradosDeAlcohol;
    }

    public double getGradosDeAlcohol() {
        return gradosDeAlcohol;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public Vino(String marca, String tipoDeVino, double gradosDeAlcohol, double precio) {
        this.marca = marca;
        this.gradosDeAlcohol = gradosDeAlcohol;
        this.precio = precio;
        this.tipoDeVino = tipoDeVino;
    }

    public String toString() {
        return "La marca del vino es: " + marca + "los grados de alcohol son: " + gradosDeAlcohol + "el precio es: "
                + precio + "el tipo de alcohol es: " + tipoDeVino;
    }

    @Override
    public void setDescuento(double des) {
        this.valorDescuento = des;
    }

    @Override
    public double getDescuento() {
        return valorDescuento;
    }

    @Override
    public double getPrecioDescuento() {
        return this.precio -= valorDescuento;
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

}
