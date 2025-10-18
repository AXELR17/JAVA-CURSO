import java.time.LocalDate;

public class Book {
   //Atributos
   private String title;
   private String author;
   private Integer pages; 
   private LocalDate publishDate;
   private String editor;
   private String category;


   //Constructor -> Inicializar el Objeto
   public Book(){
       title = "Las Aventuras de Norvey";
       author = "Norvey";
       pages = 50;
       publishDate = LocalDate.now();
       editor = "Hl";
       category = "Action";
   }

   public Book(String title, String author, Integer pages){
      this.title = title;
      this.author = author;
      this.pages = pages;
      publishDate = LocalDate.now();
       editor = "Hl";
       category = "Action";

   }

   public Book(String title, String author, Integer pages, LocalDate publisDate, String editor, String category) {
      this.title = title;
      this.author = author;
      this.pages = pages;
      this.publishDate = publisDate;
      this.editor = editor;
      this.category = category;
   }


   //Métodos
   public String giveMeYourTitle(){
      return title;
   }

   // Métodos Getter -> Obtener valores de los atributos   get<Atributo>()
   public String getTitle() {
       return title;
   }

   public String getAuthor() {
       return author;
       
   }

   public Integer getPages() {
      return pages;
   }

   public LocalDate getPublishDate() {
      return publishDate;
   }

   public String getEditor() {
      return editor;
   }

   public String getCategory() {
      return category;
   }

   //Metodos Setter -> Cambiar de manera directa el valor de un atributo -> set<Atributo>(TD par)
   public void setCategory(String category) {
       this.category = category;
   } 

   @Override
   public String toString() {
      return String.format("Libro: titulo =%s, autor =%s, paginas =%s, publicacion =%s, editorial =%s, categoria =%s", 
            getTitle(),getAuthor(), 
            getPages().toString(), getPublishDate().toString(),
            getEditor(), getCategory() );
     
      // return "Libro[ titulo: " +title+", author:"+author+", paginas: "+pages+"]"; 
   }



}
