import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zenbakia;
        menua();
        Scanner sc = new Scanner(System.in);
        System.out.println("Aukeratu eragiketa bat; idatzi dagokion zenbakia");
        zenbakia = sc.nextInt();
        while (zenbakia!=7){
            switch (zenbakia){
                case 1:
                    batuketa();
                    break;
                case 2:
                    kenketa();
                    break;
                case 3:
                    biderketa();
                    break;
                case 4:
                    zatiketa();
                    break;
                case 5:
                    berreketa();
                    break;
                case 6:
                    erroketa();
                    break;
                default:
                    System.out.println("Sartutako zenbakia ez dago aukeren artean");
            }
            menua();
            zenbakia = sc.nextInt();
        }
    }

    private static void menua() {
        System.out.println("===================================================================================");
        System.out.println("==================             MALTUNA KALKULAGAILUA              =================");
        System.out.println("===================================================================================");
        System.out.println("===== Ondorengo eragiketak egin ditzaket, sakatu zenbakia eta lagunduko dizut! ====");
        System.out.println("== 1. BATUKETA                                                                   ==");
        System.out.println("== 2. KENKETA                                                                    ==");
        System.out.println("== 3. BIDERKETA                                                                  ==");
        System.out.println("== 4. ZATIKETA                                                                   ==");
        System.out.println("== 5. BERREKETA                                                                  ==");
        System.out.println("== 6. ERROKETA                                                                   ==");
        System.out.println("== 7. BUKATU PROGRAMA                                                            ==");
        System.out.println("===================================================================================");
    }



    public static void batuketa() {


    }

    public static void biderketa() {

    }

    public static void erroketa() {

    }
    public static void kenketa() {

    }

    public static void berreketa() {

    }
    public static void zatiketa() {

    }

}

