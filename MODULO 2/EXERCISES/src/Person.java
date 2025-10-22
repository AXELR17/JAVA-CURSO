public class Person {
    //Atributos
    private String firtsName;
    private String lastName;
    private String email;
    private String phoneNumber;

    //Constructors
    

    public Person() {
        this( "Jhon","Doe" );

    }

    public Person(String firtsName, String lastName) {
        this(firtsName,lastName,"jhon.doe@mail.com","5551234");
       
    }

    public Person(String firtsName, String lastName, String email) {
        this(firtsName,lastName,email,"5551234");
       
    }

    public Person(String firtsName, String lastName, String email, String phoneNumber) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Metodo Getter

    public String getFirtsName() {
        return firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

     //Metodo Setter

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        
        return String.format("Person: fullName%s %s, email = %s, phoneNumber =%s", 
                firtsName, lastName, email, phoneNumber);
    }

   
    

    
    
    





    
}
