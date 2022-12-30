public class InterfaceSegregation{
    public static void main(String args[]){

    }

    interface Animal{
        void feedAnimal();
        void groomAnimal(); //This violates interface segregration principle
    }

    class Tiger implements Animal{
        //A tiger cannot be groomed;

        public void feedAnimal(){
            System.out.println("Tiger feeded");
        }

        public void groomAnimal(){
            //dummy implementation just to compile
        }

    }

    class Dog implements Animal{
         //A tiger cannot be groomed;

        public void feedAnimal(){
            System.out.println("Dog feeded");
        }
        
        public void groomAnimal(){
            System.out.println("Dog groomed");
        }

    }
}

/**
 *
 To fix the above issue, segregate the interfaces

 interface Animal{
     void feedAnimal();
 }

 interface PetAnimal extends Animal{
    void groomAnimal();
 }

 class Dog implements PetAnimal{

 }

 class Tiger implements Animal{
     
 }
 */