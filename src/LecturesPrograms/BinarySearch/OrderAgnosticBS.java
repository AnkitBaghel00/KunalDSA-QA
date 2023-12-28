package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};//{10,9,8,7,6};
        int target = 6;
        int res = bs(arr,target);
        System.out.println(res);
        String s = checkstoreORnot(arr);
        System.out.println(s);

    }

    static int bs(int[] arr,int target) {
        int lo =0;
        int hi =arr.length-1;

        while(lo<=hi){

            int mid= (lo+hi)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(b(arr)){
                System.out.println("ascending hai");
                if(arr[mid] < target){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }else{
                System.out.println("Descending hai");
                if(arr[mid] > target){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        return -1;
    }

    static boolean b(int arr[]) {

        return arr[0] < arr[arr.length - 1];
    }


    static String checkstoreORnot(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] <arr[j]){
                    return "ascending";
                }else if(arr[i] > arr[j]){
                    return "descending";
                }
            }
        }
        return "wrong input";
    }
//    static int converttostored(int arr[]){
//        int narr[];
//        for(int i=0;i<arr.length;i++){
//           for(int j=i+1;j<arr.length;j++){
//               if(arr<)
//           }
//        }
//    }

}



