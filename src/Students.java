public class Students {
    String name;
    int age;
    String classname;
    char grade;

    Students(String name, int age, String classname, char grade){
        this.name = name;
        this.age = age;
        this.classname = classname;
        this.grade = grade;
    }

    void introduce(){
        System.out.println("Hi everyone, I'm "+name+" "+age+ " years old. "+ "I'm a student in classname "+classname+
                ". Last " +
                "semester, I received the "+grade+"grade. Thanks for listening");
    }

    void show(){
        System.out.println("Hello");
    }
}
