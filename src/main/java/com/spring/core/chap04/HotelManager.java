package com.spring.core.chap04;

// 현재까지 최상위 객체인 호텔을 운영하기 위해 필요한
// 모든 객체들을 관리하고 주입해주는 클래스
// Bean Factory(빈공장) / Bean이 자바 인스턴스를 부르는 별칭
public class HotelManager {


    // 셰프 객체 생성
    public Chef chef(){
        return new JapaneseChef();
    }
    // 코스 객체 생성
    public Course course(){
        return new JapaneseCourse();
    }

    //레스 토랑
    public Restaurant restaurant(){
        // 위에 정의된 chef(), course()를 생성자의 파라미터로 호출해 주입하게 설정
        return new FusionRestaurant(chef(), course());
    }

    // Hotel객체를 직접 생성
    public Hotel hotel(){
        return new Hotel(restaurant(), chef());
    }


}

/*
chap1에서는 특정 클래스(Hotel)에 어떤 자료가 대입될지는 특정 클래스 내부에서 정의했으나
chap2에서는 다른 클래스(HotelManager)에서 특정 클래스(Hotel)에 어떤 자료형이 대입될지를 대신 결정해줌
 */