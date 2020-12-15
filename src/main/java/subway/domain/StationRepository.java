package subway.domain;

import java.util.*;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static boolean deleteStation(String name) {
        Station thisStation = findStationByName(name);
        if (thisStation != null && thisStation.isRemovable()) {
            return stations.removeIf(station -> Objects.equals(station.getName(), name));
        }
        return false;
    }

    public static Station findStationByName(String name) {
        for (Station station : stations()) {
            if (station.getName().equals(name)) {
                return station;
            }
        }
        return null;
    }

    public static void printStationList() {
        if (stations.size() == 0) {
            System.out.println("존재하는 역이 없습니다.\n");
            return;
        }
        for (Station station : stations) {
            System.out.println("[ INFO ] " + station.getName());
        }
        System.out.println();
    }

}
