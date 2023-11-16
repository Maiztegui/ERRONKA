import java.util.Scanner;
package Kalkulagaiua.src;
public class main {
}
   int eragiketamota;
    Scanner num = new Scanner(System.in);
    public static void menua() {
        System.out.println("menua");
        System.out.println("===================================================================================");
        System.out.println("==========                     MALTUNA KALKULAGAILUA                     =========");
        System.out.println("===================================================================================");
        System.out.println("===== Ondorengo eragiketak egin ditzaket, sakatu zenbakia eta lagunduko dizut! ====");
        System.out.println("===================================================================================");
        System.out.println("==========                      · 1 BATUKETA                             ==========");
        System.out.println("==========                      · 2 KENKETA                              ==========");
        System.out.println("==========                      · 3 BIDERKETA                            ==========");
        System.out.println("==========                      · 4 ZATIKETA                             ==========");
        System.out.println("==========                      · 5 BERREKETA                            ==========");
        System.out.println("==========                      · 6 ERROKETA                             ==========");
        System.out.println("==========                      · 7 BUKATU PROGRAMA                      ==========");
        System.out.println("===================================================================================");
    }
        WHILE(eragiketazenbakia!=7){
        System.out.println("Sartu egin nahi duzun eragiketaren zenbakia");
        eragiketamota=num.nextInt();

        switch (eragiketamota) {
            case 1:
                BATUKETA();
                break;
            case 2:
                KENKETA();
                break;
            case 3:
                BIDERKETA();
                break;
            case 4:
                ZATIKETA();
                break;
            case 5:
                BERREKETA();
                break;
            case 6:
                ERROKETA();
                break;
            case 7:
                BUKATU_PROGRAMA();
                break;
            default:
                System.out.println("Eragiketa mota okerra. Sartu 1-7ra doan zenbaki bat");
                break;

        }





    }
    public static void main(String[] args) {
        menua();
    }



}

    private static void BUKATU_PROGRAMA() {
    }

    private static void ERROKETA() {
    }

    private static void BERREKETA() {
    }

    private static void ZATIKETA() {
    }

    private static void BIDERKETA() {
    }

    private static void KENKETA() {
    }

    private static void BATUKETA() {
    }

