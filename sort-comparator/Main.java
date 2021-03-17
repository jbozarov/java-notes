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

        List<Project> projects = new ArrayList<>();
        projects.add(p1);
        projects.add(p2);
        projects.add(p3);
        projects.add(p4);
        projects.add(p5);

        System.out.println(Arrays.toString(projects.stream().map(v -> v.getName()).toArray()));

        List<Project> newProjects = sortProjectByName(projects);

        System.out.println(Arrays.toString(projects.stream().map(v -> v.getName()).toArray()));

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
