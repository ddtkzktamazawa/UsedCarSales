package com.example.demo.entity;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleHistory {
	private long saleHistoryId;
	private LocalDate saleDate;
	private Integer saleAmount;
	private Maker maker;
	private CarType carType;
	private Branch branch;
	private FormerOwner formerOwner;
}
