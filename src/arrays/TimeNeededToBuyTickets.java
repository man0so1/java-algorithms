package arrays;

/**
 * Задача на leetcode - 2073. Time Needed to Buy Tickets
 * @see <a href="https://leetcode.com/problems/defanging-an-ip-address/description/">2073. Time Needed to Buy Tickets</a>
 */
public class TimeNeededToBuyTickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int operations = 0;

         while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[k] != 0 && tickets[i] - 1 >= 0) { tickets[i] -= 1; operations++; }
            }
        }

        return operations;
    }
}
