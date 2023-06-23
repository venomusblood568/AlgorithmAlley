//print name n times using recursion
// my way without wacthing any clue
public class n_times {
    static  int count = 0;
    static  void n_times_name(){
        int n = 10;
        if (count == n){
            return;
        }
        else{
            System.out.println("sam is back");
            count = count + 1;
            n_times_name();
        }
    }
    public static void main(String[] args){
        n_times_name();
    }
}
