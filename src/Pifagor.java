import java.sql.SQLOutput;
import java.util.Scanner;

public class Pifagor {
    public static void main(String[]args){
        Schet schet=new Schet(55,45);
        int gep=schet.gepot();
        System.out.println("гепотенуза равняетсья "+gep);
        System.out.println("--------------------");
        Schet shet2=new Schet();
        shet2.Schetsss();
    }
}
class Schet{
   private int catet1;
    private int catet2;
    public Schet(){};
    public Schet(int catet1, int catet2){
        this.catet1=catet1;
        this.catet2=catet2;
    }

    public int gepot(){
        int gep= catet1*catet1+catet2*catet2;
        return gep;
    }
    public void Schetsss(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите значения каке вам известны");
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        if((s1.equals("гипотенуза")&&s2.equals("катет"))||(s1.equals("катет")&&s2.equals("гипотенуза"))){
            System.out.println("введите значение гипотенузы");
            int gep=scanner.nextInt();
            System.out.println("введите значение известного вам катета");
            int cat=scanner.nextInt();
            int res=gep*gep-cat*cat;
            double res2=res/2;
            System.out.println("значение неизвестного катета равняеться "+res2);
        }
        else if(s1.equals("катет")&&s2.equals("катет")){
            System.out.println("введите значение первого катета");
            int cat1=scanner.nextInt();
            System.out.println("введите значение второго катета");
            int cat2=scanner.nextInt();
            int res=cat1*cat1+cat2*cat2;
            double res2=res/2;
            System.out.println("значение гипотенузы раняеться "+res2);
        }
    }
}
