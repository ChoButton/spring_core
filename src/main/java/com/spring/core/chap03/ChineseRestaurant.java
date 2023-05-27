package com.spring.core.chap03;

public class ChineseRestaurant implements Restaurant {

    private Chef chef;
    private Course course;

    public ChineseRestaurant(ChineseChef chef, ChineseCourse course){
        this.chef = chef;
        this.course = course;
    }

    @Override
    public void order() {
        System.out.println("중식 레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}
