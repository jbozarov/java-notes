package com.company.sort_compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Project p1 = new Project(1, "XYZ", "Alpha project");
        Project p2 = new Project(2, "George", "Alpha project");
        Project p3 = new Project(3, "Alpha", "Alpha project");
        Project p4 = new Project(4, "Cristian", "Alpha project");
        Project p5 = new Project(5, "Jahongir", "Alpha project");

        List<Project> projects = List.of(p1, p2, p3, p4, p5);


        System.out.println(Arrays.toString(Arrays.stream(projects.toArray()).toArray()));


        List<Project> newProjects = sortProjectByName(projects);

        System.out.println(Arrays.toString(newProjects.toArray()));

    }


    public  static List<Project>sortProjectByName(List<Project> projects) {

        Collections.sort(projects, new Comparator<Project>() {

            @Override
            public int compare(Project o1, Project o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });

        return projects;

    }


}
