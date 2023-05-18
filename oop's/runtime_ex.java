package Ch9;

class Bank{
    float getROI(){
        return 0;
    }
}
class SBI extends Bank{
    float getROI(){
        return 8.4f;
    }
}
class ICIC extends Bank{
    float getROI(){
        return 3.4f;
    }
}
class AXIS extends Bank{
    float getROI(){
        return 9.7f;
    }
}
public class poly {
    public static void main(String args[]){
        Bank b;
        b = new SBI();
        System.out.println("SBI ROI : " +b.getROI());
        b = new ICIC();
        System.out.println("ICICI ROI: " +b.getROI());
        b = new AXIS();
        System.out.println("AXIS ROI: " +b.getROI());

    }

}
