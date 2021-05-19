package pl.edu.pja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private Map<String, List<Double>> gradeList = new HashMap<>();

    public void addGrade(String subject, double grade) {
        this.gradeList.computeIfAbsent(subject, grades -> new ArrayList<>());
        this.gradeList.get(subject).add(grade);
    }

    public double getAvgGrade(String subject) {
        if (gradeList.get(subject).size() == 0) {
            return 0;
        }
        else
        {
            double suma = 0;
            for(int i = 0; i < gradeList.get(subject).size(); i++ )
            {
                suma = suma + gradeList.get(subject).get(i);
            }
            return suma/gradeList.get(subject).size();
        }
    }
}