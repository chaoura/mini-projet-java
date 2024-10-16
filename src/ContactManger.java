import java.util.ArrayList;

public class ContactManger {
  private final ArrayList<Contact> contacts;
  public ContactManger(){
      contacts = new ArrayList<>();
  }
  public void addContact(String name , String phoneNumber, String email){
      Contact contact = new Contact( name , phoneNumber,email);
      contacts.add(contact);
      System.out.println("contact ajouter "+contact);
  }
  public void listContacts(){
      if(contacts.isEmpty()){
          System.out.println("contacts n'existe pas ");
      }
      else{
          for( Contact contact :contacts){
              System.out.println(contact);
          }
      }

  }
  // aya fonc katakhoud parametre katkhdem bih how li kaykono 3lih les condionts les boucles
    public void searchContact( String name){
      for(Contact contact : contacts){
          if(contact.getName().equalsIgnoreCase(name)){
              System.out.println("contact trouvé "+contact);
              return;
          }
      }
    }
  /*  public void removeContact(String name , String phoneNumber){
      for(Contact contact : contacts){
          if(contact.getName().equalsIgnoreCase(name) && contact.getPhoneNumber().equalsIgnoreCase(phoneNumber)){
              contacts.remove(contact);
              System.out.println("contact remove "+contact);

          }
      }
    }*/
    public void removeContact(String name){
        for(Contact contact : contacts){
            if(contact.getName().equalsIgnoreCase(name)){
                System.out.println("contact remove "+contact);
                contacts.remove(contact);
            }
        }
    }
}
