package com.stocks.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stocks.entity.StocksEntity;
import com.stocks.repository.StocksRepository;

@Transactional
@Repository
public class StocksDao 
{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private StocksRepository stocksRepository;
	
	public StocksEntity saveOrUpdateStockData(StocksEntity stocksEntity)
	{
		return stocksRepository.save(stocksEntity);
	}
	
	public List<StocksEntity> findByStock(String stock)
	{
		return stocksRepository.findByStock(stock);
	}
}
	

