package com.example.demo.entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListPrice {
	private long listPriceId;
	private CarModel carModel;
	private CarType carType;
	private Integer price;
}
