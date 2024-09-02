class Company03{
    String name;

    public static void main(String[] args) {
        Company03 c1 = new Company03();
        c1.name = "Ethnus";
        Company03 c2 = c1;
        c1 = null;
        System.out.println(c2.name);
    }
}