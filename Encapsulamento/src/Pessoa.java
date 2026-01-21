import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private float altura;

    // ===== Getters e Setters =====
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public LocalDate getDataNascimento() {return dataNascimento;}
    public void setDataNascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento;}

    public float getAltura() {return altura;}
    public void setAltura(float altura) {this.altura = altura;}

    // ===== Metodo para calcular a idade =====
    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    // ===== Metodo para imprimir os dados =====
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + calcularIdade());
    }
}