package ObserverPattern;

import java.util.Observable;

//被观察者继承Observable
public class articleOwner extends Observable {

    public void faBuArticle(String title,String content){
        System.out.println("博主发布新文章啦！");
        Article article=new Article();
        article.setContent(content);
        article.setTitle(title);
        this.setChanged(); // 声明对象被改变，可以自动调用观察者的update方法
        this.notifyObservers(article); //通知观察者，并把改变的对象传给观察者
    }
}
