
public class Demo {

	
	  public static void pivotIndex(int[] nums) {
//        int size=nums.length;
//        int pivotIndex=size/2;
//        int leftsum=0;
//        int rightsum=0;
//        for(int i=0;i<pivotIndex;i++){
//            leftsum=leftsum+nums[i];
//        }
//        for(int i=pivotIndex+1;i<size;i++){
//            rightsum=rightsum+nums[i];
//        }
//        if(leftsum==rightsum)
//            return pivotIndex;
//        else
//            return -1;
       
       
       
//    }
       
       int pivot=-1;
       int ls=0;
       int rs=0;
       for(int i=-1;i<pivot;i++){
           ls=nums[i]+ls;
           for(int j=pivot+1;j<nums.length;j++){
               rs=rs+nums[j];
           }
           pivot=pivot+1;
//           System.out.println("lss"+ls);
//           System.out.println("rss"+rs);
           
//           if(ls==rs)
//           {
//        	   System.out.println("lss"+ls);
//               System.out.println("rss"+rs);
////               return pivot;
//               
//           }
           System.out.println("lss"+pivot);
           System.out.println("lss"+ls);
           System.out.println("rss"+rs);
           
       }
       System.out.println("lss"+pivot);
       System.out.println("rss"+rs);
       
       
//   return pivot;
}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,7,3,6,5,6};
		pivotIndex(arr);
//		System.out.println(num);

	}

}
