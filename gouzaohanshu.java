import static net.mindview.util.Print.*;
public class gouzaohanshu{
	public static void main(String[] args){
		Student S=new Student("С��",28,"�й�");
	}
}
class Student{
	String name;
	int age;
	String contry;
	Student(String name){
		this.name=name;
		print("��ʼ������");
	}
	Student(String name,int age){
		this(name);
		this.age=age;
		print("��ʼ������������");
	}
	Student(String name,int age,String contry){
		this(name,age);
		this.contry=contry;
		print("��ʼ������������͹���");
		print("name:"+name);
		print("age:"+age);
		print("contry:"+contry);
	}
}