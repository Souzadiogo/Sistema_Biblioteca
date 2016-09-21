package ed1.ulbra;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int op=0;
        Scanner ler= new Scanner(System.in);
        ArrayList<Livro> cad = new ArrayList<Livro>();
        Livro l = new Livro();

        do{
            System.out.println("1 - Cadastrar livros:");
            System.out.println("2 - Mostrar livros: ");
            System.out.println("3 - Excluir livros: ");
            System.out.println("0 - Sair");
            op=ler.nextInt();

            switch (op){
                case 1:
                    Biblioteca b = new Biblioteca();
                    b.add(cad);
                    break;
                case 2:
                    l.listarcad(cad);
                    break;
                case 3:
                    l.removerLiv(cad);
                    break;
            }
        }while (op!=0);
    }
}
