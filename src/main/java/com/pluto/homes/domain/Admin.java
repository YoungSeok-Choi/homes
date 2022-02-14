package com.pluto.homes.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @ToString
public class Admin {

    @Id @GeneratedValue
    private long id;

    @Column
    private String name; //컬럼 어노테이션을 붙히지 않으면, not null 제약사항이 붙는다. 원시 자료형이라 그런듯
    private String passwd;

    @OneToMany
    private List<Qnacate> qnacateList;

}
