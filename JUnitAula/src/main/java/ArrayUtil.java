import static sun.nio.cs.Surrogate.MIN;
import static sun.security.krb5.internal.LoginOptions.MAX;

public class ArrayUtil {

    public static int soma (int [] vetor){
        int resultado = 0;
        for (int j : vetor) {
            resultado +=j;
        }
        return resultado;
    }

    public static int menor (int[] vetor){
        int menor = MAX;
        for (int j : vetor) {
            if (j < menor){
                menor = j;
            }
        }
        return menor;
    }

    public static int maior(int [] vetor) {
        int maior = MIN;
        for (int j : vetor) {
            if (j > maior) {
                maior = j;
            }
        }
        return maior;
    }

    public static int negativo(int [] vetor){
        int qntNegativos = 0;
        for (int j : vetor){
            if (j < 0) {
                qntNegativos++;
            }
        }
        return qntNegativos;
    }

    public static boolean par (int [] vetor){
        boolean par = true;
        for (int j : vetor){
            if(j % 2 !=0){
                par = false;
                break;
            }
        }
        return par;
    }

    public static int busca (int [] vetor, double alvo){
        for (int i=0; i < vetor.length; i++){
            if (vetor [i] == alvo) {
                return -i;
            }
        }
        return -1;
    }
}
