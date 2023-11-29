public class ClassMain {
    public static void main(String[] args) {
        char newChar = 'G';
        int newInt = 89;
        byte newByte = 4;
        short newShort = 56;
        float newFloat = 4.7333436f;
        double newDouble = 4.355453532;
        long newLong = 12121;

        Character newCharacterObject = newChar;
        Integer newIntegerObject = newInt;
        Byte newByteOObject = newByte;
        Short newShortObject = newShort;
        Float newFloatObject = newFloat;
        Double newDoubleObject = newDouble;
        Long newLongObject = newLong;

        int number = 345;
        int firstNum = number / 100;
        int secondNum = (number / 10) % 10;
        int thirdNum = number % 10;

        System.out.println("char: " + newChar + "; int:" + newInt + "; byte: " + newByte + "; short: " + newShort + "; float: " + newFloat + "; double: " + newDouble + "; long: " + newLong);
        System.out.println("Character: " + newCharacterObject + "; Integer: " + newIntegerObject + "; Byte: "+ newByteOObject + "; Short: " + newShortObject + "; Float: " + newFloatObject + "; Double: " + newDoubleObject + "; Long: " + newLongObject);
        System.out.println("Число " + number + " -> " + firstNum + ", " + secondNum + ", " + thirdNum);


    }
}