package labs;

public class Exer03 {

    public static void main(String[] args) {

        LivroDeLivraria livro = new LivroDeLivraria();

        livro.titulo = "Mastering ExJS";
        livro.autor = "Loiane Groner";
        livro.anoPublicacao = 2015;
        livro.precoLivro = 63.39;

        System.out.println("Nome do livro = " + livro.titulo);

    }
}