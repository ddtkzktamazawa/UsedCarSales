package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dealer;

@Repository
public class DealerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Dealer> findAll() {
        String sql = "SELECT * FROM dealer";
        return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(Dealer.class));
    }

    public List<Dealer> findByPrefectureCode(String prefectureCode) {
        String sql = "SELECT * FROM dealer WHERE prefecture_code = ?";
        return jdbcTemplate.query(sql, DataClassRowMapper.newInstance(Dealer.class), prefectureCode);
    }
}