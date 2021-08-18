public class Sort{
    int j;
    int i;
    int key;
    int[] A;

    public void sort(int[] orig){
        //pass by reference so it changes the original
        A = orig;
        //this for loop itereates through the elements to sort
        //  by comparing each to all previous elements
        for(j=1; j<A.length; j++){
            key = A[j]; //store the element in question 
            i = j - 1;

            while(i>=0 && A[i] > key){
                A[i+1] = A[i];
                i--;
            }

            A[i+1] = key;
        }
    }
}
