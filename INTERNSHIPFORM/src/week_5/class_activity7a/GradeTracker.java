package week_5.class_activity7a;

import java.util.HashMap;

public class GradeTracker {


        HashMap<Integer, Double> studentGrade;

        public GradeTracker(){
            studentGrade = new HashMap<>();
        }

        public void addGrade(Integer id, Double grade){
            studentGrade.put(id, grade);

        }
        public double getGrade(Integer id){
            if(!studentGrade.containsKey(id))
                return -1.0;
            return studentGrade.get(id);

        }

}
