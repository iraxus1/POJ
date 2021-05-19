package pl.edu.pja;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Double> gradeList = new ArrayList<>();

    public void addGrade(double grade)
    {
        this.gradeList.add(grade);
    }

    public double getAvgGrade()
    {
        if(gradeList.size() == 0)
        {
            return 0;
        }

        else
        {
            double suma = 0;

            for (int i = 0; i < gradeList.size(); i++) {
                suma = suma + gradeList.get(i) ;
            }
            return suma / gradeList.size();
        }
    }
}
