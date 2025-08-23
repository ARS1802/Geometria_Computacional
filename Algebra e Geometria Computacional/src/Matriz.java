import java.util.Arrays;
import java.util.Scanner;
public class Matriz {
    Scanner sc = new Scanner(System.in);
//(Arthur) prefiro que essas variaveis se mantenham globais.
    int linhas = 0;
    int colunas = 0;
    int qntdTermos = 0;
//
    Matriz(int linhas, int colunas) {
        int [][] matriz = new int[linhas][colunas];
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = inserirTermos(matriz);
        System.out.println(Arrays.deepToString(matriz));
    }

//(Arthur) É só uma função interna para o primeiro preenchimento da matriz.
    public int[][] inserirTermos(int [][] matriz) {
        boolean confirmacao = false;
        System.out.printf("Selecione opção de preenchimento:\n(a) termo a termo\n(b) inserir array\n");
        String opcao = sc.nextLine();
        if (opcao.equals("a")) {
            System.out.println("Inserindo termo a termo:");
            do{
                for (int i = 0; i < linhas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        //(Arthur) Insere termo a termo.
                        System.out.printf("Insira o elemento [linha: %d][coluna: %d]: ", i, j);
                        matriz[i][j] = sc.nextInt();
                        qntdTermos++;
                        //
                    }
                }
                System.out.println("\nOs elementos foram inseridos corretamente? (s/n)");
                String resposta = sc.next();
                if(resposta.equals("s")){
                    confirmacao = true;
                }
            }while(!confirmacao);
        } else if(opcao.equals("b")) {
            System.out.println("Insera array no formato: 1,2,3,4\n(tendo em mente a dimensão da matriz fornecida)\n");
            do{
                System.out.println("array = ");
                String[] array = sc.nextLine().split(",");
                int q = 0;
                for (int i = 0; i < linhas; i++) {
                    for (int j = 0; j < colunas; j++) {
                        matriz[i][j] = Integer.parseInt(array[q++]);
                    }
                }
                System.out.println("Os elementos foram inseridos corretamente? (s/n)");
                String resposta = sc.nextLine();
                if(resposta.equals("s")){
                    confirmacao = true;
                }
            }while(!confirmacao);
        }

        return matriz;
    }
//
}
