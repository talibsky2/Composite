public class Test {
    public static void main(String[] args) {
        AllBooks book1 = new Book();
        AllBooks book2 = new Book();
        AllBooks magazine1 = new Magazine();
        AllBooks magazine2 = new Magazine();
        AllBooks brochure1 = new Brochure();
        AllBooks brochure2 = new Brochure();

        Composite box1 = new Composite();
        Composite box2 = new Composite();
        Composite bigBox= new Composite();

        box1.addItem(book1);
        box1.addItem(magazine1);
        box1.addItem(brochure1);

        box2.addItem(book2);
        box2.addItem(magazine2);
        box2.addItem(brochure2);

        bigBox.addItem(box1);
        bigBox.addItem(box2);

        bigBox.readMe();

    }
}