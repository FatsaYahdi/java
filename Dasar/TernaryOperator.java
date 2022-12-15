public class TernaryOperator {
    public static void main(String[] args) {
        // tanpa ternary
        var nilai = 75;
        String ucapan;
        if (nilai >= 75) {
            ucapan = "Anda Lulus";
        } else {
            ucapan = "Coba Lagi";
        }
        System.out.println(ucapan);

        // dengan ternary
        String ucapan2 = nilai >= 75 ? "Anda Lulus" : "Coba Lagi";
        System.out.println(ucapan2);
    }
}