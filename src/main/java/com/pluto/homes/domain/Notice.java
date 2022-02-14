package com.pluto.homes.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Notice {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    @Column(length = 500)
    private String text;


}
