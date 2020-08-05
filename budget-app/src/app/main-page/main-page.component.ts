import { Component, OnInit } from '@angular/core';
import { BudgetItem } from 'src/shared/models/budget-item-model';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.scss']
})
export class MainPageComponent implements OnInit {

  amountLeft: number = 0;
  budgetItems: BudgetItem[] = new Array<BudgetItem>();
  constructor() { }

  ngOnInit() {
  }

  addItem(newItem: BudgetItem) {
    this.budgetItems.push(newItem);
    this.calculateAmount();
  }

  private calculateAmount() {
    this.amountLeft = this.budgetItems.map(budgetItem => budgetItem.amount).reduce((previousValue: number, currentValue: number) => previousValue + currentValue, 0);
  }

  deleteItem(item: BudgetItem) {
    const index = this.budgetItems.findIndex((budgetItem: BudgetItem) => budgetItem == item);
    this.budgetItems.splice(index, 1);
    this.calculateAmount();
  }

}
