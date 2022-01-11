package com.company;

import com.company.hrms.CanBo;
import com.company.hrms.Employer;
import com.company.hrms.Engineer;
import com.company.hrms.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<CanBo> searchedList = new ArrayList<>();
        int x;
        List<CanBo> canBoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add employee before search");
        System.out.println("How many employers you wanna add to the list");
        x = sc.nextInt();
        for(int i = 0; i < x ; i++){
            setupFunc(canBoList, sc);
        }
        for (int i = 0; i < canBoList.size(); i++) {
            System.out.println(canBoList.get(i).toString());
        }
        searchUser(searchedList, canBoList, sc);

        System.out.println(searchedList + " Result");
    }

    private static void setupFunc(List<CanBo> canBoList, Scanner sc) {
        String address;
        String dateOfBirth;
        String fullName;
        String gender;
        String method;
        System.out.println("Access the role of person who you want to add");
        method = sc.next();
        System.out.println("Access your date of birth ");
        dateOfBirth = sc.nextLine();
        System.out.println("Access your fullName ");
        fullName = sc.nextLine();
        System.out.println("Access your address ");
        address = sc.nextLine();
        System.out.println("Access your gender ");
        gender = sc.next();
        switch (method){
            case "staff":
                CanBo staff = new Staff(dateOfBirth,fullName,address,gender);
                canBoList.add(staff);
                break;
            case "engineer":
                CanBo engineer = new Engineer(dateOfBirth,fullName,address,gender);
                canBoList.add(engineer);
                break;
            case "employee":
                CanBo employer = new Employer(dateOfBirth,fullName,address,gender);
                canBoList.add(employer);
                break;
            default:
                break;
        }
    }
    // search by name
    private static void searchUser(List<CanBo> searchedList, List<CanBo> canBoList, Scanner sc) {
        String checkMethod;
        String keyword;
        System.out.println("You want to search? ");
        checkMethod = sc.next();
        System.out.println(checkMethod);
        System.out.println("Input search");
        keyword = sc.next();
        for (int g = 0; g < canBoList.size(); g++) {
            boolean isMatching = canBoList.get(g).getFullName().contains(keyword);
            if(isMatching == true) {
                searchedList.add(canBoList.get(g));
            }
        }
    }
}
