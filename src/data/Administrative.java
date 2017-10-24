/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Administrative extends Employee {

private String Category;
private float salary;

    public Administrative(String Category, float salary, String id, String name, Date hiringDate) {
        super(id, name, hiringDate);
        this.Category = Category;
        this.salary = salary;
    }

    @Override
    public float paySalary() {
        return this.salary;
    }

}
