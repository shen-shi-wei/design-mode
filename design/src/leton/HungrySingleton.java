package leton;

/**
 * Created with IntelliJ IDEA.
 * 饿汉式单例
 *
 * @Auther: ssw
 * @Date: 2020/07/24/17:15
 * @Description:
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
