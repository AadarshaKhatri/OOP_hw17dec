package models;

public class Students {
int age;
String name;
int grade;
int[] marks;

    public Students(int age, String name, int grade, int[] marks) {   //constructor
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public void display(){
        int total = 0;
        String Name = this.name;
        int Age = this.age;
        int Grade = this.grade;
        int[] Marks = this.marks;
        for (int i = 0 ; i <marks.length;i++){
            total = total + Marks[i];

        }
        int total_sum = 100*marks.length;
        float per = ((float)total/total_sum) *100;

        System.out.println(Name + " from " + Grade + " has secured " + per+ " %"+ " and the grade is: " );
        if( per>= 0 && per <=40) {
            System.out.println("D");
        }else if (per>40 && per<=60){
            System.out.println("C");
        } else if (per>60 && per<=80) {
            System.out.println("B");
        }else if (per>80 && per<=100) {
            System.out.println("A");

        }
    }
}
