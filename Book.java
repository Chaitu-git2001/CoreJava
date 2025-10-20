class Book {
    
    private int copiesAvailable;
    public void addCopies(int n) {
        if (n > 0) {
            copiesAvailable += n;
            System.out.println(n + " copies added.");
        } else {
            System.out.println("Invalid number of copies to add!");
        }
    }

    
    public void removeCopies(int n) {
        if (n > 0) {
            if (n <= copiesAvailable) {
                copiesAvailable -= n;
                System.out.println(n + " copies removed.");
            } else {
                System.out.println("Not enough copies to remove!");
            }
        } else {
            System.out.println("Invalid number of copies to remove!");
        }
    }

    
    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    
    public static void main(String[] args) {
        Book book = new Book();

        
        book.addCopies(3);
        book.removeCopies(1);

        System.out.println("Copies available = " + book.getCopiesAvailable());
    }
}
