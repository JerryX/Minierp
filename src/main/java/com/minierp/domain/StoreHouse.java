package com.minierp.domain;

import java.sql.Timestamp;
import java.util.List;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.ManyMany;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;

import com.dolplay.dolpbase.system.domain.User;

//仓库表
@Table("StoreHouse")
public class StoreHouse {

	@Id
	private Long id;/* 仓库编号, 主键 */
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	private String Name; /* 仓库名称 */
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	private String Address; /* 地址 */
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 20)
	private String Phone; /* 电话 */
	
	@Column
	private Timestamp CreateDate; /* 仓库成立时间 */
	@Column
	private Long UserId;/* 仓库保管 ,外键 ( 参照User表) */
	
	@One(target = User.class, field = "UserId")
	private User users;/* 仓库保管 ,外键 ( 参照User表) */

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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}


	public Timestamp getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Timestamp createDate) {
		CreateDate = createDate;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}
	

}