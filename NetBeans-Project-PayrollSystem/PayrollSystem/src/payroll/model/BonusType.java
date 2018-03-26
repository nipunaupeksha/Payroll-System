/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.model;

/**
 *
 * @author ASUS
 */
public class BonusType {

    private String gradeId;
    private String bonusType;
    private double amount;

    public BonusType() {
    }

    public BonusType(String gradeId, String bonusType, double amount) {
        this.gradeId = gradeId;
        this.bonusType = bonusType;
        this.amount = amount;
    }

    /**
     * @return the gradeId
     */
    public String getGradeId() {
        return gradeId;
    }

    /**
     * @param gradeId the gradeId to set
     */
    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * @return the bonusType
     */
    public String getBonusType() {
        return bonusType;
    }

    /**
     * @param bonusType the bonusType to set
     */
    public void setBonusType(String bonusType) {
        this.bonusType = bonusType;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
