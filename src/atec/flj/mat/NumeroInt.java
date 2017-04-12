package atec.flj.mat;

public class NumeroInt {
    private int numero;

    public NumeroInt(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "NumeroInt [numero=" + numero + "]";
    }
    
}
