package assignment;

public class Program13 {

class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // To be overridden
    public double pay(int hours) {
        return 0.0;
    }

    public void showPay(int hours) {
        System.out.println("Worker: " + name + ", Pay for " + hours + " hours: Rs. " + pay(hours));
    }
}

// DailyWorker subclass
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double pay(int hours) {
       
        return hours * salaryRate;
    }
}


class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double pay(int hours) {
       
        return 40 * salaryRate;
    }
}

public class Main {
    public static void main(String[] args) {
        DailyWorker dw = new DailyWorker("Rahul", 100);
        SalariedWorker sw = new SalariedWorker("Anita", 150);

        System.out.println("----- Worker Payment Summary -----");
        dw.showPay(35);  
        sw.showPay(35);  

        dw.showPay(50);
        sw.showPay(50);  
    }
}

}
