package atec.flj.mat;
import atec.flj.mat.funcoes.Mmc;
public class Fracao {
    private NumeroInt numerador;
    private NumeroInt denominador;
    public Fracao(NumeroInt numerador, NumeroInt denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public NumeroInt getNumerador() {
        return numerador;
    }
    public void setNumerador(NumeroInt numerador) {
        this.numerador = numerador;
    }
    public NumeroInt getDenominador() {
        return denominador;
    }
    public void setDenominador(NumeroInt denominador) {
        this.denominador = denominador;
    }
    @Override
    public String toString() {
        String txt = "";
        txt+= "Fracao [numerador=" + numerador + ", denominador=" + denominador + "]\n";
        txt+= numerador.getNumero()+"/"+denominador.getNumero();
        return txt;
    }
    
    public void soma(Fracao f){
        NumeroInt mmc = Mmc.get(getDenominador(), f.getDenominador());

        int factorA = mmc.getNumero()/getDenominador().getNumero();
        int factorB= mmc.getNumero()/f.getDenominador().getNumero();

        setDenominador(mmc);
        setNumerador(
            new NumeroInt(
                getNumerador().getNumero() * factorA + f.getNumerador().getNumero() * factorB 
            )
        );
        
    }
}
