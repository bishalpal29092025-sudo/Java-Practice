public class _27PinCheck {

    public static void main(String[] args) {
        String pin = "1234";
        boolean isValid = isValidPin(pin);
        System.out.println("Is the PIN valid? " + isValid);
    }

    public static boolean isValidPin(String pin) {
        return pin.equals("1234");
    }
}