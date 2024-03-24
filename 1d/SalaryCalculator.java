public class SalaryCalculator {
    public int calculateNetSalary(int baseSalary) {
      // Assume tax is 25% of base salary
      int tax = (int) (baseSalary * 0.25); // Calculate tax
      return baseSalary - tax; // Calculate net salary
    }
  }