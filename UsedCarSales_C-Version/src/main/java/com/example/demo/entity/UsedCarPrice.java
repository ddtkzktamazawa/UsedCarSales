package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsedCarPrice {
	private Long usedCarPriceId;
	private CarModel carModel;
	private CarType carType;
	private Integer price;
	private Branch branch;
}