package questions;

public class ICICI extends Q11Bank{
    public ICICI(double rateOfInterest, String bankName, Integer noOfBranches) {
        this.rateOfInterest = rateOfInterest;
        this.bankName = bankName;
        this.noOfBranches = noOfBranches;
    }

    void getDetails(){
        System.out.println("bankName=" + bankName + " , rateOfInterest=" + rateOfInterest + " , noOfBranches=" + noOfBranches);
    }
}
