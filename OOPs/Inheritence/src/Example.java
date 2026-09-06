 class Animal {
     void eat() {
         System.out.println("animal is eatingg ");
     }
 }
    class dog extends Animal{
            void bark(){
                System.out.println("Dog is barking");
            }
        public static void main(String[] args) {
            dog d= new dog();
            d.eat();
            d.bark();
        }
    }
    //It is inherited the properties of parent class into child class by using extend keyword

