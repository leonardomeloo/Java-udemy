package entities;

public class Individual extends TaxPayer {
  private Double healthExpenditures;

  
  
  public Individual() {
    super();
  }

  public Individual(String name, Double anualIncome, Double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }



  
  public Double getHealthExpenditures() {
    return healthExpenditures;
  }
  
  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }
  public Double tax(){
    if(getAnualIncome() < 20000.00){
      double tax = 0.15;
      if(healthExpenditures > 0){
        double discount = healthExpenditures/2;
      return (getAnualIncome() * tax) - discount;
      }
      return getAnualIncome() * tax;
    }else{
      double tax = 0.25;
      if(healthExpenditures > 0){
        double discount = healthExpenditures/2;
        return getAnualIncome() * tax - discount;
      }
      return getAnualIncome() * tax;
    }
  }
}
