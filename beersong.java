public class beersong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            // First two lines of the verse
            System.out.println(beerNum + " " + word + " of beer on the wall,");
            System.out.println(beerNum + " " + word + " of beer.");

            // Middle action lines
            System.out.println("Take one down, pass it around.");

            beerNum--;

            // Handle singular/plural correctly
            if (beerNum == 1) {
                word = "bottle";
            } else {
                word = "bottles";
            }

            // Final line of the verse
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.\n");
            } else {
                System.out.println("No more bottles of beer on the wall.\n");
            }
        }
    }
}
