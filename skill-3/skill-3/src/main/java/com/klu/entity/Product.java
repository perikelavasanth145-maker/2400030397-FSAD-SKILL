package com.klu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// pid, pname, pcost
@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name", nullable = false, length = 120)
	private String pname;
	@Column(name = "cost", nullable = false)
	private double pcost;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, double pcost) {
		super();
		this.pname = pname;
		this.pcost = pcost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", pcost=" + pcost + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPcost() {
		return pcost;
	}

	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	
	
}
