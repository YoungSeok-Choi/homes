package com.pluto.homes.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @ToString
public class Member {

    @Id @GeneratedValue
    private long id;

    private String name;
    private String passwd;
    private String phone;
    private String email;
    private String address;
    private int grade = 1;

}
