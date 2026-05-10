package arrays;

public class buy_sell {
    public static void stocks(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int profit=0;
        int MaxProfit=0;
        //every day checking, if any profit or not
        for(int i =0;i<price.length;i++){
            if(buyprice<price[i]){
                profit=price[i]-buyprice;
                MaxProfit=Math.max(MaxProfit,profit);

            }

            else{
                buyprice = price[i];
            }
        }
        System.out.print("Max Profit ="+MaxProfit);
    }
    public static void main(String args[]){
        int today[]={7,1,5,3,6,4};
        stocks(today);

    }
    
}
