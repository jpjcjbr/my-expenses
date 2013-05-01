package br.com.jp.model.repository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import br.com.jp.model.Expense;

@Named
public class ExpenseRepository {

	private static List<Expense> expenses = new ArrayList<Expense>();
	
	public void add(Expense expense){
		expenses.add(expense);
	}
	
	public List<Expense> list(){
		return expenses;
	}
}
