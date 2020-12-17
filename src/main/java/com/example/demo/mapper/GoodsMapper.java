package com.example.demo.mapper;

import com.example.demo.entity.GoodsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface GoodsMapper {
    Long addGoods(GoodsEntity goods) ;
    Long updateGoods(GoodsEntity goods);
    List<GoodsEntity> findGoods(Map<String, String[]> map);
    Long deleteGoods(Long id);
}