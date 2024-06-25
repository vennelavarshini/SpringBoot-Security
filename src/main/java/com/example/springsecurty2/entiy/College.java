package com.example.springsecurty2.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="school")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int fee;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public College(long id, String name, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	public College() {
		super();
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	

}