class Student{
private String name;
private int marks;
private boolean isPassed;

private static int totalStudent=0;


public Student(String name, int marks, boolean isPassed){
this.name = name;
this.marks = marks;

this.isPassed = marks >= 35;

if(isPassed){
	totalStudent++;
}
}

public String getName(){
	return name;
}
public int getMarks(){
	return marks;
}
public boolean getIsPassed(){
	return isPassed;
}
public void setName(String name){
  this.name = name;
}

public void setMarks(int marks){
  this.marks=marks;
}

public static void showTotalStudent(){
System.out.println("Total Passed Student: "+totalStudent);
}

public void setIsPassed(boolean isPassed){
if(this.isPassed != isPassed){
if(isPassed || marks >= 35 ){
totalStudent++;
}
else{
totalStudent--;
}
}
this.isPassed=isPassed;
}


}

class StudentMarksCalculator{
public static void main (String[] args){

Student s1 = new Student("Rahul",85,true);
Student s2 = new Student ("Pooja",60,false);
Student s3 = new Student("Amit",72, true);

System.out.println("Student Rahul Passed?" +b1.getIsPassed());
System.out.println("Student Pooja Passed?" +b2.getIsPassed());
System.out.println("Student Amit Passed?" +b3.getIsPassed());

Student.showTotalStudent();
}

}