package org.seckill.exception;

/**
 * 秒杀关闭异常
 *
 * @Auther: LXS
 * @Date: 2019-3-18
 * @Description: org.seckill.exception
 * @version: 1.0
 */
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
