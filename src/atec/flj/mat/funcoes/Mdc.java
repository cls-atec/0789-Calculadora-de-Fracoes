package atec.flj.mat.funcoes;
import atec.flj.mat.*;
// Maximo divisor comum
public class Mdc {
    public static NumeroInt get(NumeroInt a, NumeroInt b){
        int n1;
        int n2;
        int aux;
        if(a.getNumero()>b.getNumero()){
            n1=a.getNumero();
            n2=b.getNumero();
        }else{
            n1=b.getNumero();
            n2=a.getNumero();
        }
        while(true)
        {
            if(n1%n2==0)
                break;
            else{
                aux = n1;
                n1=n2;
                n2=aux%n2;
            }
        }
        
        return new NumeroInt(n2);
    }
}
