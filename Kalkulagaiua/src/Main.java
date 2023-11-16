import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        batuketa();
        biderketa();
        erroketa();
        kenketa();
    }
    public static void batuketa() {
        Scanner num=new Scanner(System.in);

        Double zenbakia1, zenbakia2,emaitza;

        System.out.println("===================================");
        System.out.println("====         BATUKETA           ====");
        System.out.println("===================================");
        System.out.println("Sartu lehenengo zenbakia");
        zenbakia1=num.nextDouble();
        System.out.println("Sartu bigarren zenbakia");
        zenbakia2=num.nextDouble();

        emaitza=zenbakia1+zenbakia2;
        System.out.println("Sartutako zenbakien batuketa "+emaitza+" da!");
        System.out.println("===================================");

    }

    public static void biderketa() {
        Scanner num=new Scanner(System.in);

        Double zenbakia1, zenbakia2,emaitza;

        System.out.println("===================================");
        System.out.println("====         BIDERKETA           ====");
        System.out.println("===================================");
        System.out.println("Sartu lehenengo zenbakia");
        zenbakia1=num.nextDouble();
        System.out.println("Sartu bigarren zenbakia");
        zenbakia2=num.nextDouble();

        emaitza=zenbakia1*zenbakia2;
        System.out.println("Sartutako zenbakien biderketa "+emaitza+" da!");
        System.out.println("===================================");
    }

    public static void erroketa() {
        Scanner num=new Scanner(System.in);

        Double zenbakia1, zenbakia2,emaitza;

        System.out.println("===================================");
        System.out.println("====         ERROKETA          ====");
        System.out.println("===================================");
        System.out.println("Sartu lehenengo zenbakia");
        zenbakia1=num.nextDouble();
        System.out.println("Sartu bigarren zenbakia");
        zenbakia2=num.nextDouble();

        emaitza=Math.pow(zenbakia1, (double) 1 / zenbakia2);;
        System.out.println("Sartutako zenbakien erroketa "+emaitza+" da!");
        System.out.println("===================================");
    }
    public static void kenketa() {
        Scanner num=new Scanner(System.in);

        Double zenbakia1, zenbakia2,emaitza;

        System.out.println("===================================");
        System.out.println("====         KENKETA           ====");
        System.out.println("===================================");
        System.out.println("Sartu lehenengo zenbakia");
        zenbakia1=num.nextDouble();
        System.out.println("Sartu bigarren zenbakia");
        zenbakia2=num.nextDouble();

        emaitza=zenbakia1-zenbakia2;
        System.out.println("Sartutako zenbakien kenketa "+emaitza+" da!");
        System.out.println("===================================");
    }

}
