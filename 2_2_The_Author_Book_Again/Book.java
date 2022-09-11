public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // toString() method with authors
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Author author : this.authors) {
            sb.append(author.toString());
            sb.append(",");
        }

        return "Book[name=" + this.name + ",authors={" + sb.toString() + "},price=" + this.price + ",qty=" + this.qty
                + "]";
    }

    public String getAuthorNames() {
        StringBuilder sb = new StringBuilder();
        for (Author author : this.authors) {
            sb.append(author.getName());
            sb.append(",");
        }

        return sb.toString();
    }
}