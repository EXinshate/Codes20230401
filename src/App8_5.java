class newStudent extends Person{
    private String department;
    public newStudent(String name, int age, String dep){
        super(name, age);
        department = dep;
    }
    protected void show(){
        System.out.println("系别： " + department);
    }
    public void subshow(){
        System.out.println("我在子类中");
    }
}
public class App8_5{
    public static void main(String[] args) {
        Person per = new newStudent("王永涛", 24, "电子");
        per.show();
    }
    }

