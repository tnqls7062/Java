package java0426_class.part03;

public class Doctor {
String name;
String medical;
int patient;

public Doctor() {
	
}
public Doctor(String name, String medical, int patient) {
	this.name = name;
	this.medical = medical;
	this.patient = patient;
}
public void prn() {
	System.out.printf("%s %s %d\n", name, medical, patient);
}
}//end class
