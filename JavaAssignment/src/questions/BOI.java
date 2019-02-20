package questions;

public class BOI extends Q11Bank{

    public BOI(double rateOfInterest, String bankName, Integer noOfBranches) {
        this.rateOfInterest = rateOfInterest;
        this.bankName = bankName;
        this.noOfBranches = noOfBranches;
    }

    void getDetails(){
        System.out.println("bankName=" + bankName + " , rateOfInterest=" + rateOfInterest + " , noOfBranches=" + noOfBranches);
    }
}
