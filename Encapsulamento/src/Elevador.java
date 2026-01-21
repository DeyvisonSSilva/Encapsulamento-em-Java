public class Elevador {

    //Atributos
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    // ===== Getters e Setters =====
    public int getAndarAtual() {return andarAtual;}
    private void setAndarAtual(int andarAtual) {this.andarAtual = andarAtual;}

    public int getTotalAndares() {return totalAndares;}
    private void setTotalAndares(int totalAndares) {this.totalAndares = totalAndares;}

    public int getCapacidade() {return capacidade;}
    private void setCapacidade(int capacidade) {this.capacidade = capacidade;}

    public int getPessoasPresentes() {return pessoasPresentes;}
    private void setPessoasPresentes(int pessoasPresentes) {this.pessoasPresentes = pessoasPresentes;}

    // ===== Metodo inicializar =====
    public void inicializar(int capacidade, int totalAndares) {
        setCapacidade(capacidade);
        setTotalAndares(totalAndares);
        setAndarAtual(0);
        setPessoasPresentes(0);
    }

    // ===== Metodo entrar =====
    public void entrar() {
        if (getPessoasPresentes() < getCapacidade()) {
            setPessoasPresentes(getPessoasPresentes() + 1);
            System.out.println("Uma pessoa entrou no elevador. Pessoas presentes: " + getPessoasPresentes());
        } else {
            System.out.println("Elevador cheio! Não é possível entrar.");
        }
    }

    // ===== Metodo sair ======
    public void sair() {
        if (getPessoasPresentes() > 0) {
            setPessoasPresentes(getPessoasPresentes() - 1);
            System.out.println("Uma pessoa saiu do elevador. Pessoas presentes: " + getPessoasPresentes());
        } else {
            System.out.println("Elevador vazio! Ninguém para sair.");
        }
    }

    // ===== Metodo Subir =====
    public void subir() {
        if (getAndarAtual() < getTotalAndares()) {
            setAndarAtual(getAndarAtual() + 1);
            System.out.println("Elevador subiu para o andar: " + getAndarAtual());
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    // ===== Metodo Descer =====
    public void descer() {
        if (getAndarAtual() > 0) {
            setAndarAtual(getAndarAtual() - 1);
            System.out.println("Elevador desceu para o andar: " + getAndarAtual());
        } else {
            System.out.println("Já está no térreo!");
        }
    }

    // ===== Metodo para mostrar status do elevador =====
    public void status() {
        System.out.println("=== Status do Elevador ===");
        if (getAndarAtual() > 0){
        System.out.println("Andar atual: " + getAndarAtual());
        } else { System.out.println("Andar atual: Térreo");}
        System.out.println("Total de andares: " + getTotalAndares());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Pessoas presentes: " + getPessoasPresentes());
    }
}