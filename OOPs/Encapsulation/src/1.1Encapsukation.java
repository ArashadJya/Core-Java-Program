class Student {
    // Private data members
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
            this.age=0;
        }
    }
        public static void main (String[]args){
            Student s = new Student();
            s.setName("Arashad");
            s.setAge(-20);

            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
        }
    }

