package binary_search;
// first occurance with rec
public class first_occu {
    public static void main(String args[]){
        int ar[]={1,1,1,1,2};
        int k = 1;
        System.out.print(search(0,ar.length-1,ar,k));
    }


    // USING RECURSION BINARY CODE
    public static int search(int l,int h, int arr[], int tar){
        
        if(l>h) return -1;

        int m = (l+h)/2;    
        if(arr[m]==tar){
            //do left search
            int ans = search(l,m-1,arr,tar);
            if(ans!=-1){
                return ans;
            }
            return m; 
        }
        if(arr[m]<tar) {
        return search(m+1,h,arr,tar);}
        else{
            return search(l,m-1,arr,tar);
        }
    }

    
    //  WITH SIMPLE CODE BINARY SEARCH WITHOUT RECURSION
    public static int firstSearch(int arr[], int tar){
        int l =0, h = arr.length-1;
        int ans= -1;
        while(l<=h){
            int m = (l+h)/2;
            if(arr[m]==tar){
                ans = m;
                 h=m-1;
                // break;
            }
            if(arr[m]<tar){ 
                l=m+1;
            }
            else {
                h=m-1;
            }
        }
        return ans;

    }    

}
