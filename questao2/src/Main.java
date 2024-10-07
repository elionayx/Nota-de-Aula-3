import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        Gato g = new Gato("Cherry", "Maine Coon", "patas", "mia");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informações do Cachorro:");
        System.out.println("Nome: ");
        c.setNome(sc.nextLine());
        System.out.println("Raça: ");
        c.setRaca(sc.nextLine());
        System.out.println("Locomoção: ");
        c.setLocomocao(sc.nextLine());
        System.out.println("Late? ");
        c.setLate(sc.nextLine());

        System.out.println("Informações do Gato:");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Raça: " + g.getRaca());
        System.out.println("Locomoção: " + g.getLocomocao());
        System.out.println("Mia? " + g.getMia());
    }
}