public class ForEach {
    public static void main(String[] args) {
        // tanpa
        String[] names = {
            "Satu","Dua","Tiga",
            "Empat","Lima","Enam"
        };
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // dengan
        foreach (String name : names){
            System.out.println(name);
        }
    }
}