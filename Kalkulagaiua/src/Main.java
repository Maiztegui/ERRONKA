
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        kenketa();
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