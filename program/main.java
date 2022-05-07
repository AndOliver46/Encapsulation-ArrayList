package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int quantidadeDeFuncionarios = sc.nextInt();
		
		Employee employee;
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		for(int i=0; i < quantidadeDeFuncionarios; i++) {
			System.out.println("\nEmployee #" + (i+1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee = new Employee(id, name, salary);
			list.add(i, employee);
		}
		
		System.out.print("\nEnter employee ID that will have salary increase: ");
		int id = sc.nextInt();

		for(Employee x : list) {
			if(x.getId() == id) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				double valorAposAumento = x.getSalary() * (percentage/100);
				x.increaseSalary(valorAposAumento);
			}
		}
		
		System.out.println("\nList of employees: ");
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + ", " + list.get(i).getName() + ", " + list.get(i).getSalary());
		}
		sc.close();
	}

}
