public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default :
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // switch lambda
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus dengan Baik");
            case "B","C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        // tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Anda Lulus dengan Baik";
            case "B","C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> { 
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }
        

        // dengan yield
        String ucapan1 = switch (nilai) {
            case "A" : 
                yield "Anda Lulus dengan Baik";
            case "B", "C" :
                yield "Anda Lulus";
            case "D" :
                yield "Anda Tidak Lulus";
            default :
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan1);
    }
}