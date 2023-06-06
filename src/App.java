
/*
    Find how many seconds passed between the two moments of time 
    on the same day.

    You are given the integer values representing these moments:
    hours, minutes and seconds for each of them.
    It is guaranteed that the earlier moment goes first in the input.
  
    Alright so:

    "For example, six numbers (1, 2, 30), (15, 21, 1) will represent two moments of time: 1:02:30 am and 3:21:01 pm (or just 15:21:01)."

    First moment in time = 1:02:30

    1 hour = 60 minutes so
    1 * 60 = 60 

    But then we have an extra 2 minutes left over 02:30 so
    take the time you converted before (which is 60) and add the extra minutes

    60 + 2 = 62 minutes
    now convert this to seconds, which goes something like this:

    1 minute = 60 seconds so
    62 * 60 = 3720

    But then we have an extra 30 seconds left over 02:(30) so
    take the time you converted before (which is 3720) and add the extra seconds
    3720 + 30 = 3750

    The answer for the first moment in time is 3750 seconds
    Repeat the following steps with the second moment in time: (15, 21, 1) which is 15:21:01

    Hours to minutes
    15 * 60 = 900
    add the extra minutes (21)
    900 + 21 = 921

    Convert to seconds
    921 * 60 = 55260
    add the extra seconds (1)
    55260 + 1 = 55261

    The answer for the second moment in time is 55261 seconds

    Finally subtract the second answer from the first answer, so:
    55261 - 3750 = 51511

    The final answer is 51511, which is verified by the following statement:
    "Just one number: seconds between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds) in our example."

    Just put this calculation into your code and you're good to go. Have fun learning Java :D
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt(); // hour
        int number2 = scanner.nextInt(); // minute
        int number3 = scanner.nextInt(); // second
        int number4 = scanner.nextInt(); // hour
        int number5 = scanner.nextInt(); // minute
        int number6 = scanner.nextInt(); // second

        // number 1 is hour
        // so 1 hour = 60 minutes
        number1 = number1 * 60;

        // number 2 is minute
        // so 1 minute = 60 seconds
        number2 = (number2 + number1) * 60;

        // sum seconds
        number3 = number3 + number2;

        number4 = number4 * 60;
        number5 = (number5 + number4) * 60;
        number6 = number6 + number5;

        int diferrenceBetween = number6 - number3;
        System.out.println(diferrenceBetween);

    }
}
