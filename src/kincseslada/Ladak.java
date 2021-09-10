package kincseslada;

import java.util.Scanner;

public class Ladak {

    String[] ladak = {"aranylada", "ezüstláda", "bronzláda"};
    int melyikLada;

    void beKer() {
        System.out.println("Melyik láda felirata igaz: \n"+ladak[0]+": Én rejtem a kincset!"+"\n"+ladak[1]+": Nem én rejtem a kincset!"+"\n"+ladak[2]+"Az aranyláda hazudik!\nVálassz melyik láda igaz válassz aranyláda(1),ezüstláda(2),bronzláda(3)");
        Scanner sc = new Scanner(System.in);
        melyikLada = sc.nextInt();
    }

    void ladakTartalma() {
        if (melyikLada == 1) {
            System.out.println("Én rejtem a kincset!");
        } else if (melyikLada == 2) {
            System.out.println("Nem én rejtem a kincset!");
        } else if (melyikLada == 3) {
            System.out.println("Az aranyláda hazudik!");
        }
    }

}
