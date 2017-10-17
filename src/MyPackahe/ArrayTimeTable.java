package MyPackahe;

public class ArrayTimeTable {
    public static void main(String[] args) {
        String[][] firstArray = new String[10][10];
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                firstArray[i][j] = "" + (j + 1) + " x " + (i + 1) + " = " + (i + 1) * (j + 1);
                String a = firstArray[i][j];
                if ((11 - a.length()) == 1) {
                    System.out.print(firstArray[i][j] + " | ");
                }
                if ((11 - a.length()) == 2) {
                    System.out.print(firstArray[i][j] + "  | ");
                }
                if ((11 - a.length()) == 3) {
                    System.out.print(firstArray[i][j] + "   | ");
                }
            }
            System.out.println();
        }
        System.out.println(firstArray[2][5]);

    }
}

