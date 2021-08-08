class BankAccount:
    ## CONSTRUCTOR -- Defines self.balance -- balance belonging to the class variable
    def __init__(self, balance):
        self.balance = balance

    ## This function takes away some money from the account balance
    def withdraw(self, amount):
        self.balance = self.balance - amount

## class ClassName(class_to_inherit_from):
class BetterBankAccount(BankAccount):
    def __init__(self, balance, maximum_amount):
        self.balance = balance
        self.maximum_amount = maximum_amount
    
    def isBalanceAboveMaximum(self):
        if self.balance > self.maximum_amount:
            return True
        else:
            return False
