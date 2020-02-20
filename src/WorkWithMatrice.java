public class WorkWithMatrice {

    public void FullOfMatrice(int matr[][],int value){ // метод который заполняет матрицу
        for(int i=0;i<matr.length;i++){
            for(int j=0;j<matr[i].length;j++){
                matr[i][j]=value;
            }
        }
    }
    public void PrintOfMatrice(int matr[][]){
     for(int i=0;i<matr.length;i++){
         for(int j=0;j<matr[i].length;j++){
             System.out.print(matr[i][j]+" ");
         }
         System.out.println();
     }
    }

    public int[][]FullDiagonaleOfMatrice(int x,int y,int left,int right,int value){ //метод создает,заполняет матрицу,заполняет ее диагонали, проверяет квадратная ли она и выводит ее
        int matrice[][]=new int[x][y];
      /*  for(int a=0;a<matrice.length;a++){
            for(int b=0;b<matrice[a].length;b++){
                if (matrice[b].length!=matrice.length){
                    System.out.println("not square");
                    return matrice;
                }
            }

        }*/
        FullOfMatrice(matrice,value);
        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice[i].length;j++){
                if(i==j){
                    matrice[i][j]=left;
                }
            }
        }
        for(int f=0;f<matrice.length;f++){
            for(int g=0;g<matrice[f].length;g++){
                if(f==matrice.length-g-1){
                    matrice[f][g]=right;
                }
            }
        }
     /*   for(int k=0;k<matrice.length;k++){  //цикл меняет цетр матрицы на заданное значение
            for(int l=0;l<matrice[k].length;l++){
                if(matrice.length%2==0||matrice[l].length%2==0){
                    break;

                }

                else if(k==matrice.length/2&&l==(matrice[k].length/2)){ //делим сначала длину матрицы на 2, получаем центральную строку
                    matrice[k][l]=5;                          // потом делим строку на 2 , находм централый индекс и отнимаем 1
                }                                                   // потому что в строке индексы идут с 0, то есть нам нужен индекс на один меньше
            }
        }*/
        PrintOfMatrice(matrice);
        return matrice;

    }
}
