public class For {
    public static void main(String[] args) {
        // tanpa henti
        // for(;;){
        //     System.out.println("Perulangan Tanpa Henti");
        // }

        // dengan kondisi
        var counter = 1;
        for( ;counter <= 10; ) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        // dengan init statement
        for(var counter1 = 1; counter1 <= 10 ; ) {
            System.out.println("Perulangan ke-" + counter1);
            counter1++;
        }

        // dengan post statement
        for(var counter2 = 1; counter2 <= 10 ; counter2++) {
            System.out.println("Perulangan ke-" + counter2);
            
        }
    }
}