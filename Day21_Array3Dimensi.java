public class Nurmadinah {
    public static void main(String[] args) {
        // Mendefinisikan array tiga dimensi
        int[][][] dinaArray = new int[3][4][5];

        // Mengisi array dengan data
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    dinaArray[i][j][k] = i * 100 + j * 10 + k;
                }
            }
        }

        // Mengakses dan mencetak isi array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.println("dinaArray[" + i + "][" + j + "][" + k + "] = " + dinaArray[i][j][k]);
                }
            }
        }
    }
}
