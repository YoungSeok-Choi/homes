package com.pluto.homes.repository;

import com.pluto.homes.domain.Admin;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class) // junit 4 사용사에 명시해야함.
@SpringBootTest
public class AdminRepositoryTest {

    @Autowired
    AdminRepository adminRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void 관리자테스트() {

        // Givne
        Admin admin = new Admin();
        admin.setName("최용석");

        // when
        Long id = adminRepository.save(admin);
        Admin admin2 = adminRepository.find(id);

        // then
        Assertions.assertThat(admin.getId()).isEqualTo(admin2.getId());
        Assertions.assertThat(admin.getName()).isEqualTo(admin2.getName());
        Assertions.assertThat(admin).isEqualTo(admin2);

    }

}