public class AverageScore{
    public static void main(String[] args){
        int[] sarray={61,57,95,85,75,65,44,66,90,32};
        int c=0;
        for(int s:sarray){
            c+=s;
        }
        System.out.println(c/sarray.length);
    }

}