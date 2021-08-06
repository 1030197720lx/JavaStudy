# JavaStudy
Java知识学习</br>
第一天 单例模式，对象唯一，必须自己创造自己的对象；构造方法私有；给所有对象提供</br>
1、饿汉式：类加载时及创建对象，不管需要不需要</br>
1.1、直接new静态对象</br>
1.2、枚举类型，可以将对象限定在有限的几个里，可以设置成唯一一个，即为单例模式，直接定义名称即可。</br>
1.3、通过静态代码块实例化对象，可以处理一下数据逻辑。
2、懒汉式：调用是才会创建对象
2.1、线程不安全：写在静态方法里，外部调用该方法，才去实例化对象，但是如果是多线程，并且没有做锁处理，就会出现多个对象，导致线程不安全。
2.2、线程安全：需要在获取实例化对象前，对类或者方法进行加锁处理。
2.3 匿名内部类，由于只在调取类的时候才会加载其中的静态变量，所以调用匿名内部类时才会创建对象，并且jvm对匿名内部类做了线程安全处理。