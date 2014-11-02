package foo.bar;

public class HelloServiceImpl implements IService {
    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public void sayHello(String name) {

        System.out.println(dao.sayHello(name));

    }
}
