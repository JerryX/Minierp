package com.minierp.domain;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.PK;

//仓库表
@Table("EnterStockDetail")
@PK({ "EnterStockid", "ProductID" })
public class EnterStockDetail {
	@Column
	private Long EnterStockID;/* 入库单编号, 主键 */
	@Column
	private Long ProductID;/* 商品编号, 主键 */
	@Column
	private Long Quantity;// 此种商品数量
	@Column
	private float Price;// 此种商品参考价格
	@Column
	private int HaveInvoice;// 此种商品有没有开发票
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	private String InvoiceNum;// 发票号

	public Long getEnterStockID() {
		return EnterStockID;
	}

	public void setEnterStockID(Long enterStockID) {
		EnterStockID = enterStockID;
	}

	public Long getProductID() {
		return ProductID;
	}

	public void setProductID(Long productID) {
		ProductID = productID;
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

	public int getHaveInvoice() {
		return HaveInvoice;
	}

	public void setHaveInvoice(int haveInvoice) {
		HaveInvoice = haveInvoice;
	}

	public String getInvoiceNum() {
		return InvoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		InvoiceNum = invoiceNum;
	}

}