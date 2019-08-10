package org.seckill.exception;

/**
 * 秒杀相关业务异常
 * @Auther: LXS
 * @Date: 2019-3-18
 * @Description: org.seckill.exception
 * @version: 1.0
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
