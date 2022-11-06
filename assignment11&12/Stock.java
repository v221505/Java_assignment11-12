import java.util.ArrayList;
import java.util.Scanner;
class Stock {
        ArrayList<String> stockName = new ArrayList<>();  //storing user input in arraylist
        ArrayList<Integer> numberOfShares = new ArrayList<>();
        ArrayList<Integer> sharesPrice = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        public void addStocks() {
            System.out.println("Enter the Stock name : ");  //stock name in String
            stockName.add((scanner.next()));

            System.out.println("Enter number of shares :");
            numberOfShares.add(scanner.nextInt());

            System.out.println("Enter price of stock :");
            sharesPrice.add(scanner.nextInt());

        }
    }
    class StockReport extends Stock {
        public void stockReport() {
            System.out.println("\t\t Stock Report ");
            for (int i = 0; i < stockName.size(); i++) {
                int total = (numberOfShares.get(i) * sharesPrice.get(i));
                System.out.println("Stock name : " + stockName.get(i) + "\nValue of each share : "  + sharesPrice.get(i)
                        + "\nTotal value of share : " + total);
                System.out.println("");
            }
        }
    }
    class StockManagement {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            StockReport obj = new StockReport();

            while (true) {
                System.out.println("1. Enter new Stock \n2-Display Stock Report \n3- Exit");
                System.out.println("Enter your choice :");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        obj.addStocks();
                        break;
                    case 2:
                        obj.stockReport();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("invalid choice");
                }
                if(choice==3)
                {
                    break;
                }
            }
        }

}

