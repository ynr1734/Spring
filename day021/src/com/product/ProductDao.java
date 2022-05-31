package com.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.ProductVO;
@Repository("pdao")
public class ProductDao implements Dao<Integer,ProductVO>{

	@Override
	public void insert(ProductVO v) {
		System.out.println("Inserted:"+v);
	}

	@Override
	public void delete(Integer k) {
		System.out.println("Deleted:"+k);
	}

	@Override
	public void update(ProductVO v) {
		System.out.println("Updated:"+v);
	}

	@Override
	public ProductVO select(Integer k) {
		ProductVO p = new ProductVO(k, "pants", 10000);
		return p;
	}

	@Override
	public List<ProductVO> select() {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		list.add(new ProductVO(100, "pants1", 10000));
		list.add(new ProductVO(101, "pants2", 20000));
		list.add(new ProductVO(102, "pants3", 30000));
		list.add(new ProductVO(103, "pants4", 40000));
		list.add(new ProductVO(104, "pants5", 50000));
		return list;
	}

}
