public class AdvCalculator {
    public double calculate() {
       String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        return switch (userSelected) {
           case "ADD" -> a + b;          // [1]
           case "SUB" -> a - b;          // [2]
           case "DIV" -> a / b;          // [3]
           case "MUL" -> a * b;          // [4]
           default -> 0;
       };
    }
}