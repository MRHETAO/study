package conllection;

import org.junit.Test;

/**
 * Created by lenovo on 2020/1/10.
 */
public class threadTest {
    @Test
    public void test1(){
        for (int i = 0;i<10;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName());
            }).start();
        }

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        t1.setName("haha");
        t1.start();
t2.setName("gg");
t2.start();


    }
    Thread t2 = new Thread(){
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    };

}
