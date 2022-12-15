public class MethodVariableArgument {
    public static void main(String[] args) {
        // int[] values = {80, 80, 80, 80, 80};
        // sayCongrats(name : "Name",values);
    }


    // tanpa variable argument
    static void sayCongrats(String name, int.../*int[]*/ values) {
        int total = 0;
        for(var value : values) {
            total += value;
        }
        int finalValue = total / values.length;

        if(finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }
}