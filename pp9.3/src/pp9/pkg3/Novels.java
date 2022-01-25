package pp9.pkg3;


public class Novels {
    int num_pages;
    String writer_name;
    String book_name;
    String reading_material_type="Novels";
    public Novels(String name,String bn, int pages)

    {
    num_pages=pages;
    writer_name=name;
    book_name=bn;   
    }

    public void setNumOfPages(int n)
    {
    num_pages=n;
    }

    public void setNameOfWriter(String writer)
    {
    writer_name=writer;
    }

    public void setNameOfBook(String bn)
    {
    book_name=bn;
    }

    public int getNumOfPages()
    {
    return num_pages;
    }

    public String getNameOfAuthor()
    {
    return writer_name;
    }

    public String getNameOfBook()
    {
    return book_name;
    }

    public String toString() {
        String s="";
        s+="Reading Material Type: "+reading_material_type+"\n"
        +"Book name: "+book_name+"\n"
        +"Writer name: "+writer_name+"\n"
        +"Number of pages: "+num_pages+"\n";
        return s;
    }
}