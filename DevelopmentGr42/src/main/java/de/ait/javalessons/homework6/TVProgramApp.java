package de.ait.javalessons.homework6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TVProgramApp {
    private static List<TVProgram> result;

    public static void main(String[] args) {

        List<TVProgram> tvProgramList = TVProgramTestData.getTVProgramList();

        //result = findProgramsAboveRating(tvProgramList, 8.0);
        //for (TVProgram tvProgram : result) {
        //  System.out.println(tvProgram);
        //}
        //transferToStringFormat(tvProgramList);
        //findLiveProgram(tvProgramList);
        //System.out.println(findLongestProgram(tvProgramList));
        //System.out.println(getAverageRating(tvProgramList));

        //System.out.println(getGroupsByChannel(tvProgramList));
        System.out.println(sortTVProgramsByRating(tvProgramList));
    }

    //Найдите все передачи, рейтинг которых выше заданного порога (например, > 8.0).
    public static List<TVProgram> findProgramsAboveRating(List<TVProgram> tvProgramList, double rating) {
        return tvProgramList.stream()
                .filter(tvProgram -> tvProgram.getRating() > rating)
                .collect(Collectors.toList());
    }

    //Преобразуйте объекты TVProgram в удобные для вывода строки.
    public static void transferToStringFormat(List<TVProgram> tvProgramList) {
        List<String> collectResult = tvProgramList.stream()
                .map(tvProgram -> String.format("Канал:  %s | Передача: %s |Рейтинг: %.1f", tvProgram.getChannel(), tvProgram.getProgramName(), tvProgram.getRating()))
                .collect(Collectors.toList());
        for (String s : collectResult) {
            System.out.println(s);
        }
    }

    //Узнайте, есть ли среди всех передач хотя бы одна, которая идёт в прямом эфире (isLive == true).
    public static boolean findLiveProgram(List<TVProgram> tvProgramList) {
        boolean isLiveExists = tvProgramList.stream()
                .anyMatch(TVProgram::isLive);
        System.out.println("Live exists? " + isLiveExists);
        return isLiveExists;
    }

    //Определите, какая из передач самая длительная (максимальное значение поля duration).
    public static TVProgram findLongestProgram(List<TVProgram> tvProgramList) {
        Optional<TVProgram> longestTvProgramm = tvProgramList.stream()
                .max(Comparator.comparingInt(TVProgram::getDuration));
        return longestTvProgramm.orElse(null);
    }

    //Подсчёт среднего рейтинга
    public static double getAverageRating(List<TVProgram> tvProgramList) {
        return tvProgramList.stream()
                .mapToDouble(TVProgram::getRating)
                .average()
                .orElse(0.0);
    }

    //Группировка по каналу
    public static Map<String, List<TVProgram>> getGroupsByChannel(List<TVProgram> tvProgramList) {
        Map<String, List<TVProgram>> result = tvProgramList.stream()
                .collect(Collectors.groupingBy(TVProgram::getChannel));
        return result;
    }

    //Сортировка
    public static List<TVProgram> sortTVProgramsByRating(List<TVProgram> tvProgramList) {
        return tvProgramList.stream()
                .sorted(Comparator.comparingDouble(TVProgram::getRating).reversed())
                //.limit(2)
                .collect(Collectors.toList());
    }
}
