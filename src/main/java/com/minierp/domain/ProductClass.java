package com.minierp.domain;

import java.sql.Timestamp;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.One;
import com.dolplay.dolpbase.system.domain.User;

//商品分类表
@Table("ProductClass")
public class ProductClass {
	@Id
	private Long id;// 商品分类编号
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	private String name;// 商品分类名称

	@One(target = User.class, field = "id")
	public User user;// 建分类人

	@Column
	private Timestamp CreateDate;// 建分类时间

	@Column
	@ColDefine(type = ColType.VARCHAR, width = 500)
	private String Remark;// 描述,备注

	@One(target = ProductClass.class, field = "id")
	public ProductClass pProductClassid;// 建分类人

	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public ProductClass getpProductClassid() {
		return pProductClassid;
	}

	public void setpProductClassid(ProductClass pProductClassid) {
		this.pProductClassid = pProductClassid;
	}

}
