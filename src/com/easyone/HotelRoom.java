package com.easyone;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();

        while (testcase > 0) {
            int totalNoOfRoom = 0;
            int Boys, Girls, perRoomSeat;
            Boys = scanner.nextInt();
            Girls = scanner.nextInt();
            perRoomSeat = scanner.nextInt();

            if (Boys % perRoomSeat == 0)
                totalNoOfRoom += Boys / perRoomSeat;
            else
                totalNoOfRoom += (Boys / perRoomSeat) + 1;

            if (Girls % perRoomSeat == 0)
                totalNoOfRoom += Girls / perRoomSeat;
            else
                totalNoOfRoom += (Girls/ perRoomSeat) + 1;

            System.out.println(totalNoOfRoom);

            testcase--;
        }

        scanner.close();
    }
}


