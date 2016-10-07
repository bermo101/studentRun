/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bermingham.studentrun;

import com.bermingham.studentregsystem.Course;
import com.bermingham.studentregsystem.Module;
import com.bermingham.studentregsystem.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Brian
 */
public class studentDriver {
    public static void main(String[] args) throws ParseException {
        System.out.print("hello");
        
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateformat.parse("17/07/1989");
        Date date2 = dateformat.parse("11/12/1995");
        Date date3 = dateformat.parse("02/03/1991");
        Student x = new Student("Dave", "123424", 27, date1);
        Student y = new Student("Mary", "123453", 20, date2);
        Student z = new Student("John", "242542", 25, date3);
        
        Module a = new Module("Physics", "P101");
        a.addstudent(x);
        a.addstudent(y);
        Module b = new Module("Chemistry", "C102");
        b.addstudent(z);
        
        Course alpha = new Course("Science", "S111");
        alpha.addModule(a);
        alpha.addModule(b);
        
        alpha.displayCourse();
    }
}
