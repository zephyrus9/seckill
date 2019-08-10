package org.seckill.exception;

/**
 * 重复秒杀异常(运行期异常)
 * @Auther: LXS
 * @Date: 2019-3-18
 * @Description: org.seckill.exception
 * @version: 1.0
 */
public class RepeatKillException extends SeckillException {
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
