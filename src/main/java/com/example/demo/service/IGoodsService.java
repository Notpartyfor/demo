package com.example.demo.service;

import com.example.demo.entity.GoodsEntity;

import java.util.List;

public interface IGoodsService {
    List<GoodsEntity> getHotList();
}
