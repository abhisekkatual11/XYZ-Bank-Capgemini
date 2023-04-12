package com.capgemini.bank.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demand_draft")
public class DemandDraft {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private Long transaction_id;
	
	@Column(name="Customer Name", nullable = false)
	private String customer_name;
	
	@Column(name="In Favor of", nullable = false)
	private String in_favor_of;
	
	@Column(name="Phone Number",nullable = false, unique = true)
	private Long phone_number;
	
	@Column(name="Date of Transaction", nullable = false)
	private Date date_of_transaction;
	
	@Column(name="DD Amount",nullable = false)
	private Long dd_amount;
	
	@Column(name="DD Commission",nullable = false)
	private Long dd_commission;
	
	@Column(name="DD Description",nullable = false)
	private String dd_description;
	
	@Column(name="Remarks")
	private String remarks;

	public Long getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(Long transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getIn_favor_of() {
		return in_favor_of;
	}

	public void setIn_favor_of(String in_favor_of) {
		this.in_favor_of = in_favor_of;
	}

	public Long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}

	public Date getDate_of_transaction() {
		return date_of_transaction;
	}

	public void setDate_of_transaction(Date date_of_transaction) {
		this.date_of_transaction = date_of_transaction;
	}

	public Long getDd_amount() {
		return dd_amount;
	}

	public void setDd_amount(Long dd_amount) {
		this.dd_amount = dd_amount;
	}

	public Long getDd_commission() {
		return dd_commission;
	}

	public void setDd_commission(Long dd_commission) {
		this.dd_commission = dd_commission;
	}

	public String getDd_description() {
		return dd_description;
	}

	public void setDd_description(String dd_description) {
		this.dd_description = dd_description;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}

