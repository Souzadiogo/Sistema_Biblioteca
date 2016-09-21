package ed1.ulbra;

import java.util.ArrayList;

/**
 * Created by Diogo on 12/09/2016.
 */
public class Biblioteca {
    public static int cont=0;
    public static Livro[] livros = new Livro[100];
    ArrayList<Biblioteca> cad = new ArrayList<Biblioteca>();

    public void add(ArrayList<Livro> cad){ //metodo chama os objetos.
        Livro meuLivro = new Livro();
        meuLivro.ler(cad);
        livros[cont]=meuLivro;
        cont++;
    }
}
