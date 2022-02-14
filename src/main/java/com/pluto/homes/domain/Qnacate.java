package com.pluto.homes.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter @ToString
public class Qnacate {

    @Id @GeneratedValue
    private long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "ADMIN_ID")
    private Admin admin;

}
