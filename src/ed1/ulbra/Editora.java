package ed1.ulbra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Diogo on 12/09/2016.
 */
public class Editora {
    Scanner lerEd = new Scanner(System.in);
    String nomeEdit;
    String End;

    public void lerEd(ArrayList<Editora> cad){
        System.out.println("Digite o nome da editora: ");
        this.nomeEdit=lerEd.nextLine();
        System.out.println("Digite o endereço");
        this.End=lerEd.nextLine();
        cad.add(this);
    }

    public void mostrar(){
        System.out.println("Nome editora: " +this.nomeEdit);
        System.out.println("Endereço editora: " +this.End);
    }
}
