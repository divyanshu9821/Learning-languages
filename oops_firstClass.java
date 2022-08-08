class Laptop{
    String screeSize, screenRes, keyboardType, processor, battery;//hd, fullhd
    
    void printDetails(){
        System.out.println("Screen Size: "+screeSize+"\nScreen Resolution: "+screenRes+"\nKeyboard Type: "+keyboardType+"\nProcessor: "+processor+"\nBattery: "+battery);
    }
    
    Laptop(String screenSize, String screenRes, String keyboardType, String processor, String battery){
        this.screeSize = screenSize;
        this.screenRes = screenRes;
        this.keyboardType = keyboardType;
        this.processor = processor;
        this.battery = battery;
    }
}

public class oops_firstClass{
    public static void main(String[] args) {
        Laptop mac = new Laptop("13 inches","Quad HD","Backlit","M1 Apple Silicon","11 Hours");
        mac.printDetails();        
    }
}
