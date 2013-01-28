package com.minierp.module;

import com.dolplay.dolpbase.common.domain.ResponseData;
import com.dolplay.dolpbase.common.domain.jqgrid.JqgridReqData;
import com.minierp.domain.Customer;
import com.minierp.service.CustomerService;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Param;

@IocBean
@At("/stock/customer")
public class CustomerModule {
	
	@Inject
	private CustomerService customerService;

	@At
	public ResponseData getGridData(@Param("..") JqgridReqData jqReq, @Param("_search") Boolean isSearch, @Param("..") Customer customerSearch) {
		return customerService.getGridData(jqReq, isSearch, customerSearch);
	}

	@At
	public ResponseData editRow(@Param("oper") String oper, @Param("ids") String ids, @Param("..") Customer customer) {
		return customerService.CUDCustomer(oper, ids, customer);
	}
}