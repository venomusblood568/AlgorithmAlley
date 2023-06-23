// printing number from 0 to n linearly
//did without any help
public class o1_n_linearly {
    static int count = 0;
    static  void o1_to_N(){
        if(count == 101){
            return;
        }
        else{
            System.out.println(count);
            count = count+1;
            o1_to_N();
        }
    }
    public static void main(String[] args){
        o1_to_N();
    }
}
