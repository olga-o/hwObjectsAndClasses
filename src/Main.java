public class Main {
    public static void main(String[] args) {
        Author karenBlixen = new Author("Karen", "Blixen");
        Author mariaParr = new Author("Maria", "Parr");

        Book outOfAfrica = new Book("Out of Africa", karenBlixen, 1937);
        Book adventuresWithWaffles = new Book("Adventures with waffles", mariaParr, 2003);

        adventuresWithWaffles.setYearOfPublication(2005);

        System.out.println(karenBlixen.toString());
        System.out.println(outOfAfrica.toString());

        System.out.println(outOfAfrica.equals(adventuresWithWaffles));
        System.out.println("\n");

    }
}