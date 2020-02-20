public class TEST {
    public static void main(String[] args) {
        WorkWithMatrice wm = new WorkWithMatrice();
        int matrice[][] = new int[10][10];
        wm.FullOfMatrice(matrice, 0);
        wm.PrintOfMatrice(matrice);
        System.out.println();
        wm.FullDiagonaleOfMatrice(10,10,1,1,5);
    }
}