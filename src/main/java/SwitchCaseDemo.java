public class SwitchCaseDemo {
    public static void main(String[] args) {
        // Switch case cổ điển
        int month = 2;
        switch (month) {
            case 2:
                System.out.println("Có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" Có 30 ngày");
                break;
            default:
                System.out.println("Có 31 ngày!");
        }

        // Enhancements for Switch Statement in Java 13
        switch (month) {
            case 2 -> System.out.println("Có 28 hoặc 29 ngày");
            case 4, 6, 9, 11 -> System.out.println(" Có 30 ngày");
            default -> System.out.println("Có 31 ngày!");
        }

        String itemCode = "004";
        String text = switch (itemCode) {
            case "001":
                yield "It's a laptop!";
            case "002":
                yield "It's a desktop!";
            case "003":
                yield "It's a mobile phone!";
            default:
                yield itemCode + " is an unknown device!";
                // throw new IllegalArgumentException(itemCode + " is an unknown device!");
        };
        System.out.println("text = " + text);

        // Enhancements for Switch Statement in Java 13
        String itemCode2 = "001";
        String text2 = switch (itemCode2) {
            case "001" -> text.length() > 4 ? itemCode2 : "Hihi";
            case "002" -> "It's a desktop!";
            case "003" -> "It's a mobile phone!";
            default -> throw new IllegalArgumentException(itemCode + " is an unknown device!");
        };
        System.out.println("text2 = " + text2);
    }
}
