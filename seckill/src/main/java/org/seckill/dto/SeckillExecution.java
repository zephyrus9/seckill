package org.seckill.dto;

import lombok.Data;
import org.seckill.entity.SuccessKilled;

/**
 * 封装秒杀执行后的结果
 *
 * @Auther: LXS
 * @Date: 2019-3-18
 * @Description: org.seckill.dto
 * @version: 1.0
 */
@Data
public class SeckillExecution {

    /**
     * 秒杀id
     */
    private long seckillId;
    /**
     * 秒杀执行结果状态
     */

    private int state;

    /**
     * 状态标识
     */
    private String stateInfo;

    /**
     * 秒杀成功对象
     */
    private SuccessKilled successKilled;
}
