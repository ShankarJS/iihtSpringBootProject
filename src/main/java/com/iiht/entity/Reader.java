package com.iiht.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reader {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer readerId;
	private String rName;
	private String rEmail;
	private Integer purchaseId;
	private Integer bookId;
//	private Map<Integer, Integer>  purchasedBooks;   		//bookId and purchaseId
	
	
	
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Reader(String rName, String rEmail, Integer purchaseId, Integer bookId) {
	super();
	this.rName = rName;
	this.rEmail = rEmail;
	this.purchaseId = purchaseId;
	this.bookId = bookId;
}



	public Integer getReaderId() {
		return readerId;
	}



	public void setReaderId(Integer readerId) {
		this.readerId = readerId;
	}



	public String getrName() {
		return rName;
	}



	public void setrName(String rName) {
		this.rName = rName;
	}



	public String getrEmail() {
		return rEmail;
	}



	public void setrEmail(String rEmail) {
		this.rEmail = rEmail;
	}



	public Integer getPurchaseId() {
		return purchaseId;
	}



	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}



	public Integer getBookId() {
		return bookId;
	}



	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	
	
	
	
}
