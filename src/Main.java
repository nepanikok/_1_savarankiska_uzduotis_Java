import java.util.Scanner;
public class Main {
    public static boolean onlyDigits(String str, int n)
    {
        for (int i = 0; i < n; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int sum1, sum2;
        int count = 0;
        String ticket;
        boolean win = false;
        boolean same = false;
        Scanner num = new Scanner(System.in);
        while (!win) {
            System.out.println("Enter ticket number");
            ticket = num.nextLine();
            int len = ticket.length();
            if (ticket.length() == 6 && onlyDigits(ticket, len)){
                for (int i = 0; i < 6; i++) {
                    for (int j = i+1; j < 6; j++) {
                        if (ticket.charAt(i) == ticket.charAt(j)) {
                            same = true;
                            break;
                        }
                    }
                }
                if (same){
                    System.out.println("Lost");
                    same = false;
                }
                else {
                    sum1 = Character.getNumericValue(ticket.charAt(0)) + Character.getNumericValue(ticket.charAt(1)) + Character.getNumericValue(ticket.charAt(2));
                    sum2 = Character.getNumericValue(ticket.charAt(3)) + Character.getNumericValue(ticket.charAt(4)) + Character.getNumericValue(ticket.charAt(5));
                    if (sum1==sum2){
                        System.out.println("Won");
                        win = true;
                    }
                    else System.out.println("Lost");
                }
            }
            else System.out.println("Wrong input or ticket number");
            count++;
        }
        System.out.println("Checked lottery tickets: " + count);
        }
    }
