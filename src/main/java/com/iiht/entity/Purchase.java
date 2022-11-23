package com.iiht.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Purchase {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer purchase_id;

	public Purchase(Integer purchase_id) {
		super();
		this.purchase_id = purchase_id;
	}

	public Purchase() {
		super();
	}

	public Integer getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(Integer purchase_id) {
		this.purchase_id = purchase_id;
	}
	
}
