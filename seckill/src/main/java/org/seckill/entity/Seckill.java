package org.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: LXS
 * @Date: 2019-8-11
 * @Description: org.seckill.entity
 * @version: 1.0
 */
@Data
public class Seckill {

    /**
     * 秒杀id
     */
    private long seckillId;

    /**
     * 名称
     */
    private String name;

    /**
     * 商品数量
     */
    private int number;

    /**
     * 秒杀开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 创建时间
     */
    private Date createTime;

}
