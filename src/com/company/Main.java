package com.company;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    int month;
    void input() {
        System.out.print("Nhập vào tháng muốn kiểm tra: ");
        this.month = scanner.nextInt();
    }
    public static void main(String[] args) {
        // write your code here
        Main m = new Main();
        m.input();
        String dayInMonth;
        switch (m.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                break;
            case 2:
                dayInMonth = "28 hoặc 29";
                break;
            default:
                dayInMonth = "";
                break;
        }
        if(dayInMonth != "") {
            System.out.printf("Tháng '%d' có %s ngày", m.month, dayInMonth);
        } else {

        }
    }
}
