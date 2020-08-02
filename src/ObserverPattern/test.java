package ObserverPattern;

public class test {

    public static void main(String[] args) {
        articleOwner articleOwner=new articleOwner();
        articleOwner.addObserver(new articleUser());//为articleOwner添加一个观察者，可以添加多个观察者
        articleOwner.faBuArticle("第一篇文章","111222333");//被观察者发布文章
    }
}
