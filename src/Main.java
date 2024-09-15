import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum =0;
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int[] hows = {0, 0, 0};
        while (true) {
            System.out.println("Список возможных товаров для покупки");
            for (int i = 0; i < products.length; i++) {
                System.out.println(i+1+" " + products[i] +" " + prices[i] + " руб/шт");
            }
            String input = console.nextLine();
            if(input.equals("end")){
                break;
            }
            String[] words = input.split(" ");
            int what = Integer.parseInt(words[0])-1;
            int how = Integer.parseInt(words[1]);
            sum += prices[what] * how;
            hows[what] += how;
        }
        System.out.println("Ваша корзина: ");
        for(int i =0; i < hows.length; i++){
            if(hows[i] != 0){
                System.out.println(products[i] + " " + hows[i]+" шт " + prices[i]+ " руб/шт " + hows[i] * prices[i] + " руб в сумме");
            }
        }
        System.out.println("Итого " + sum + " руб");
    }
}