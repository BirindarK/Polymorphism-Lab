public class Profit {
    int profit1(int numberOfGuests, int priceOfRoom){
        return numberOfGuests * priceOfRoom;
    }

    double profit2(double numberOfGuests, double priceOfRoom) {
        return numberOfGuests * priceOfRoom;
    }

}

class ProfitGenerated {
    public static void main(String[] args) {
        Profit profit = new Profit();

        int intProfit = profit.profit1(345,40);
        System.out.println("Profit Generated: " + intProfit);

        double doubleProfit = profit.profit2(345,45.99);
        System.out.println("Profit Generated: " + doubleProfit);
    }


}

