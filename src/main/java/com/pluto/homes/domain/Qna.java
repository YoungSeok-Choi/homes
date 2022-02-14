package com.pluto.homes.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @ToString
public class Qna { // 엔티티 객체에 세터 메소드를 만들지 말아라.. 추후 변경해야함.

    @Id @GeneratedValue
    private long id;



}
