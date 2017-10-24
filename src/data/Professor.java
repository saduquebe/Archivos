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
public abstract class Professor extends Employee{

    public Professor(String id, String name, Date hiringDate) {
        super(id, name, hiringDate);
    }

    @Override
    public float paySalary() {
        return 0;
    }
    
}
