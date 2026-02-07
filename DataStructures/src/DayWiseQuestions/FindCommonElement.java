package DayWiseQuestions;
//finding common elements among three sorted arrays.

/*
  brute force approach to find common elements among three sorted arrays.
  for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr2.length;j++){
      for(int k=0;k<arr3.length;k++){

 */
public class FindCommonElement {
    void bruteForce(int[]arr1,int[] arr2,int[] arr3){
        for (int i : arr1) {
            for (int j : arr2) {
                for (int k : arr3) {
                    if (i == j && j == k) {
                        System.out.println("The common elements are: " + j);
                    }
                }
            }
        }
    }
    void findCommon(int[] arr1,int[] arr2,int[] arr3){
        //optimal approach
        int x=0,y=0,z=0;
        while(x < arr1.length && y < arr2.length && z < arr3.length){
            if(arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                System.out.println("The common elements are: "+arr1[x]);
                x++;
                y++;
                z++;
            }
            else if(arr1[x] > arr2[y]){
                y++;
            } else if (arr2[y] > arr3[z]) {
                z++;
            } else {
                x++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2={2,3,7,8,9};
        int[] arr3={2,3,11,22,55,66};
        FindCommonElement obj = new FindCommonElement();
        obj.findCommon(arr1,arr2,arr3);
        obj.bruteForce(arr1,arr2,arr3);
    }
}
