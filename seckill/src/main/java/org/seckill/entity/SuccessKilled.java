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
public class SuccessKilled {
    private long seckillId;

    private long userPhone;

    private short state;

    private Date createTime;
}
