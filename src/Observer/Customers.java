package Observer;

public class Customers implements Observer{
    private String name;
    private Subject topic;

    public Customers(String nm){
        this.name=nm;
    }

    @Override
    public void update() {
        System.out.println("Name : "+name+", message : "+topic.getUpdate(this));
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
}
