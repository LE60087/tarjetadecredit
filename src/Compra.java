public class Compra {
    private double valor;
    private String descrpcion;

    public Compra(double valor, String descrpcion) {
        this.valor = valor;
        this.descrpcion = descrpcion;
    }
    public double getValor() {
        return valor;
    }

    public String getDescrpcion() {
        return descrpcion;
    }
    @Override
    public String toString() {
        return "Compras: valor=" + valor +
                ", descrpcion='" + descrpcion;
   }
}
