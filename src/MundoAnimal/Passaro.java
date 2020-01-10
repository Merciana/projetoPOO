package MundoAnimal;

public class Passaro extends Animal {
   public boolean voa;

   public Passaro(){
       super("Passaro", 0);
       voa = false;
   }
   public void voa(){
       voa = true;
   }
}
