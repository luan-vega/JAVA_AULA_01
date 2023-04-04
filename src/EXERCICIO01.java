import java.util.Scanner;

public class EXERCICIO01 {

    public static void main(String[] args)       {
        // É a função principal onde inserimos o código
        // Java deve estar inserido o código que você
        // deseja testar
        // A main é uma função pública, estática e
        // sem retorno (void).

        // Função de saída
        System.out.println("A aula de Java é mara!");
        System.out.println("E nós vamos aprender!");
        // Função de entrada
        Scanner entrada = new Scanner(System.in);
        // Variável -> um espaço na memória do computador
        // para armazenar temporariamente um dado
        // Tipos -> int (numeros inteiros), double
        // (numeros com casas decimais), float
        // (numeros com casas decimais), char (um
        // caracter), String (cadeira de caracteres)
        int idade;
        int idade2;
        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt();
        System.out.println("A idade digitada foi: "+ idade);
        System.out.println("Digite outra idade:");
        idade2 = entrada.nextInt();
        System.out.println("A idade digitada foi: "+ idade2);
    }
}


