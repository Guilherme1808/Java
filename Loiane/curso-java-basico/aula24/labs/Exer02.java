package labs;

public class Exer02 {

    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.titulo = "Mastering ExJS";
        livro.autor = "Loiane Groner";
        livro.anoPublicacao = 2015;

        System.out.println("Nome do livro = " + livro.titulo);
    }
}