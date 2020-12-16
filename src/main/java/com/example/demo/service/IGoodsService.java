package com.example.demo.service;

import com.example.demo.entity.GoodsEntity;

import java.util.List;
import java.util.Map;

public interface IGoodsService {
    Long addGoods(GoodsEntity goods);

    Long updateGoods(GoodsEntity goods);

    List<GoodsEntity> findGoods(Map<String, String[]> map);
}

