package com.example.demo.entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarModel {
	private String carModelCode;
	private String carModelName;
	private Maker maker;
}
