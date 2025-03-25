import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns, resposta correta! - Letra: " + this.correta);
            System.out.println();
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println();
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp.toUpperCase();
    }

    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite A, B, C, D ou E.");
        System.out.println();
        return false;
    }

    public void escrevaQuestao() {
        System.out.println(pergunta);
        System.out.println(opcaoA);
        System.out.println(opcaoB);
        System.out.println(opcaoC);
        System.out.println(opcaoD);
        System.out.println(opcaoE);
        System.out.println();
    }

    public static List<Questao> carregarQuestoes() {
        List<Questao> questoes = new ArrayList<>();

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 1 - Qual é o maior planeta do Sistema Solar?";
            opcaoA = "A) Marte";
            opcaoB = "B) Vênus";
            opcaoC = "C) Júpiter";
            opcaoD = "D) Saturno";
            opcaoE = "E) Urano";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 2 - Quem desenvolveu a teoria da relatividade?";
            opcaoA = "A) Isaac Newton";
            opcaoB = "B) Nikola Tesla";
            opcaoC = "C) Albert Einstein";
            opcaoD = "D) Galileu Galilei";
            opcaoE = "E) Stephen Hawking";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 3 - Qual é o elemento químico mais abundante no universo?";
            opcaoA = "A) Oxigênio";
            opcaoB = "B) Carbono";
            opcaoC = "C) Hidrogênio";
            opcaoD = "D) Ferro";
            opcaoE = "E) Hélio";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 4 - Qual foi a primeira civilização a desenvolver a escrita?";
            opcaoA = "A) Egípcios";
            opcaoB = "B) Fenícios";
            opcaoC = "C) Sumérios";
            opcaoD = "D) Gregos";
            opcaoE = "E) Romanos";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 5 - Qual é a capital do Canadá?";
            opcaoA = "A) Vancouver";
            opcaoB = "B) Toronto";
            opcaoC = "C) Montreal";
            opcaoD = "D) Ottawa";
            opcaoE = "E) Quebec";
            correta = "D";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 6 - Quem pintou a Mona Lisa?";
            opcaoA = "A) Vincent van Gogh";
            opcaoB = "B) Pablo Picasso";
            opcaoC = "C) Leonardo da Vinci";
            opcaoD = "D) Michelangelo";
            opcaoE = "E) Rembrandt";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 7 - Qual é o menor país do mundo?";
            opcaoA = "A) Mônaco";
            opcaoB = "B) Vaticano";
            opcaoC = "C) San Marino";
            opcaoD = "D) Liechtenstein";
            opcaoE = "E) Andorra";
            correta = "B";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 8 - Quem foi o primeiro homem a pisar na Lua?";
            opcaoA = "A) Yuri Gagarin";
            opcaoB = "B) Buzz Aldrin";
            opcaoC = "C) Neil Armstrong";
            opcaoD = "D) Michael Collins";
            opcaoE = "E) Alan Shepard";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 9 - Qual é o maior osso do corpo humano?";
            opcaoA = "A) Fêmur";
            opcaoB = "B) Tíbia";
            opcaoC = "C) Rádio";
            opcaoD = "D) Úmero";
            opcaoE = "E) Clavícula";
            correta = "A";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 10 - Quem escreveu 'Dom Quixote'?";
            opcaoA = "A) Machado de Assis";
            opcaoB = "B) William Shakespeare";
            opcaoC = "C) Miguel de Cervantes";
            opcaoD = "D) José de Alencar";
            opcaoE = "E) Eça de Queirós";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 11 - Qual é a capital da Austrália?";
            opcaoA = "A) Sydney";
            opcaoB = "B) Melbourne";
            opcaoC = "C) Canberra";
            opcaoD = "D) Perth";
            opcaoE = "E) Brisbane";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 12 - Quantos lados tem um heptágono?";
            opcaoA = "A) 5";
            opcaoB = "B) 6";
            opcaoC = "C) 7";
            opcaoD = "D) 8";
            opcaoE = "E) 9";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 13 - Qual é o gás mais presente na atmosfera terrestre?";
            opcaoA = "A) Oxigênio";
            opcaoB = "B) Hidrogênio";
            opcaoC = "C) Nitrogênio";
            opcaoD = "D) Dióxido de carbono";
            opcaoE = "E) Gás hélio";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 14 - Quem foi o primeiro presidente do Brasil?";
            opcaoA = "A) Getúlio Vargas";
            opcaoB = "B) Marechal Deodoro da Fonseca";
            opcaoC = "C) Juscelino Kubitschek";
            opcaoD = "D) Dom Pedro II";
            opcaoE = "E) Floriano Peixoto";
            correta = "B";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 15 - Qual é o metal mais resistente do mundo?";
            opcaoA = "A) Ferro";
            opcaoB = "B) Titânio";
            opcaoC = "C) Tungstênio";
            opcaoD = "D) Platina";
            opcaoE = "E) Alumínio";
            correta = "C";
        }});


        return questoes;
    }
}
