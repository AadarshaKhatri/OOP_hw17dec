package models;

public class Info {
    public static void main(String[] args) {
       ;
        Students std1 = new Students(17,"Aaadarsha Khatri",12,new int[]{30, 79, 89, 87, 86});
        Students std2 = new Students(19,"Ram",12,new int[]{90,88,78,67,59});
        Students std3 = new Students(20,"Sam",11,new int[]{90,98,78,67,87}) ;

        std1.display();
        std2.display();
        std3.display();
    }
}
