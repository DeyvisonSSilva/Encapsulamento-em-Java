import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Pessoa
        Pessoa p1 = new Pessoa();
        p1.setNome("Deyvison");
        p1.setDataNascimento(LocalDate.of(2003, 5, 03));
        p1.setAltura(1.82f);

        System.out.println("------------------------------");
        p1.imprimirDados();
        System.out.println("------------------------------");

        //Jogador de futebol
        JogadorFutebol jogador = new JogadorFutebol();
        jogador.setNome("Neymar");
        jogador.setPosicao("Atacante");
        jogador.setDataNascimento(LocalDate.of(1992, 2, 5));
        jogador.setNacionalidade("Brasileiro");
        jogador.setAltura(1.75f);
        jogador.setPeso(68f);

        jogador.imprimirDados();
        System.out.println("------------------------------");

        //Elevador
        Elevador elevador = new Elevador();

        elevador.inicializar(2, 3);

        elevador.entrar();
        elevador.entrar();
        elevador.entrar();

        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();

        elevador.sair();

        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();

        System.out.println("------------------------------");
        elevador.status();
    }
}