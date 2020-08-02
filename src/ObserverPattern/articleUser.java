package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

//观察者实现Observer接口来接受对象并定义逻辑
public class articleUser implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我接受到了博主的新文章了！");
        Article article= (Article) arg;
        System.out.println("标题是："+article.getTitle()+"   内容是："+article.getContent());
    }
}
