package Trans;

public class Trans {

    int Number;          // 번호
    int passengerCount;     // 승객 수


    public static void main(String[] args) {
        Bus bus100 = new Bus(1234); // 100번 버스 생성
        Bus bus200 = new Bus(5678); // 200번 버스 생성
        System.out.println("100번 버스의 번호: " + bus100.Number +", 200번 버스의 번호: " + bus200.Number);

        bus100.board(2); // 승객 2명 탑승.
        bus100.showInfo(); // 버스 정보 출력
        bus100.putOil(-50); // 버스에 오일 소모
        bus100.oilInfo();
        bus100.busStates("상태 변경"); // 상태 변경
        bus100.putOil(10); // 버스에 오일 주입
        bus100.busInfo(); // 버스 상태 출력
        bus100.busStates("상태 변경"); // 상태 변경
        bus100.board(45); // 최대 승객 수를 넘어서 경고 팝업 생성
        bus100.board(5); // 승객 5명 추가
        bus100.showInfo(); // 버스 정보 출력
        bus100.putOil(-55);
        bus100.busInfo();



        Taxi taxi100 = new Taxi(1234); // 100번 택시 생성
        Taxi taxi200 = new Taxi(4567); // 200번 택시 생성
        System.out.println("100번 택시의 번호: " + taxi100.Number +", 200번 택시의 번호: " + taxi200.Number);
        taxi100.board(2); // 승객 2명 탑승.
        taxi100.destinaion("서울역"); // 목적지 입력
        taxi100.distance(2); // 목적지까지의 거리 입력
        taxi100.showInfo();
        taxi100.putOil(-80);
        taxi100.chargeMoney("요금 결제");
        taxi100.board(5);
        taxi100.board(3);
        taxi100.destinaion("구로디지털단지역"); // 목적지 입력
        taxi100.distance(10); // 목적지까지의 거리 입력
        taxi100.showInfo(); // 정보 출력
        taxi100.putOil(-20);
        taxi100.chargeMoney("요금 결제");
    }
}
