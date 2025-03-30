package de.ait.javalessons.consultation;

import de.ait.javalessons.homework6.TVProgram;

import java.util.List;

public class ContainerAppMain {
    public static void main(String[] args) {
        ContainerApp<String> stringContainerApp = new ContainerApp<>();
        stringContainerApp.add("Hello");
        stringContainerApp.add("World");
        System.out.println(stringContainerApp.get(0));
        System.out.println(stringContainerApp.get(1));

        ContainerApp<Integer> intContainerApp = new ContainerApp<>();
        intContainerApp.add(10);
        intContainerApp.add(20);
        System.out.println(intContainerApp.get(0));
        System.out.println(intContainerApp.get(1));

        ContainerApp<TVProgram> tcontainerApp = new ContainerApp<>();
        tcontainerApp.add(new TVProgram("TV-5","Sport news", 100, true, 4));
        tcontainerApp.add(new TVProgram("TV-6","Sport news", 100, true, 4));
        System.out.println(tcontainerApp.get(0));
        System.out.println(tcontainerApp.get(1));

        List<String> list = List.of("Hello", "World");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
