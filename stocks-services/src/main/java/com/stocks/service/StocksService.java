package com.stocks.service;

import java.util.Map;

import com.stocks.model.StocksModel;

public interface StocksService 
{
	public Map<String,Object> saveOrUpdateStockData(StocksModel model);
	
	public Map<String,Object> findByStock(String stock);
	
}
