import java.util.Scanner;
public class Funcionario {
    protected int idade;

    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    protected double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    protected String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    protected int nascimento;

    public int getNascimento(){
        return nascimento;
    }

    public void setNascimento(int nascimento){
        this.nascimento = nascimento;
    }

    public void informarSalario(){
        System.out.println("Informe o salário");
        setSalario(scanner.nextDouble());
    }
    public void calcularIdade() {
        idade = 2024 - nascimento;

    }
}