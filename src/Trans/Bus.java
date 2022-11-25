package Trans;

import javax.swing.*;

public class Bus extends Trans{
    int maxPassenger = 30;       // 총 승객 수
    int money;              // 버스 수입
    int busOil;             // 버스 기름
    String busState;        // 버스 상태


    // 매개변수로 버스 번호를 받는 생성자
    public Bus(int busNumber) {
        this.Number = busNumber;
        this.busState = "운행중";
        this.busOil = 100;
    }

    // 승객이 버스에 탈 때
    public void board(int n) {
        if (passengerCount + n > 30) {
            JOptionPane.showMessageDialog(null, "최대 승객 수 초과!", "Message",JOptionPane.ERROR_MESSAGE);}
        else if (passengerCount + n <= 30) {
            passengerCount += n;         // 승객 수 증가
            this.money += 1000 * n;      // 버스 요금 (매개변수 money)만큼 버스 수입이 증가
        }
    }

    public void putOil(int n) { // 오일을 넣는 Method
        busOil += n;
        if (busOil <= 10) {
            busState = "차고지행";
            JOptionPane.showMessageDialog(null, "주유가 필요합니다!!", "Message",JOptionPane.ERROR_MESSAGE);
        }
    }

    // 버스의 현재 정보 출력
    public void showInfo() { // 버스의 정보를 출력하는 Method
        System.out.println("버스 " + Number + "번의 승객은" + passengerCount +
                "명이고, 잔여 승객 수는 " + (maxPassenger - passengerCount) +"명 입니다." + " 수입은 " + money + "원 입니다.");
    }

    public void oilInfo() { // 버스의 정보를 출력하는 Method
        System.out.println("현재 버스의 주유량은 " + busOil + "L 입니다.");
    }

    public void busStates(String n) { // 버스의 상태를 출력하는 Method
        if (n == "상태 변경" && busState == "운행중") {
            busState = "차고지행";
            passengerCount = 0;
            money = 0;
        } else if (n == "상태 변경" && busState == "차고지행") {
            busState = "운행중";
        }
        System.out.println("현재 버스의 상태는 " + busState + " 입니다.");
    }

    public void busInfo() { // 버스의 정보를 출력하는 Method
        System.out.println("현재 버스의 상태는 " + busState + "이고, 현재 버스의 주유량은 " + busOil + "L 입니다.");
    }
}




