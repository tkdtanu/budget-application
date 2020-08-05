CREATE TABLE `budgetmgmt`.`budget` (
  `Id` VARCHAR(36) NOT NULL,
  `UserId` VARCHAR(36) NOT NULL,
  `Type` INT NOT NULL,
  `Amount` DECIMAL NOT NULL DEFAULT 0,
  PRIMARY KEY (`Id`),
  INDEX `FK_Budget_BudgetType_idx` (`Type` ASC) VISIBLE,
  CONSTRAINT `FK_Budget_BudgetType`
    FOREIGN KEY (`Type`)
    REFERENCES `budgetmgmt`.`budget-type` (`Id`));
