package com.minierp.domain;

import java.sql.Timestamp;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.One;

import com.dolplay.dolpbase.system.domain.Organization;
import com.dolplay.dolpbase.system.domain.User;

//入库单表
@Table("EnterStock")
public class EnterStock {

	@Id
	private Long id;/* 入库单编号, 主键 */
	@Column
	private Timestamp EnterDate; /* 入库时间 */

	@Column
	private String BatchNo; /* 批次编号 */
	@Column
	private Long UserId;/*入库人 ,外键 ( 参照User表)  */
	@Column
	private Long OrgId;/* 入库部门 ,外键 ( 参照 Organization 表 ) */
	@Column
	private Long StoreHouseId;/* 所入仓库 ,外键 ( 参照 STOREHOUSE 表) */
	@One(target = User.class, field = "UserId")
	private User users; /* 入库人 ,外键 ( 参照User表) */
	@One(target = Organization.class, field = "OrgId")
	private Organization organisation; /* 入库部门 ,外键 ( 参照 Organization 表 ) */
	@One(target = StoreHouse.class, field = "StoreHouseId")
	private StoreHouse storehouse; /* 所入仓库 ,外键 ( 参照 STOREHOUSE 表) */


	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public Long getOrgId() {
		return OrgId;
	}

	public void setOrgId(Long orgId) {
		OrgId = orgId;
	}

	public Long getStoreHouseId() {
		return StoreHouseId;
	}

	public void setStoreHouseId(Long storeHouseId) {
		StoreHouseId = storeHouseId;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getEnterDate() {
		return EnterDate;
	}

	public void setEnterDate(Timestamp enterDate) {
		EnterDate = enterDate;
	}


	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Organization getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organization organisation) {
		this.organisation = organisation;
	}

	public StoreHouse getStorehouse() {
		return storehouse;
	}

	public void setStorehouse(StoreHouse storehouse) {
		this.storehouse = storehouse;
	}

	public String getBatchNo() {
		return BatchNo;
	}

	public void setBatchNo(String batchNo) {
		BatchNo = batchNo;
	}

}