import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class KVADRAT_URAVN {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Uravn URAVN=new Uravn();
        System.out.println("введите значение первого коэфициента");
        double a=scanner.nextDouble();
        System.out.println("введите значение второго коэфициента");
        double b=scanner.nextDouble();
        System.out.println("введите значение третьего коэфициента");
        double c=scanner.nextDouble();
        URAVN.solution(a,b,c);

    }
}
class Uravn{
    public void solution(double a,double b,double c){
        double d=b*b-4*a*c;
        if(d<0){
            System.out.println("Это уравнение не имеет корней");
        }
        else if(d==0){
            System.out.println("Это уравнение имеет один корень");
            double k=(-b+Math.sqrt(d))/2*a;
            System.out.println("корень уравнения равняеться "+k);
        }
        else{
            System.out.println("Это уравнение имеет 2 корня");
            double l=-b+Math.sqrt(d)/2*a;
            double o=-b-Math.sqrt(d)/2*a;
            System.out.println("первый корень уравнения равняеться "+l);
            System.out.println("второй корень уравнения равняеться "+o);
        }
    }
}