package entities;

public class Company extends TaxPayer{
  private int numberOfEmployees;
  

  public Company() {
    super();
  }


  public Company(String name, Double anualIncome, int numberOfEmployees) {
    super(name, anualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }


  public Double tax(){
    return 0.0;
  }


  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }


  public void setNumberOfEmployees(int numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }
}
