public class Calculate {
    public static void main(String[]args){
        Calcul calc=new Calcul();
        calc.summ(5,5);
        System.out.println();
        calc.del(5,2);
        calc.del(5,0);
        System.out.println();
        calc.summ(5,"55");
        System.out.println();
        System.out.println(calc.del(0.55,0.5));

    }
}
class Calcul{
    public void summ(int a,int b){
        int res=a+b;
        System.out.println("result is "+res);
    }
    public int  del(int a,int b){
      try{  int del=a/b;
        return del;}
      catch(ArithmeticException e){
          System.out.println("на ноль делить нельзя "+e);
          return 999;
      }
    }
    public void summ(int a,String b){
       try{ int res=a+Integer.parseInt(b);
        System.out.println("result= "+res);}
       catch(Exception e){
           System.out.println("error "+e);
       }
    }
    public Double del(double a,double b){
        double res=a/b;
        return res;
    }
}
