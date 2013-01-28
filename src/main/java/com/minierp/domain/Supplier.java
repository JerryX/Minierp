package com.minierp.domain;



import java.util.List;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.ManyMany;
import org.nutz.dao.entity.annotation.Table;

import com.dolplay.dolpbase.system.domain.Organization;



//供应商表
@Table("Supplier")
public class Supplier {
	
	
	@Id
	private Long id;//供应商编号
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 20)
	private String name;//供应商名称
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 200)
	private String Address;//地址
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 20)
	private String Phone;//电话
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 20)
	private String Fax;//传真
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 20)
	private String PostalCode;//邮编
	@Column
	@ColDefine(type = ColType.VARCHAR, width = 20)
	private String ConstactPerson;//联系人
	//部门和供应商多对多关系
	@ManyMany(target = Organization.class, relation = "Org_Supplier", from = "Supplier_ID", to = "Org_ID")
	private List<Organization> organization;
	
	
	
	
	public List<Organization> getOrganization() {
		return organization;
	}
	public void setOrganization(List<Organization> organization) {
		this.organization = organization;
	}
	

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
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getConstactPerson() {
		return ConstactPerson;
	}
	public void setConstactPerson(String constactPerson) {
		ConstactPerson = constactPerson;
	}
}
