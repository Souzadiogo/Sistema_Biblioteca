package ed1.ulbra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Diogo on 12/09/2016.
 */
public class Livro {
    Scanner ler = new Scanner(System.in);
    ArrayList<Autor> cada = new ArrayList<Autor>();
    ArrayList<Editora> cadas = new ArrayList<Editora>();
    ArrayList<Livro> cad = new ArrayList<Livro>();
    String titulo;
    int nPag;
    int nExemplares;
    Editora e = new Editora();
    Autor a = new Autor();

    public void ler(ArrayList<Livro> cad) {
        System.out.println("Digite o título: ");
        this.titulo = ler.nextLine();
        System.out.println("Digite o numero de pag: ");
        this.nPag = ler.nextInt();
        System.out.println("Digite o numero de exemplares: ");
        this.nExemplares = ler.nextInt();
        this.a.ler(cada);
        this.e.lerEd(cadas);
        cad.add(this);
    }

    public void mostrar() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Número de paginas: " + this.nPag);
        this.a.mostrar(); /// mostar cadastrados
        this.e.mostrar();
        System.out.println(" ");
    }

    public void listarcad(ArrayList<Livro> cad) {
        for (Livro x : cad) {
            x.mostrar();
        }
    }

    public void removerLiv(ArrayList<Livro> cad) {
        boolean flag = false;

        System.out.println("Digite o nome do livro a excluir:");
        this.titulo = ler.nextLine();
        for (int i = 0; i < cad.size(); i++) {
            if (this.titulo.equals(cad.get(i).titulo)) {
                cad.remove(i);
                flag = true;
            }
        }
        if (flag == true)
            System.out.println("Livro excluido com sucesso.");
        else
            System.out.println("Livro não encontrado.");

    }
}
