public class rough {
    public static int compress(char[] arr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = arr.length;
        // System.out.println("before append "+ arr[i]);
        // sb.append(arr[i]);
        // Integer count =1;
        while(i<n){
            System.out.println("before append "+ arr[i]);
            sb.append(arr[i]);
            Integer count =1;
            while(i<n-1 && arr[i]==arr[i+1]){
                count++;
                System.out.println("in while ="+count);
                i++;

            }
            if(count>1){
                System.out.println("before append");
                sb.append(count);
            }
            i++;
        }
         String str = sb.toString();
         System.out.println(str);
        return str.length();
    }
    public static void main(String args[]){
        char str[] = {'a','a','b','b','c','c','c'};
        // compress(str);
        System.out.println(compress(str));
        
    }
}
