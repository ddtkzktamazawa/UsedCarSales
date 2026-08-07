package com.example.demo.entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Branch {
	private long branchId;
	private String branchName;
	private Dealer dealer;
}
