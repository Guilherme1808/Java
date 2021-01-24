package labs;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;
        boolean valido = false;

        do {
            System.out.println("Entre com o nome do usuário:");
            nome = scan.next();
            System.out.println("Entre com a senha do usuário:");
            senha = scan.next();

            if (!nome.equalsIgnoreCase(senha)) {
                valido = true;
            } else {
                System.out.println("Usuário e senha não podem ser iguais!");
                System.out.println("Tente novamente.");
            }
        } while (!valido);
        System.out.println("Usuário: " + nome);
        System.out.println("Senha: " + senha);
    }
}