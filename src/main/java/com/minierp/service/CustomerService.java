package com.minierp.service;

import com.dolplay.dolpbase.common.domain.AjaxResData;
import com.dolplay.dolpbase.common.domain.jqgrid.AdvancedJqgridResData;
import com.dolplay.dolpbase.common.domain.jqgrid.JqgridReqData;
import com.dolplay.dolpbase.common.service.DolpBaseService;
import com.dolplay.dolpbase.common.util.StringUtils;

import com.minierp.domain.Customer;

import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.dao.Dao;
import org.nutz.ioc.aop.Aop;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.lang.Strings;

@IocBean(args = { "refer:dao" })
public class CustomerService extends DolpBaseService<Customer> {

	public CustomerService(Dao dao) {
		super(dao);
	}

	@Aop(value = "log")
	public AdvancedJqgridResData<Customer> getGridData(JqgridReqData jqReq, Boolean isSearch, Customer customerSearch) {
		Cnd cnd = null;
		if (isSearch && null != customerSearch) {
			cnd = Cnd.where("1", "=", 1);
			Long id = customerSearch.getId();
			if (null != id) {
				cnd.and("ID", "=", id);
			}
		}
		AdvancedJqgridResData<Customer> jq = getAdvancedJqgridRespData(cnd, jqReq);
		return jq;
	}

	@Aop(value = "log")
	public AjaxResData CUDCustomer(String oper, String ids, Customer customer) {
		AjaxResData respData = new AjaxResData();
		if ("del".equals(oper)) {
			final Condition cnd = Cnd.where("ID", "IN", ids.split(","));
			clear(cnd);
			respData.setInfo("删除成功!");
		} else if ("add".equals(oper)) {
			dao().insert(customer);
			//respData.setSystemMessage("添加成功!", null, null);
			respData.setInfo("添加成功!");
		} else if ("edit".equals(oper)) {
			dao().update(customer);
			respData.setInfo("修改成功!");
			//respData.setSystemMessage("修改成功!", null, null);
		} else {
			respData.setError( "未知操作!");
		}
		return respData;
	}
}