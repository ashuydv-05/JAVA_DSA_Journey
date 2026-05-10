package multi_arrays;

public class diagonal {
    public static int dia2(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==arr.length-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
    } 
    public static int dia(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }

        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        int ar[][]={{1,2,3,},
                    {6,7,8,},
                    {10,12,14}
                };
        dia2(ar);         
        dia(ar);
    }
}
