public class Jokking {
    public static void main(String[]args){
        System.out.println("hello friend");
        int x=1;
        System.out.println("перед началом цикла");
        while(x<=4){
            System.out.println("внутри цикла");
            System.out.println("x равно "+x);
            x=x+1;
        }
        System.out.println("цикл закончился");
        System.out.println();
        int y=3;
        if(y==3){
            System.out.println("y должен равняться 3");
        }
        System.out.println("эта строка выполняеться влюбом случае");
        System.out.println();
        int r=0;
        while(r<2){
            System.out.print("Doo");
            System.out.print("Bee");
            r++;
        }
        if(r==2){
            System.out.println("Be");
        }
        System.out.println();
        int bear=99;
        String word="бутылок";
        while(bear>=0){
            if(bear==1){
                word="бутылка";
                System.out.println(bear+" "+word+" на столе");
                System.out.println("возьми "+bear+" "+word+" пусти ее по кругу");
            }
            else if(bear>1){
                System.out.println(bear+" "+word+" на столе");
            }
            bear--;
            if(bear==0){
                System.out.println("пива нет");
            }
        }


    }
}
