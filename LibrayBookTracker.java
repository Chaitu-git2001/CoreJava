class Book{
private String title;
private String author;
private boolean issued;

private static int totalIssuedBooked=0;

public Book(String title,String author,boolean issued){
      this.title = title;
	  this.author = author;
	  this.issued = issued;
	
	
	if (issued){
		totalIssuedBooked++;
	}  
}
public String getTitle(){
	return title;
}
public String getAuthor(){
	return author;
}
public boolean getIssued(){
	return issued;
}
public void setTitle(String title){
  this.title=title;
}

public void setAuthor(String author){
  this.author=author;
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
totalIssuedBooked--;
}
}
this.issued=issued;
}

}
class LibrayBookTracker{
public static void main (String[] args){

Book b1 = new Book("Harry Potter","J.K.Rowling", true);
Book b2 = new Book ("Five Point someone","Chetan Bhagat",false);
Book b3 = new Book("rich dad poor dad" ,"Robert kiyosaki",true);

System.out.println("Book1 Issued?" +b1.getIssued());
System.out.println("Book2 Issued?" +b2.getIssued());
System.out.println("Book3 Issued?" +b3.getIssued());

Book.showTotalIssued();
}
}