package chapters.chapters_09.Exercises;

public class Exercise9_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println(stock.getName() + " " + stock.getSymbol() + " " + stock.getPreviousClosingPrice() + " "
        + stock.getCurrentPrice()  );

        System.out.printf(" The change in percantage is %.2f" , stock.getChangePercent());
    }
}
