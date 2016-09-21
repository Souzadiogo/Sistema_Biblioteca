package ed1.ulbra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Diogo on 12/09/2016.
 */
public class Autor {
    Scanner ler = new Scanner(System.in);
    String nome;
    String email;

    public void ler(ArrayList<Autor> cad){
        System.out.println("Digite o nome do autor: ");
        this.nome=ler.nextLine();
        System.out.println("Digite o email: ");
        this.email=ler.nextLine();
        cad.add(this);
    }

    public void mostrar(){
        System.out.println("Nome do autor:  " + this.nome);
        System.out.println("Email: " +this.email);
    }
}
