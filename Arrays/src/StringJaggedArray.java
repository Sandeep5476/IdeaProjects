public class StringJaggedArray {

    public static void main(String[] args) {
        String[][] jaggedArray= {{"sandeep","ram","sam"},{"nandu","mahesh","durga","narendra"}};
        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
