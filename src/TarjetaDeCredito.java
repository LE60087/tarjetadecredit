import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    public List<Compra> listaDeCompra = new ArrayList<>();

    public TarjetaDeCredito(double limite) {
        this.limite= limite;
        this.saldo = limite;
        this.listaDeCompra = new ArrayList<>();
    }
    public boolean lanzarCompra(Compra compra) {
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompra.add(compra);
            return true;
        }
        return false;
    }

    public double getLimiteCredito() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompra;
    }
}