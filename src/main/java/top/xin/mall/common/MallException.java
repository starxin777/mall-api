package top.xin.mall.common;

/**
 * @description: 自定义异常
 * @author: windows
 * @since: 2021-04-23
 **/
public class MallException extends RuntimeException {
    public MallException() {
    }

    public MallException(String message) {
        super(message);
    }

    /**
     * 抛出异常     *     * @param message 消息
     */
    public static void fail(String message) {
        throw new MallException(message);
    }
}
