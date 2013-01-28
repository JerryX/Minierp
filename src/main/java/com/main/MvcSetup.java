package com.main;

import org.nutz.dao.Dao;
import org.nutz.mvc.Mvcs;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.dolplay.dolpbase.common.util.DolpWebs;
import com.dolplay.dolpbase.system.util.MvcSetupDefaultHandler;
import com.minierp.domain.Customer;
import com.minierp.domain.EnterStock;
import com.minierp.domain.EnterStockDetail;
import com.minierp.domain.Product;
import com.minierp.domain.ProductClass;
import com.minierp.domain.StockPile;
import com.minierp.domain.StoreHouse;
import com.minierp.domain.Supplier;

public class MvcSetup implements Setup {
	private static Logger logger = LoggerFactory.getLogger(MvcSetup.class);

	/**
	 * 当应用系统启动的时候要做的操作
	 */
	@Override
	public void init(NutConfig config) {
		// 初始化IocProvider
		Dao dao = DolpWebs.dao();
		MvcSetupDefaultHandler.dolpTableInit();
		// 初始化的默认表数据
		dao.create(Customer.class, true);
		//dao.create(EnterStock.class, true);
		//dao.create(StoreHouse.class, true);
		/**
		 * 此处添加自定义的操作如初始化数据表,增加调度任务等
		 * 
		 * 
		 */
		// 清空在线用户表
		dao.clear("SYSTEM_CLIENT");
	}

	/**
	 * 当应用系统停止的时候要做的操作
	 */
	@Override
	public void destroy(NutConfig config) {
		MvcSetupDefaultHandler.defaultDestroy();
	}
}