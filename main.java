import java.util.Scanner;
import instruments.*;


public class main {
    
    static Scanner scan = new Scanner(System.in);
    static formuls formul = new formuls();
    static listSorting sorted = new listSorting();
    static refactorString refactor = new refactorString();

    public static void main(String[] args) {

        int numberOfFormul = choose();

        switch(numberOfFormul) {
            case (1):
                formul.pifagor_g();
                break;

            case (2):
                formul.pifagor_k();
                break;
            };
        }

    private static int choose() {

        System.out.print("Выбирите формулу:\n 1 - Найти гипотенузу по теореме Пифагора\n2 - Найти катет по теореме Пифагора\n>>> ");
        int variable = scan.nextInt();

        return variable;
    }
}
