package com.minierp.domain;

import java.sql.Timestamp;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

import com.dolplay.dolpbase.system.domain.User;

//商品目录表
@Table("Product")
public class Product {

	
	@Id
	private Long id;/* 商品编号, 主键 */
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	private String Name; /* 商品名称 */

	@One(target = ProductClass.class, field = "id")
	private ProductClass ProductClass;/* 商品分类编号 */
	@One(target = User.class, field = "id")
	private User user; /* 建分类人 ,外键 ( 参照User表) */

	@Column
	private Timestamp CreateDate; /* 建分类时间 */
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	private String Remark; /* 描述,备注 */
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	private String ProductSpec;/* 商品规格 */
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	private String ProductAttr;/* 商品属性 */
	@Column
	private float Tax_percentage;/* 税收百分比 */
	@Column
	private int status;/* 状态 */
	@Column
	private int Producttype;/* 类型(进口,自产等) */

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public ProductClass getProductClass() {
		return ProductClass;
	}

	public void setProductClass(ProductClass productClass) {
		ProductClass = productClass;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Timestamp createDate) {
		CreateDate = createDate;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getProductSpec() {
		return ProductSpec;
	}

	public void setProductSpec(String productSpec) {
		ProductSpec = productSpec;
	}

	public String getProductAttr() {
		return ProductAttr;
	}

	public void setProductAttr(String productAttr) {
		ProductAttr = productAttr;
	}

	public float getTax_percentage() {
		return Tax_percentage;
	}

	public void setTax_percentage(float tax_percentage) {
		Tax_percentage = tax_percentage;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getProducttype() {
		return Producttype;
	}

	public void setProducttype(int producttype) {
		Producttype = producttype;
	}

}