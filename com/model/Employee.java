package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Transient;



import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int emp_id;
	private String emp_name;
   @Transient
	private Date doj;
	private float salary;
	@Transient
	private byte image;
	@Transient
	private String extra;
	//public void setDoj(Date date) {
	//	this.doj=date;}
		
	

}
