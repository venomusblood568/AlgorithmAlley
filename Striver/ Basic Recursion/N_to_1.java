public class N_to_1 {
    static int count = 100;
    static void n_2_1(){
        if(count == 0){
            return;
        }
        else{
            System.out.println(count);
            count = count-1;
            n_2_1();
        }
    }
    public static void main(String[] args){
        n_2_1();
    }
}
