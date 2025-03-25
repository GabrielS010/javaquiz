import java.util.List;

public class Main {
    public static void main(String[] args) {
        int contadorCorretas = 0;
        Cabecalho.exibirCabecalho(); // Exibe as informações da faculdade

        List<Questao> questoes = Questao.carregarQuestoes(); // Carrega as questões

        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            boolean correta = questao.isCorreta(resposta);
            if (correta) {
                contadorCorretas++;
            }
            Cabecalho.exibirMensagemResultado(correta, questao.correta);
        }

        Cabecalho.exibirRodape(contadorCorretas, questoes.size()); // Mostra o placar final
    }
}
