import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: Miguel Solon Augusto Lemes de Almeida");
        System.out.println("Professor: Brenno Pimenta da Costa");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");
        System.out.println("Tema: O Mundo Otaku (Animes e Mangás)");
        System.out.println();

        List<Questao> questoes = new ArrayList<>();

        int acertos = 0;

        questoes.add(new Questao("1) Qual é o nome do protagonista de Naruto que sonha em se tornar Hokage?",
                "Sasuke Uchiha",
                "Naruto Uzumaki",
                "Kakashi Hatake",
                "Shikamaru Nara",
                "Gaara",
                'B'));

        questoes.add(new Questao("2) Em One Piece, qual é o grande tesouro que todos os piratas buscam?",
                "All Blue",
                "One Piece",
                "Pluton",
                "Poseidon",
                "O diário de Oden",
                'B'));

        questoes.add(new Questao("3) Qual é o nome do caderno sobrenatural em Death Note que mata quem tiver o nome escrito nele?",
                "Life Note",
                "Shinigami Book",
                "Death Note",
                "Dark Note",
                "Soul Note",
                'C'));

        questoes.add(new Questao("4) Em Attack on Titan (Shingeki no Kyojin), qual é o nome do protagonista que jura exterminar todos os titãs?",
                "Levi Ackerman",
                "Armin Arlert",
                "Reiner Braun",
                "Eren Jaeger",
                "Erwin Smith",
                'D'));

        questoes.add(new Questao("5) Qual é a técnica de respiração principal usada por Tanjiro Kamado no início de Demon Slayer?",
                "Respiração da Água",
                "Respiração do Trovão",
                "Respiração da Fera",
                "Respiração do Vento",
                "Respiração da Chama",
                'A'));

        questoes.add(new Questao("6) Qual é o anime onde os estudantes frequentam a U.A. High School para se tornarem heróis e possuem 'Quirks'?",
                "Jujutsu Kaisen",
                "Tokyo Revengers",
                "My Hero Academia",
                "Black Clover",
                "Hunter x Hunter",
                'C'));

        questoes.add(new Questao("7) Quem é o renomado criador da famosa obra Dragon Ball?",
                "Eiichiro Oda",
                "Masashi Kishimoto",
                "Akira Toriyama",
                "Tite Kubo",
                "Hajime Isayama",
                'C'));

        questoes.add(new Questao("8) Em Fullmetal Alchemist: Brotherhood, qual é o princípio fundamental da alquimia praticada pelos irmãos Elric?",
                "Troca Equivalente",
                "Transmutação Absoluta",
                "Circuito de Energia",
                "Leis da Física",
                "Magia Natural",
                'A'));

        questoes.add(new Questao("9) Qual é o nome do shinigami que adora maçãs e deixa cair um Death Note no mundo humano?",
                "Rem",
                "Ryuk",
                "Gelus",
                "Sidoh",
                "King Enma",
                'B'));

        questoes.add(new Questao("10) Em Hunter x Hunter, qual é o nome do exame que os personagens fazem para se tornarem caçadores oficiais?",
                "Exame Chunin",
                "Exame Hunter",
                "Teste Zodiacal",
                "Prova de Sobrevivência",
                "Torneio de Artes Marciais",
                'B'));

        questoes.add(new Questao("11) Qual anime foca em um clube escolar de música leve e suas integrantes que formam a banda 'After School Tea Time'?",
                "Your Lie in April",
                "K-On!",
                "Bocchi the Rock!",
                "Beck",
                "Sound! Euphonium",
                'B'));

        questoes.add(new Questao("12) Em Jujutsu Kaisen, qual é o objeto amaldiçoado especial que Yuji Itadori engole no primeiro episódio?",
                "O Olho de Sukuna",
                "O Dedo de Ryomen Sukuna",
                "O Talismã do Dragão",
                "A Máscara Maldita",
                "O Coração de Satoru Gojo",
                'B'));

        questoes.add(new Questao("13) Qual esporte é o grande foco de competição no famoso anime Haikyuu!!?",
                "Basquete",
                "Futebol",
                "Vôlei",
                "Tênis",
                "Beisebol",
                'C'));

        questoes.add(new Questao("14) Em Tokyo Revengers, qual é a habilidade principal que o protagonista Takemichi Hanagaki possui?",
                "Ler mentes",
                "Viajar no tempo",
                "Super força",
                "Invisibilidade",
                "Telecinese",
                'B'));

        questoes.add(new Questao("15) O que o termo 'Otaku' amplamente representa na cultura pop mundial hoje?",
                "Um tipo de comida tradicional japonesa",
                "Uma pessoa apaixonada por cultura pop japonesa, animes e mangás",
                "Um mestre de artes marciais",
                "Um autor de mangás famoso",
                "Um samurai moderno",
                'B'));

        for (Questao questao : questoes) {
            questao.exibirQuestao();
            System.out.println("Qual a sua resposta: ");

            char resposta = scanner.next().toUpperCase().charAt(0);

            if (questao.verificarRespostaCorreta(resposta)) {
                System.out.println("Resposta Correta!");
                acertos++;
            } else {
                System.out.println("Resposta errada");
            }

            System.out.println();
        }

        System.out.println("Foram " + acertos + " acertos");

        double porcentagem = ((acertos * 100.0) / questoes.size());

        System.out.printf("Porcentagem de acertos: %.2f%% %n", porcentagem);

        System.out.println("Obrigado por participar do quiz otaku!");

        scanner.close();
    }
}
