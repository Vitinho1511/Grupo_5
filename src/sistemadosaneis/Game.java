/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadosaneis;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author antonio.acoliveira
 */
public class Game {
    public void showMenu(String gameName) {
    	this.showIntro();

        Scanner input = new Scanner(System.in);
        int option;

        do {                
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            
            System.out.print("\nEscolha uma opção: ");
            option = input.nextInt();
            
            switch (option) {
                case 1:
                    this.showInstructions();;
                    break;
                case 2:
                    System.out.println("Jogar...");
                    
                    boolean tutorial = showTutorial(input);
                    if (!tutorial) {
                        System.out.println("GAME OVER");
                        option = 4;
                        break;
                    }
                    break;
                case 3:
                    this.showCredits();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 4);

        input.close();
    }
    
    public void showIntro() {
    	System.out.println("################################################");
        System.out.println("##                                            ##");
        System.out.println("##           O SISTEMA DOS ANÉIS              ##");
        System.out.println("##                                            ##");
        System.out.println("################################################");
        System.out.println();
        
        System.out.println("┌──────────────────────────────────────────────┐");
        System.out.println("│ Na Terra-Média, a guerra não se trava        │");
        System.out.println("│ apenas com espadas, mas com CONHECIMENTO!    │");
        System.out.println("│                                              │");
        System.out.println("│ Cada raça guarda seu próprio sistema         │");
        System.out.println("│ numérico, e apenas um erudito capaz de       │");
        System.out.println("│ dominar todos poderá unir os povos...        │");
        System.out.println("└──────────────────────────────────────────────┘");
        System.out.println();
        
        System.out.println(">>> VOCÊ É A ÚLTIMA ESPERANÇA <<<");
        System.out.println();
        
        System.out.println("► Converta números em:");
        System.out.println("  [BATALHAS]    [NEGOCIAÇÕES]    [ALIANÇAS]");
        System.out.println();
        System.out.println("► Domine as bases:");
        System.out.println("  BINÁRIO • OCTAL • DECIMAL • HEXADECIMAL");
        System.out.println();
        
        System.out.println("================================================");
        System.out.println("   Prepare sua mente. A aventura aguarda...");
        System.out.println("================================================");
        System.out.println();
    }
    
    public void showInstructions() {
    	System.out.println("================================================");
        System.out.println("           🧙♂️ RPG TERRA-MÉDIA 🗡️           ");
        System.out.println("================================================");
        System.out.println();
        System.out.println("► CONVERSÕES NUMÉRICAS POR RAÇA:");
        System.out.println();
        System.out.println("  🪓 Anões    → Binário      (0-1)");
        System.out.println("  🏹 Elfos    → Octal        (0-7)");
        System.out.println("  🛡️ Humanos  → Decimal      (0-9)");
        System.out.println("  🔮 Magos    → Hexadecimal  (0-9, A-F)");
        System.out.println();
        System.out.println("► COMO JOGAR:");
        System.out.println("  Converta números durante:");
        System.out.println("  • Batalhas    • Negociações");
        System.out.println("  • Diálogos    • Comércio");
        System.out.println();
        System.out.println("► EXEMPLO:");
        System.out.println("  Elfo diz: '12' (octal)");
        System.out.println("  Você digita: 10 (decimal)");
        System.out.println();
        System.out.println("================================================");
	}
    
    public void showCredits() {
    	System.out.println("--------- Desenvolvedores ---------");
    	System.out.println("Antonio Augusto");
    	System.out.println("Gustavo Anibal");
    	System.out.println("Igor José");
    	System.out.println("João Vitor");
    }
    
    public boolean showTutorial(Scanner input) {
        System.out.println("Ano 2941 da Terceira Era...");
        System.out.println("A tensão entre os povos da Terra Média está no auge.");
        System.out.println("Anões e Elfos se enfrentam em uma batalha épica nos portões da Montanha Solitária.");
        System.out.println("Você é um jovem guerreiro, convocado para decidir o rumo da guerra.");
        System.out.println("Diante de você, dois caminhos se abrem:");
        System.out.println("1 - Juntar-se aos Anões, mestres da forja e da lógica binária.");
        System.out.println("2 - Alinhar-se aos Elfos, guardiões das runas antigas e da sabedoria octal.");
        System.out.print("\nEscolha sua raça (1 para Anões, 2 para Elfos): ");
        
        String race = "";
        String typeNum = "";
        int choice;
        do {
            choice = input.nextInt();
            
            switch(choice) {
                case 1: 
                    race = "dwarf";
                    typeNum = "binary";
                    break;
                case 2: 
                    race = "elf";
                    typeNum = "octal";
                    break;
                default: 
                    System.out.println("Opção inválida");
            }
        } while(choice != 1 && choice != 2);
        return true;
    }
    
    public String convertNumber(int num, String type) {
        switch (type.toLowerCase()) {
            case "binary":
                return Integer.toBinaryString(num);
            case "octal":
                return Integer.toOctalString(num);
            case "hex":
                return Integer.toHexString(num);
            default:
                return "Formato inválido. Use: binario, octal ou hexadecimal.";
        }
    }
    
    public int randomInt(int max) {
        return (int) (Math.random() * max) + 1;
    }
    
    public boolean dwarfWay(Scanner input) {
        System.out.println("\nVocê escolheu o caminho dos Anões.");
        System.out.println("Sua mente é afiada como um machado, pronta para decifrar os segredos do sistema binário.");
        System.out.println("A batalha ruge nos campos diante de Erebor. Soldados elfos avançam com precisão e velocidade, cercando os guerreiros anões. Thorin Escudo de Carvalho, empunhando sua lâmina ancestral, avista um artefato de guerra escondido entre os escombros — uma arma secreta dos antigos reis anões. Para ativá-la e causar dano aos inimigos, ele precisa decifrar um código binário gravado em sua superfície. \nCom o combate se intensificando, Thorin tem apenas 3 tentativas para converter corretamente o código e liberar seu poder contra os elfos. (Dica: o número é entre 1 e 10)");
        
        int randomInt = this.randomInt(10);
        String binary = this.convertNumber(randomInt, "binary");
        
        System.out.println("Converta '" + binary + "' para decimal.");
        
        int attempts = 3;
        boolean success = false;
        int choice;
        do {
            choice = input.nextInt();
            
            
        } while (attempts > 0 || success);
        return true;
    }
}
