package Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entities.enums.WorkerLevel;

public class Worker {
 private String name;
 private WorkerLevel level;
 private Double baseSalary;

 private Department department;
 private List<HourContract> contracts = new ArrayList<>();

 public Worker() {
}
  

public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
  this.name = name;
  this.level = level;
  this.baseSalary = baseSalary;
  this.department = department;
}


public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public WorkerLevel getLevel() {
  return level;
}
public void setLevel(WorkerLevel level) {
  this.level = level;
}
public Double getBaseSalary() {
  return baseSalary;
}
public void setBaseSalary(Double baseSalary) {
  this.baseSalary = baseSalary;
}


public Department getDepartment() {
return department;
}


public void setDepartment(Department department) {
this.department = department;
}


public void addContract(HourContract contract){
  this.contracts.add(contract);
}

public void removeContract(HourContract contract){
  this.contracts.remove(contract);
}

public Double income(Integer year, Integer month){
  double sum = baseSalary;
  Calendar cal = Calendar.getInstance();
  for(HourContract c : contracts){
    cal.setTime(c.getDate());
    int c_YEAR = cal.get(Calendar.YEAR);
    int c_MONTH = 1 + cal.get(Calendar.MONTH);
    if(year == c_YEAR && month == c_MONTH){
      sum += c.totalValue();
    }
  }
  return sum;
}


}