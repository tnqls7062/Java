package java0430_inheritance.prob.part02;

public class StudentExam extends Human {
 private String id;

 
 StudentExam(String name, int age, int height, int weight, String id){
	 super(name, age,height,weight);
	 this.id=id;
 }


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


@Override
public String toString() {
	String data = name + "\t" + age + "\t" + height + "\t" + weight+ "\t"+ id;
	return data;
}

}
