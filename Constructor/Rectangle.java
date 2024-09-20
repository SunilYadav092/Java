class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    public void calculateArea() {
        System.out.println("Area: " + (length * width));
    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);
        rect1.calculateArea();
    }
}
