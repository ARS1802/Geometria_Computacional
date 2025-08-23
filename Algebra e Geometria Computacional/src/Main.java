import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean confirmacao = false;
        String[] inputArr;
        do {
            System.out.println("Digite a dimensão da matriz (2x2)");
            String input = sc.nextLine();
            inputArr = input.split("x");
            System.out.println("As dimensões foram inseridas corretamente? (s/n)");
            String resposta = sc.nextLine();
            if(resposta.equals("s")){
                confirmacao = true;
            }
        }while(!confirmacao);

        int linhas = Integer.parseInt(inputArr[0]);
        int colunas = Integer.parseInt(inputArr[1]);

        Matriz matriz = new Matriz(linhas,colunas);
    }
}