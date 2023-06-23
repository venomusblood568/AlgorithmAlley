public class simple_recursion {
        static int count = 0;
        static void print(){
            if(count == 5){
                return;
            }
            else{
                System.out.println(count);
                count = count + 1;
                print();
            }
        }
    public static void main(String[] args){
       print();
    }
}
