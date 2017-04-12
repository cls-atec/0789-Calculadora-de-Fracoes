package atec.flj;
import atec.flj.mat.NumeroInt;
import atec.flj.mat.Fracao;
public class TesteMat {
/*
 * -    Classe com main. Cria dois objetos quaisquer do tipo NumeroInt.
 *  De seguida cria um objeto do tipo Fracao. Cria uma nova fração seguindo o 
 *  mesmo metodo, e finalmente invoca o metodo Soma(), na primeira fração, passando-lhe
 *   como argumento a segunda fração. Finalmente imprime o resultado.
 */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NumeroInt int1 = new NumeroInt(2);
        NumeroInt int2 = new NumeroInt(5);
        Fracao f = new Fracao(int1,int2);
        Fracao f2 = new Fracao(new NumeroInt(5),new NumeroInt(101));
        f.soma(f2);
        System.out.println(f);
    }

}
