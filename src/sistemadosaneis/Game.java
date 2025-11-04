/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadosaneis;

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
}
