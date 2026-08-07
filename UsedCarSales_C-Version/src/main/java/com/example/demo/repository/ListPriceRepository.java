package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ListPrice;

@Repository
public class ListPriceRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ListPrice findByCarModelAndCarType(String carModelCode, String carTypeCode) {
        String sql = "SELECT * FROM list_price WHERE car_model_code = ? AND car_type_code = ?";
        return jdbcTemplate.queryForObject(sql, DataClassRowMapper.newInstance(ListPrice.class), carModelCode, carTypeCode);
    }
}