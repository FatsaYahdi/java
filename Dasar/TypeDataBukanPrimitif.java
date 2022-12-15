public class TypeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;
        
        Short iniShort; // null
        iniShort = 100;

        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        int age = 30;
        Integer ageObject = age;

        int ageLagi = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        long longAge = ageObject.longValue();
        float floatAge = ageObject.floatValue();
    }
}