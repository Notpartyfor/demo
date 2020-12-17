package com.example.demo.controller;

import com.example.demo.entity.GoodsEntity;
import com.example.demo.service.IGoodsService;
import com.example.demo.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("goods")
public class GoodsController extends BaseController {
    @Autowired
    private IGoodsService goodsService;

    @PostMapping
    public ResponseResult<Long> addGoods(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        GoodsEntity goods = new GoodsEntity() ;
        // 下面有可能为null
        goods.setPid(Integer.parseInt(map.get("pid")[0]));
        goods.setPprices(Float.parseFloat(map.get("pprices")[0]));
        goods.setPname(map.get("pname")[0]);
        Long data = goodsService.addGoods(goods);
        return new ResponseResult<>(SUCCESS, data);
    }

    @PutMapping
    public ResponseResult<Long> updateGoods(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        GoodsEntity goods = new GoodsEntity() ;
        // 下面有可能为null
        goods.setId(Long.parseLong(map.get("id")[0]));
        goods.setPid(Integer.parseInt(map.get("pid")[0]));
        goods.setPprices(Float.parseFloat(map.get("pprices")[0]));
        goods.setPname(map.get("pname")[0]);
        Long data = goodsService.updateGoods(goods);
        return new ResponseResult<>(SUCCESS, data);
    }

    @GetMapping
    public ResponseResult<List<GoodsEntity>> listGoods(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        List<GoodsEntity> data = goodsService.findGoods(map);
        return new ResponseResult<>(SUCCESS, data);
    }

    @DeleteMapping
    public ResponseResult<Long> deleteGoods(HttpServletRequest request) {
        Long Id = Long.parseLong(request.getParameter("id"));
        Long data = goodsService.deleteGoods(Id);
        return new ResponseResult<>(SUCCESS,data);
    }

}
