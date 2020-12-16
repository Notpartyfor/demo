package com.example.demo.mapper;


import com.example.demo.entity.GoodsEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsMapperTests {

    @Autowired
    public GoodsMapper mapper;

    @Test
    public void addGoods() {
        System.err.println(mapper);
        GoodsEntity goods = new GoodsEntity();
        goods.setPid(10);
        goods.setPprices(10.00f);
        goods.setPname("测试笔");
        mapper.addGoods(goods);
        System.err.println("id:" + goods.getId());
    }

    @Test
    public void findGoods() {
        System.err.println(mapper);
        Map<String, String[]> map = new HashMap<>();
//        map.put("pid", new String[]{"100", "101"});
//        map.put("pprices",new String[]{"2.00","3.00"});
//        map.put("limit",new String[]{"1"});
//        map.put("offset",new String[]{"1"});
        List<GoodsEntity> list = mapper.findGoods(map);
        System.err.println("count=" + list.size());
        for (GoodsEntity item : list) {
            System.out.println(item);
        }
    }
}
