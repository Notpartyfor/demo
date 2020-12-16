package com.example.demo.service.implement;

import com.example.demo.entity.GoodsEntity;
import com.example.demo.mapper.GoodsMapper;
import com.example.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsEntity> findGoods(Map<String, String[]> map) {
        return goodsMapper.findGoods(map);
    }

    @Override
    public Long updateGoods(GoodsEntity goods) {
        goodsMapper.updateGoods(goods);
        return null;
    }

    @Override
    public Long addGoods(GoodsEntity goods) {
        goodsMapper.addGoods(goods);
        Long Id = goods.getId();
        return Id;
    }
}
