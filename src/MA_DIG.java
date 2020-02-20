public class MA_DIG {
    public static void main(String[] args) {
        Mas mas = new Mas();
        mas.createMas(5, 5, 1);//dddd


    }
}

class Mas {
    public void createMas(int x, int y, int z) {
        int[][] mass = new int[x][y];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = z;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }

    }


}
