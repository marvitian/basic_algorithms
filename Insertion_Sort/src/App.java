public class App {
    public static void main(String[] args) throws Exception {
        
        //inititialize 
        Sort sort = new Sort();
        int[] list = {5,2,7,1,0,6,8,9,4,2};
        System.out.println("unsorted");
        for(int i = 0;i<list.length;i++){
            System.out.println(list[i]);
        }
        sort.sort(list);
        System.out.println("sorted");
        for(int i = 0;i<list.length;i++){
            System.out.println( list[i]);
        }
    }
}
