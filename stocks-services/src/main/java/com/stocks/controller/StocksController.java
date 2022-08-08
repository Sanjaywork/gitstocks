package com.stocks.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stocks.model.StocksModel;
import com.stocks.service.StocksService;
import com.stocks.constants.API;

@RestController
public class StocksController {

	@Autowired
	private StocksService stocksService;

	@PostMapping("/")
	public ResponseEntity<Map<String, Object>> saveOrUpdateStockData(@RequestBody StocksModel stocksModel) {
		return new ResponseEntity<Map<String, Object>>(stocksService.saveOrUpdateStockData(stocksModel), HttpStatus.OK);
	}
	
	@GetMapping(API.GET_STOCKS_BY_STOCK_NAME)
	public ResponseEntity<Map<String, Object>> findByStock(@PathVariable String stock) {
		return new ResponseEntity<Map<String, Object>>(stocksService.findByStock(stock), HttpStatus.OK);
	}
	
}
