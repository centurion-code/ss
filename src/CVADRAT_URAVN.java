import java.util.Scanner;

public class CVADRAT_URAVN {
    public static void main(String[]args){
    Qvadrat qv=new Qvadrat();
    Scanner scanner =new Scanner(System.in);
        System.out.println("введите значение a");
    int a=scanner.nextInt();
        System.out.println("введите значение b");
    int b=scanner.nextInt();
        System.out.println("введите значение c");
    int c=scanner.nextInt();
    double desc=qv.descrim(a,b,c);
        System.out.println("дескриминант равен "+desc);
        qv.solution(desc,a,b,c);
}
}
class Qvadrat{
    public double descrim( int a,int b,int c){
        int des=b*b-4*a*c;
        return des;
    }
    public void solution(double desc,int a,int b,int c){
        if (desc<0){
            System.out.println("уравнение не имеет корней");
        }
        else if(desc==0){
            System.out.println("уравнение имеет один корень");
            double x=-b/2*a;
            System.out.println("x="+x);
        }
        else if(desc>0){
            System.out.println("уравнение имеет 2 корня");
            double x1=(-b+Math.sqrt(desc))/2*a;
            double x2=(-b-Math.sqrt(desc))/2*a;
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);

        }
    }
}


