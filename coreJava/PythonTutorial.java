package corejava;

import clone.Tutorial;

public class PythonTutorial extends Tutorial {



    public static void main(String[] args) throws CloneNotSupportedException {

        PythonTutorial dataScience = new PythonTutorial();
        dataScience.addDetails("DataScience","2024-08-15", "2024-09-15",
                49000.00, 15, 10);

        Tutorial tutorial = new Tutorial("Python", "2024-08-15", "2024-09-15",
                49000.00, 15, 10);

        Tutorial clone = tutorial.clone();
        System.out.println(clone);
    }
}
