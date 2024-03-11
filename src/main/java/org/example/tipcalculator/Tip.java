package org.example.tipcalculator;

public class Tip {
    private double amount; //amount of dollar consumed
    private double taxRate;  //percent of tax
    private double tipPercent; //percent of tip

    public Tip(){
        amount = 0.00;
        taxRate = 0.15;
        tipPercent = 0.18;
    }

    public Tip(double amount, double tipPercent){
        this.amount = amount;
        taxRate = 0.15;
        this.tipPercent = tipPercent;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getTipPercent(){
        return tipPercent;
    }

    public void setTipPercent(double tipPercent){
        this.tipPercent = tipPercent;
    }

    public double getTaxRate(){
        return taxRate;
    }

    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }

    public double calculateTax(){
        return getAmount() * getTaxRate();
    }

    public double calculateTip(){
        return getAmount() * getTipPercent();
    }

    public double calculateTotal(){
        return getAmount() + calculateTax() + calculateTip();
    }

}

