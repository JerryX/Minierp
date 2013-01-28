package com.minierp.domain;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

import com.dolplay.dolpbase.system.domain.Organization;

//库存表
@Table("StockPile")
public class StockPile {
	@Id
	private Long id;/* 库存编号 , 主键 */
	@One(target = Organization.class, field = "id")
	private Organization Organization; /* 入库部门 ,外键 ( 参照 Organization 表 ) */
	@One(target = StoreHouse.class, field = "id")
	private StoreHouse storehouse; /* 所入仓库 ,外键 ( 参照 STOREHOUSE 表) */
	@One(target = Product.class, field = "id")
	private Product product; /* 商品编号, 外键 ( 参照 PRODUCT 表 ) */
	@Column
	private String BatchNo; /* 批次编号 */
	@Column
	private Long Quantity; /* 所存数量 */
	@Column
	private float Price; /* 参考价格 */



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Organization getOrganization() {
		return Organization;
	}

	public void setOrganization(Organization organization) {
		Organization = organization;
	}

	public StoreHouse getStorehouse() {
		return storehouse;
	}

	public void setStorehouse(StoreHouse storehouse) {
		this.storehouse = storehouse;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getBatchNo() {
		return BatchNo;
	}

	public void setBatchNo(String batchNo) {
		BatchNo = batchNo;
	}

	public Long getQuantity() {
		return Quantity;
	}

	public void setQuantity(Long quantity) {
		Quantity = quantity;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

}