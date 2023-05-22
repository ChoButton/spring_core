package com.spring.core.chap01;

public class FusionRestaurant implements Restaurant{
    // 셰프
    private Chef chef;

    // 요리코스
    private Course course;

    public FusionRestaurant(){
        chef = new ChineseChef();
        course = new ChineseCourse();
    }
    @Override
    public void order() {
        System.out.println("여기는 퓨전레스토랑입니다.");
        chef.cook();
    }
}
