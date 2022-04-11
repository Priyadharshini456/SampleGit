package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class LoanDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long loanId;

	@Column
	long customerId;

}
