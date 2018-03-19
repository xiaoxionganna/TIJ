import static net.mindview.util.Print.*;
public class gouzaohanshu{
	public static void main(String[] args){
		Student S=new Student("小明",28,"中国");
	}
}
class Student{
	String name;
	int age;
	String contry;
	Student(String name){
		this.name=name;
		print("初始化姓名");
	}
	Student(String name,int age){
		this(name);
		this.age=age;
		print("初始化姓名和年龄");
	}
	Student(String name,int age,String contry){
		this(name,age);
		this.contry=contry;
		print("初始化姓名、年龄和国籍");
		print("name:"+name);
		print("age:"+age);
		print("contry:"+contry);
	}
}