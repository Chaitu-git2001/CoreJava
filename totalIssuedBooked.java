class book{
String title;
String author;
boolean issued;

static int totalIssuedBooked;

book(String title,String author,String issued){
      this.title=title;
	  this.author=author;
	  this.issued=issued;
	  
}

public void setTitle(String title){
  this.title=title;
}

public void setTitle(String author){
  this.author=author;
}

public void setTitle(int issued){
  this.issued=issued;
}

public static void showTotalIssued(){
System.out.println("Total books issued: "+totalIssuedBooked);
}

public void setIssued(boolean issued){
if(this.issued!=issued){
if(issued){
totalIssuedBooked++;
}
else{
totalIssuedBooked--
}
}
}

}
class LibrayBookTracker{
public static void main (String []  args){

Book b1= new Book("Harry Potter","J.K.Rowling", true);
Book b2= new Book ("Five Point someone","Chetan Bhagat",false);
Book b3=new Book("rich dad poor dad" ,"Robert kiyosaki",true);

System.out.println("Book1 Issued?" +b1.issued());
System.out.println("Book1 Issued?" +b2.issued());
System.out.println("Book1 Issued?" +b3.issued());

Book.showTotalIssued();
}
}