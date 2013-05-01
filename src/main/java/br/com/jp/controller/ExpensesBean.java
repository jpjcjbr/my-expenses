package br.com.jp.controller;

import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.jp.model.Expense;
import br.com.jp.model.repository.ExpenseRepository;
import br.com.jp.utils.JSFFlash;

@RequestScoped
@Named
public class ExpensesBean {

	private Expense expense = new Expense();
	
	public ExpensesBean()
	{
		expense = new Expense();
	}
	
	@Inject
	private ExpenseRepository expenseRepository;
	
	public String add()
	{
		System.out.println(expense.getDescription());
		
		expenseRepository.add(expense);
		
		JSFFlash.put("success", "Expense added");
		
		return "list.xhtml";
	}
	
	public List<Expense> getExpenses()
	{
		return expenseRepository.list();
	}

	public Expense getExpense() {
		return expense;
	}

	public void setExpense(Expense expense) {
		this.expense = expense;
	}
}
