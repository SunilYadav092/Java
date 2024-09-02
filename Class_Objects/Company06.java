class Company06 {
    String name;

    public static void main(String[] args) {
        Company06 c1 = new Company06();
        c1.name = "Ethnus";
        Company06 c2 = c1;
        c1 = null;
        c2 = c1;
        System.out.println(c2.name);
    }
}





