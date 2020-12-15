package com.example.demo.mapper;

import com.example.demo.entity.GoodsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    List<GoodsEntity> findList();
}