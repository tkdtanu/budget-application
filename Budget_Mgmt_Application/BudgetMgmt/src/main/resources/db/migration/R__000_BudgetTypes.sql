INSERT INTO `budgetmgmt`.`budget-type` (`Id`, `Name`) VALUES ('1', 'Income')
	ON DUPLICATE KEY UPDATE `Name` = 'Income';
INSERT INTO `budgetmgmt`.`budget-type` (`Id`, `Name`) VALUES ('2', 'Expense')
	ON DUPLICATE KEY UPDATE `Name` = 'Expense';