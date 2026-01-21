import java.time.LocalDate;
import java.time.Period;

public class JogadorFutebol {

    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;

    // ===== Getters e Setters =====
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }

    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }

    // ===== Metodo para calcular a idade =====
    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    // ===== Metodo para imprimir os dados do jogador =====
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Tempo para aposentadoria: " + tempoParaAposentadoria() + " anos");
    }

    // ===== Metodo para calcular o tempo de aposentadoria =====
    public int tempoParaAposentadoria() {
        int idadeAtual = calcularIdade();
        int idadeAposentadoria;

        // ===== Definindo idade média de aposentadoria por posição =====
        switch (posicao.toLowerCase()) {
            case "defesa":
            case "defensor":
            case "zagueiro":
                idadeAposentadoria = 40;
                break;
            case "meio-campo":
            case "meio campo":
            case "meio-campista":
                idadeAposentadoria = 38;
                break;
            case "atacante":
            case "avançado":
            case "ponta":
                idadeAposentadoria = 35;
                break;
            default:
                idadeAposentadoria = 38; // padrão
        }

        int anosRestantes = idadeAposentadoria - idadeAtual;
        return (anosRestantes > 0) ? anosRestantes : 0; // não retorna negativo
    }
}