package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fr")
public class FusionRestaurant implements Restaurant {
    // 셰프
    //@Autowired // 컨테이너에 든 자료중 Chef에 대입할 수 있는걸 자동으로 집어 넣어라
    private Chef chef;

    // 요리코스
    //@Autowired // 컨테이너에 든 자료중 Course에 대입할 수 있는걸 자동으로 집어 넣어라
    private Course course;

    // 세터주입은 세터 위에 @Autowired 어노테이션을 붙여서 설정합니다.
    //@Autowired
    public void setChef(Chef chef) {
        this.chef = chef;
    }

    //@Autowired
    public void setCourse(Course course) {
        this.course = course;
    }

    // FusionRestaurant 내부에서 무슨 Chef와 Course가 들어올지 결정하지 않음
    @Autowired
    // 주입받을 파라미터 왠쪽에 @Qualifier("빈이름") 을 입력하면, 지정 주입이 가능합니다.
    public FusionRestaurant(@Qualifier("cc") Chef chef, @Qualifier("cco") Course course){
        this.chef = chef;
        this.course = course;
    }

    // Setter 주입시 @Qualifier를 사용하는 경우, 디폴트 생성자가 오버로딩 되어있어야 합니다.
    public FusionRestaurant(){}
    @Override
    public void order() {
        System.out.println("여기는 퓨전레스토랑입니다.");
        course.combineMenu();
        chef.cook();
    }
}