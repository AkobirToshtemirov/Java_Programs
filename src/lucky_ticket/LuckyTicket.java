package lucky_ticket;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you ticket number(6 digits between 000001 and 999999): ");
        String ticketNum = sc.nextLine();
        int sumPresent = 0;
//        int initial = initialThree(ticketNum);
//        System.out.println(initial);

//        int palindrome = palindromeTicket(ticketNum);
//        System.out.println(palindrome);

//        int res = sameFrontandBack(ticketNum);
//        System.out.println(res);
    }


    // 1
    static int initialThree(String ticketNum){
        int n = ticketNum.length();
        int sumFront = 0;
        for(int i = 0; i < n / 2; i++)
            sumFront += Integer.parseInt(ticketNum.substring(i, i + 1));
        int sumBack = 0;
        for(int j = n / 2; j < n; j++)
            sumBack += Integer.parseInt(ticketNum.substring(j, j + 1));
        return (sumFront == sumBack) ? 100_000 : 0;
    }

    // 2
    static int palindromeTicket(String ticketNum) {
        int ticket = Integer.parseInt(ticketNum);
        int sum = 0;
        int tempTicket = ticket;
        while(0 < ticket){
            int temp = ticket%10;
            ticket /= 10;
            sum = sum * 10 +temp;
        }

        return (sum == tempTicket) ? 200_000 : 0;
    }

    // 3
    static int sameFrontandBack(String ticketNum) {
        String front = ticketNum.substring(0, ticketNum.length()/2);
        String back = ticketNum.substring(ticketNum.length()/2);
        return (front.equals(back)) ? 300_000 : 0;
    }

    // 4
//    static int sameNum(String ticketNum) {
//
//    }


}
