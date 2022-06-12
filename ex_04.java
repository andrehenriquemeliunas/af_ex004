import java.util.Scanner;
public class ex_04{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);//Início Scanner
        int i, j, m[][] = new int [16][16];//Declaração das variáveis e vetor
        for (i = 0; i <= 16; i++){//Laço de repetição for para perguntar as linhas
            System.out.printf("Informe os elementos %da. linha: \n", (i + 1));//Solicita ao usuário que informe os elementos da linha correspondente
            for (j = 0; j <= 16; j++){//Laço de repetição for para adicionar o número da linha nas variáveis i e j
                System.out.printf("m[%d][%d] = ", i, j);//Exibe a coluna e linha
                m[i][j] = ler.nextInt();//Leitura do scanner da coluna e linha
            }
            System.out.printf("\n");//Print quebrando linha
        }
        System.out.printf("\n");//Print quebrando linha
        for (i = 0; i <= 16; i++){//Laço de repetição for
            for (j = 0; j <= 16; j++){//Laço de repetição for
                System.out.printf("%d ", m[i][j]);//Exibe as linhas no resultado
            }
            System.out.printf("\n");//Print quebrando linha
        }
    }
}