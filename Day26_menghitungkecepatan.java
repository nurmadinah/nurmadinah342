import java.util.Scanner;

public static void main(String[] args) {

String Jaraktempuh = null;
String Waktutempuh = null;
try {
System.out.print("Masukkan Jarak Tempuh(km) :");
Jaraktempuh = in.readLine();

System.out.print("Masukkan Waktu Tempuh (jam) :");
Waktutempuh = in.readLine();

} catch(IOException ioe) {
System.out.println();
}
double JarakTempuh;
double WaktuTempuh;

JarakTempuh = Double.parseDouble(Jaraktempuh);
WaktuTempuh = Double.parseDouble(Waktutempuh);

double Kecepatan = JarakTempuh/WaktuTempuh;
System.out.println("Kecepatan : "+ Kecepatan);

int kecepatan = 40;
if (kecepatan > (threshold+1)) {
System.out.print(String.format("kecepatan : %d lebih dari: %d maka laju kendaraan cepat", kecepatan, threshold));
} else if (kecepatan == 40) {
System.out.print(String.format("kecepatan : %d sama dengan: %d maka laju kendaraan biasa", kecepatan, threshold));
} else {
System.out.print(String.format("kecepatan : %d kurang dari: %d maka laju kendaraan lambat", kecepatan, threshold));
}
}
}
