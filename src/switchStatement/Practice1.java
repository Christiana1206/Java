package switchStatement;

public class Practice1 {
    public static void main(String[] args) {
        int number = 0;

        switch (number) {

            default: // we can put default anywhere
                System.out.println("Not a valid value");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 1:
                System.out.println("case1");
                break;
            case 5:
                System.out.println("case 5");
                break;


        }

        String str = "oFfiCe".toLowerCase();

        switch (str) {
            case "":
                System.out.println("No one in home");
                break;
            case "home":
                System.out.println("You are at home");
                break;
            case "office":
                System.out.println("You are at the office");
                break;
            default:
                System.out.println("cool");
                break;

        }
    }
}
