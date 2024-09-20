class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal's name is: " + name);
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion");
    }
}
