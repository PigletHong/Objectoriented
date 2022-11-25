package Trans;

import javax.swing.*;

public class Taxi extends Trans{

    int maxPassenger = 4;       // 총 승객 수
    int charge;              // 택시 기본 요금
    int distanceMoney = 500;        // 거리당 요금
    int distancePlusMoney = 1000;   // 장거리 거리당 추가요금
    int money; // 번 돈
    int taxiOil;             // 버스 기름
    String taxiState;        // 택시 상태
    int destinationDistance;       // 목적지 거리
    String taxiDestinaion;        // 버스 상태
    int expectmoney = 0;


    public Taxi(int taxiNumber) {
        this.Number = taxiNumber;
        this.taxiOil = 100;
        this.taxiState = "일반";
        this.charge = 3000;
    }

    public void board(int n) {
        if (passengerCount + n > 4) {
            JOptionPane.showMessageDialog(null, "최대 승객 수 초과!", "Message", JOptionPane.ERROR_MESSAGE);
        } else if (passengerCount + n <= 4) {
            passengerCount += n;         // 승객 수 증가
        }
        taxiState = "운행중";
    }

    public void destinaion(String n) {
        taxiDestinaion = n;
    }

    public void distance(int n) {
        destinationDistance = n;

        if (n < 10) {
            money += charge + distanceMoney * n;
            expectmoney = charge + distanceMoney * n;;
        } else {
            money += charge + distancePlusMoney * n;
            expectmoney = charge + distancePlusMoney * n;
        }
    }


    public void chargeMoney(String n) { // 버스의 상태를 출력하는 Method
        if (n == "요금 결제" && taxiState == "운행중") {
            taxiState = "일반";
            passengerCount = 0;
            if (taxiOil <= 10) {
                taxiState = "운행 불가";
                System.out.println("현재 주유량은 " + taxiOil + "L 이고, 현재까지의 요금은 " + money + "원 입니다. " + "현재 이 택시는 " + taxiState + " 상태 입니다.");
            } else {
                System.out.println("현재 주유량은 " + taxiOil + "L 이고, 현재까지의 요금은 " + money + "원 입니다.");
            }
        }
    }


        public void putOil(int n){ // 오일을 넣는 Method
            taxiOil += n;
            if (taxiOil <= 10) {
                JOptionPane.showMessageDialog(null, "주유가 필요합니다!!", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }


        public void showInfo() { // 버스의 정보를 출력하는 Method

            System.out.println("택시 " + Number + "번의 승객은 " + passengerCount +
                    "명이고, 잔여 승객 수는 " + (maxPassenger - passengerCount) + "명 입니다." + " 기본 요금은 " + charge + "원 입니다." + "목적지인 " + taxiDestinaion + "까지의 거리는 "
                    + destinationDistance + "km이고 지불할 요금은 " + expectmoney + "원이고, " + "택시는 " + taxiState + " 입니다.");
        }
    }

