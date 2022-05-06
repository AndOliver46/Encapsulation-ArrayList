package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int quantidadeDeFuncionarios = sc.nextInt();
		
		Employee[] employee = new Employee[quantidadeDeFuncionarios];
		List<Employee> list = new ArrayList<>();
		
		for(int i=0; i < quantidadeDeFuncionarios; i++) {
			System.out.println("\nEmployee #" + (i+1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee[id] = new Employee(id, name, salary);
			list.add(id, employee[id]);
		}
		
		System.out.print("Enter employee ID that will have salary increase: ");
		int id = sc.nextInt();
		System.out.println("Enter the percentage: ");
		double percentage = sc.nextDouble();
		double valorAposAumento = employee[id].getSalary() * (percentage/100);
		
		employee[id].increaseSalary(valorAposAumento);
		
		list.removeIf(x -> x.getId() == id);
		list.add(id, employee[id]);
		
		System.out.println("");
		sc.close();
	}

}
