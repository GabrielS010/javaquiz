import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao {
    String pergunta;
    String opcaoA, opcaoB, opcaoC, opcaoD, opcaoE;
    String correta;

    void escrevaQuestao() {
        System.out.println(pergunta);
        System.out.println(opcaoA);
        System.out.println(opcaoB);
        System.out.println(opcaoC);
        System.out.println(opcaoD);
        System.out.println(opcaoE);
    }

    String leiaResposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sua resposta: ");
        return scanner.nextLine().trim().toUpperCase();
    }

    boolean isCorreta(String resposta) {
        return resposta.equals(correta);
    }

    public static List<Questao> carregarQuestoes() {
        List<Questao> questoes = new ArrayList<>();

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 1- Qual é o maior planeta do Sistema Solar?";
            opcaoA = "A) Marte";
            opcaoB = "B) Vênus";
            opcaoC = "C) Júpiter";
            opcaoD = "D) Saturno";
            opcaoE = "E) Urano";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 2- Quem desenvolveu a teoria da relatividade?";
            opcaoA = "A) Isaac Newton";
            opcaoB = "B) Nikola Tesla";
            opcaoC = "C) Albert Einstein";
            opcaoD = "D) Galileu Galilei";
            opcaoE = "E) Stephen Hawking";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 3- Qual é o elemento químico mais abundante no universo?";
            opcaoA = "A) Oxigênio";
            opcaoB = "B) Carbono";
            opcaoC = "C) Hidrogênio";
            opcaoD = "D) Ferro";
            opcaoE = "E) Hélio";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 4- Qual foi a primeira civilização a desenvolver a escrita?";
            opcaoA = "A) Egípcios";
            opcaoB = "B) Fenícios";
            opcaoC = "C) Sumérios";
            opcaoD = "D) Gregos";
            opcaoE = "E) Romanos";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 5- Qual é a capital do Canadá?";
            opcaoA = "A) Vancouver";
            opcaoB = "B) Toronto";
            opcaoC = "C) Montreal";
            opcaoD = "D) Ottawa";
            opcaoE = "E) Quebec";
            correta = "D";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 6- Quem pintou a Mona Lisa?";
            opcaoA = "A) Michelangelo";
            opcaoB = "B) Rafael";
            opcaoC = "C) Leonardo da Vinci";
            opcaoD = "D) Van Gogh";
            opcaoE = "E) Rembrandt";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 7- Quantos lados tem um hexágono?";
            opcaoA = "A) 5";
            opcaoB = "B) 6";
            opcaoC = "C) 7";
            opcaoD = "D) 8";
            opcaoE = "E) 9";
            correta = "B";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 8- Qual é o símbolo químico do ouro?";
            opcaoA = "A) Au";
            opcaoB = "B) Ag";
            opcaoC = "C) Fe";
            opcaoD = "D) Pb";
            opcaoE = "E) Hg";
            correta = "A";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 9- Qual é o maior oceano do mundo?";
            opcaoA = "A) Oceano Atlântico";
            opcaoB = "B) Oceano Índico";
            opcaoC = "C) Oceano Ártico";
            opcaoD = "D) Oceano Pacífico";
            opcaoE = "E) Oceano Antártico";
            correta = "D";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 10- Em que país nasceu o futebol?";
            opcaoA = "A) Brasil";
            opcaoB = "B) Inglaterra";
            opcaoC = "C) Alemanha";
            opcaoD = "D) Argentina";
            opcaoE = "E) Itália";
            correta = "B";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 11- Quem inventou a lâmpada elétrica?";
            opcaoA = "A) Albert Einstein";
            opcaoB = "B) Nikola Tesla";
            opcaoC = "C) Thomas Edison";
            opcaoD = "D) Isaac Newton";
            opcaoE = "E) Benjamin Franklin";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 12- Qual é o nome do maior deserto do mundo?";
            opcaoA = "A) Deserto do Saara";
            opcaoB = "B) Deserto da Arábia";
            opcaoC = "C) Deserto de Atacama";
            opcaoD = "D) Deserto de Gobi";
            opcaoE = "E) Deserto de Kalahari";
            correta = "A";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 13- Quem foi o primeiro presidente dos Estados Unidos?";
            opcaoA = "A) Thomas Jefferson";
            opcaoB = "B) George Washington";
            opcaoC = "C) Abraham Lincoln";
            opcaoD = "D) John Adams";
            opcaoE = "E) Franklin D. Roosevelt";
            correta = "B";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 14- Qual é a língua mais falada do mundo?";
            opcaoA = "A) Espanhol";
            opcaoB = "B) Inglês";
            opcaoC = "C) Mandarim";
            opcaoD = "D) Árabe";
            opcaoE = "E) Hindi";
            correta = "C";
        }});

        questoes.add(new Questao() {{
            pergunta = "QUESTÃO 15- Qual é o maior animal terrestre?";
            opcaoA = "A) Girafa";
            opcaoB = "B) Elefante africano";
            opcaoC = "C) Rinoceronte branco";
            opcaoD = "D) Hipopótamo";
            opcaoE = "E) Búfalo";
            correta = "B";
        }});

        return questoes;
    }
}
