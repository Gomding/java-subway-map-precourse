package subway.menu;

import subway.domain.LineRepository;
import subway.domain.StationRepository;

import java.util.Scanner;

public class MainMenu {

    private static final String MAIN_TITLE = "## 메인 화면";
    private static final String MENU1 = "1. 역 관리";
    private static final String MENU2 = "2. 노선 관리";
    private static final String MENU3 = "3. 구간 관리";
    private static final String MENU4 = "4. 지하철 노선도 출력";
    private static final String QUIT = "Q. 종료";
    private static final String CHOICE_MESSAGE = "## 원하는 기능을 선택하세요.";

    private Scanner scanner;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        String input;
        while (true) {
            printMainMenu();
            input = scanner.nextLine();
            if (input.equals("1")) {
                new StationMenu(scanner).startStationMenu();
            }
            if (input.equals("2")) {
            }
            if (input.equals("3")) {
            }
            if (input.equals("4")) {
            }
            if (input.equals("Q")) {
                break;
            }
        }
    }

    private void printMainMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append(MAIN_TITLE).append("\n")
                .append(MENU1).append("\n")
                .append(MENU2).append("\n")
                .append(MENU3).append("\n")
                .append(MENU4).append("\n")
                .append(QUIT).append("\n\n")
                .append(CHOICE_MESSAGE);
        System.out.println(sb);
    }
}
