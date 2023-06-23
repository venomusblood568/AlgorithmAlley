public class n_2_01_using_backtracking {
    static  int count = 4;
    static void counter(){
        if(count == 0 ){
            return;
        }
        else{
            System.out.println(count);
            count = count-1;

            counter();
        }
    }
    public static void main(String[] args){
        counter();
    }
}
