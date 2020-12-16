package com.example.demo.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class GoodsEntity implements Serializable {
    private static final long serialVersionUID = -7123568729160306865L;
    private long id;
    private Integer pid;
    private String pname;
    private float pprices;
}
