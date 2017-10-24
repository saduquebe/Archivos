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
public class PartialTime extends Professor {
    
private String category;
private int ClassHours;

    public PartialTime(String category, int ClassHours, String id, String name, Date hiringDate) {
        super(id, name, hiringDate);
        this.category = category;
        this.ClassHours = ClassHours;
    }

    @Override
    public float paySalary() {
    if(this.category.equals("A")){
        return this.ClassHours*60000;
    }
        else if(this.category.equals("B")){
                return this.ClassHours*80000;
                }
            else if(this.category.equals("C")){
                return this.ClassHours*10000;
                }
            else{
              throw new IllegalArgumentException("CATEGORY NOT FOUND");
            }
    }

    }
  
