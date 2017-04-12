package atec;
import atec.flj.mat.funcoes.*;
import atec.flj.mat.NumeroInt;
import atec.flj.mat.Fracao;
public class TestePackages {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
        System.out.println("MMC 4 16->"+Mdc.get(new NumeroInt(4), new NumeroInt(16)));
        System.out.println("MMC 16 4->"+Mdc.get(new NumeroInt(16), new NumeroInt(4)));
        
        
        System.out.println("MMC 3 9->"+Mmc.get(new NumeroInt(3), new NumeroInt(9)));
        System.out.println("MMC 9 3->"+Mmc.get(new NumeroInt(9), new NumeroInt(3)));
        */
        
        //System.out.println("MMC 3 2->"+Mmc.get(new NumeroInt(3), new NumeroInt(2)));
        
        Fracao f = new Fracao(new NumeroInt(9),new NumeroInt(10));
        f.soma(new Fracao(new NumeroInt(9),new NumeroInt(10)));
        System.out.println(f);
    }

}
