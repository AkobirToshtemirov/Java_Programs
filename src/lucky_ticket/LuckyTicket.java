package lucky_ticket;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you ticket number(6 digits between 000001 and 999999): ");
        String ticketNum = sc.nextLine();
        int sumPresent = 0;
        int temp = 0;

        //1
        temp = initialThree(ticketNum);
        if(temp > sumPresent) sumPresent = temp;
        //2
        temp = palindromeTicket(ticketNum);
        if(temp > sumPresent) sumPresent = temp;
        //3
        temp = sameFrontandBack(ticketNum);
        if(temp > sumPresent) sumPresent = temp;
        //4
        temp = sameNum(ticketNum);
        if(temp > sumPresent) sumPresent = temp;
        //5
        temp = allSame(ticketNum);
        if(temp > sumPresent) sumPresent = temp;
        //6
        temp = allFive(ticketNum);
        if(temp > sumPresent) sumPresent = temp;
        //7
        temp = allSeven(ticketNum);
        if(temp > sumPresent) sumPresent = temp;
        //8
        temp = allNine(ticketNum);
        if(temp > sumPresent) sumPresent = temp;

        if(sumPresent > 0) System.out.println("Your present is: " + sumPresent);
        else System.out.println("No present available for this ticket number!");
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
    static int sameNum(String ticketNum) {
        int countFront = 1;
        for(int i = 0; i < ticketNum.length()/2 - 1; i++)
            if(ticketNum.charAt(i) == ticketNum.charAt(i + 1))
                countFront++;
        int countBack = 1;
        for(int j = ticketNum.length()/2; j < ticketNum.length() - 1; j++)
            if(ticketNum.charAt(j) == ticketNum.charAt(j + 1))
                countBack++;
        return (countBack == countFront && countFront == 3) ? 400_000 : 0;
    }

    //5
    static int allSame(String ticketNum) {
        int count = 0;
        for(int i = 0; i < ticketNum.length() - 1; i++)
            if(ticketNum.charAt(i) == ticketNum.charAt(i + 1)) count++;
        return (count == ticketNum.length() - 1) ? 500_000 : 0;
    }

    //6
    static int allFive(String ticketNum) {
        int ticket = Integer.parseInt(ticketNum);
        return (ticket/5 == 111_111) ? 500_000 : 0;
    }

    //7
    static int allSeven(String ticketNum) {
        int ticket = Integer.parseInt(ticketNum);
        return (ticket/7 == 111_111) ? 700_000 : 0;
    }

    //8
    static int allNine(String ticketNum) {
        int ticket = Integer.parseInt(ticketNum);
        return (ticket/9 == 111_111) ? 1_000_000 : 0;
    }

}
