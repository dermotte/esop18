package at.aau.itec.esop18.lesson12;

/**
 * disclaimer: do not use
 */
public class SingletonFun {
    static SingletonFun instance;

    private SingletonFun() {
    }

    static SingletonFun getInstance() {
        if (instance == null)
            instance = new SingletonFun();
        return instance;
    }
}
