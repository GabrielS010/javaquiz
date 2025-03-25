public class Cabecalho {
    public static void exibirCabecalho() {
        System.out.println(" Universidade Alfredo Nasser");
        System.out.println(" Curso: Engenharia de Software");
        System.out.println(" Aluno: Gabriel Silva Costa");
        System.out.println(" Professor: Brenno Pimenta");
        System.out.println("Bem-vindo ao Quiz de Conhecimentos Gerais!");
    }

    public static void exibirRodape(int corretas, int total) {
        double porcentagem = (double) corretas / total * 100;
        System.out.println(" Você acertou " + corretas + " de " + total + " questões.");
        System.out.println(" Porcentagem de acertos: " + String.format("%.2f", porcentagem) + "%");
    }

    public static void exibirMensagemResultado(boolean correta, String respostaCorreta) {
        if (correta) {
            System.out.println("Parabéns, resposta correta!");
        } else {
            System.out.println("Resposta incorreta, a correta seria: " + respostaCorreta);
        }
    }
}
