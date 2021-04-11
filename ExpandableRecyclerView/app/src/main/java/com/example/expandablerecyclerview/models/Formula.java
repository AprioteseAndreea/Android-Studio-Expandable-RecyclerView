package com.example.expandablerecyclerview.models;


public class Formula {

    private String name;
    private String formula;
    private boolean expanded;

    public Formula(String name, String formula) {
        this.name = name;
        this.formula = formula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "Formula{" +
                "name='" + name + '\'' +
                ", formula='" + formula + '\'' +
                ", expanded=" + expanded +
                '}';
    }
}
