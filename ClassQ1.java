public class ClassQ1 {
    private  double balance,rate;

    /***
     * default constructor.
     */

    /***
     * another constructor with initial balance
     * @param initialBalance the initial balance
     */
    public ClassQ1(double initialbalance,double rate){
        balance=initialbalance;
        this.rate=rate;
    }
    public ClassQ1(){
        this(0,0);}


    /**
     * withdraw specific  amount of mony from the current account
     * @param amount
     * @return
     */
    public double  getbalance(){
        return balance;
    }
    public  void addInsert()
    {
        balance=balance+balance*(rate/100);
    }


}
