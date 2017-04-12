package atec.flj.mat.funcoes;
import atec.flj.mat.funcoes.Mdc;
import atec.flj.mat.NumeroInt;
public class Mmc {
    public static NumeroInt get(NumeroInt a, NumeroInt b){
        int n1;
        int n2;
        if(a.getNumero()>b.getNumero()){
            n1=a.getNumero();
            n2=b.getNumero();
        }else{
            n1=b.getNumero();
            n2=a.getNumero();
        }
        return new NumeroInt(
            (n1*n2)/Mdc.get(
                    new NumeroInt(n1), new NumeroInt(n2)
                    ).getNumero()
            );
    }
}
