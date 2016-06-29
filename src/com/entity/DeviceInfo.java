package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeviceInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String os, osVersion, productModel, productName, productManufacturer;
	private int id;
	private String isJailBroken;
	
	public DeviceInfo(){
		super();
	}
	
	public DeviceInfo(String os, String osVersion, String productModel, String productName, String productManufacturer,
			int id, String isJailBroken) {
		super();
		this.os = os;
		this.osVersion = osVersion;
		this.productModel = productModel;
		this.productName = productName;
		this.productManufacturer = productManufacturer;
		this.id = id;
		this.isJailBroken = isJailBroken;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsJailBroken() {
		return isJailBroken;
	}

	public void setIsJailBroken(String isJailBroken) {
		this.isJailBroken = isJailBroken;
	}
}
