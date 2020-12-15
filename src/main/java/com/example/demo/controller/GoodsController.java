package com.example.demo.controller;

import com.example.demo.entity.GoodsEntity;
import com.example.demo.service.IGoodsService;
import com.example.demo.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("goods")
public class GoodsController extends BaseController {
    @Autowired
    private IGoodsService goodsService;

    @GetMapping("hot")
    public ResponseResult<List<GoodsEntity>> getHotList() {
        // 执行查询
        List<GoodsEntity> data = goodsService.getHotList();
        // 返回
        return new ResponseResult<>(SUCCESS, data);
    }
}
