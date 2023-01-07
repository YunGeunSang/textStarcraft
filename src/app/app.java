package app;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        // 1. '나의 유닛'과 '상대 유닛'의 정보 입력
        // 2. '입력된 정보'는 '출력'하여 확인
        // 3. '공격 기능' 추가
        // 4. 체력이 0 이하로 떨어지면 '게임 종료'

        // 필요한 정보, 유닛Class(체력, 공격력, 방어력, 이름)

        Scanner scanner = new Scanner(System.in);
        String name;
        int atk;
        int def;
        int health;



        System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 :");
        name = scanner.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 : (Ex 50)");
        atk = Integer.parseInt(scanner.nextLine());
        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 : (Ex 1)");
        def = Integer.parseInt(scanner.nextLine());
        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 : (Ex 100)");
        health = Integer.parseInt(scanner.nextLine());

        Unit myUnit = new Unit(name, atk, def, health);
        //insert(myUnit);

        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.\n", myUnit.getName());
        System.out.printf("[공격력] : %d\n", myUnit.getAtk());
        System.out.printf("[방어력] : %d\n", myUnit.getDef());
        System.out.printf("[체력] : %d\n", myUnit.getHealth());
        System.out.println("=".repeat(30));

        System.out.println("[안내] 상대 유닛 정보를 입력해 주세요.");
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 :");
        name = scanner.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 : (Ex 50)");
        atk = Integer.parseInt(scanner.nextLine());
        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 : (Ex 1)");
        def = Integer.parseInt(scanner.nextLine());
        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 : (Ex 100)");
        health = Integer.parseInt(scanner.nextLine());
        Unit enermyUnit = new Unit(name, atk, def, health);


        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.\n", enermyUnit.getName());
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.\n", enermyUnit.getName());
        System.out.printf("[공격력] : %d\n", enermyUnit.getAtk());
        System.out.printf("[방어력] : %d\n", enermyUnit.getDef());
        System.out.printf("[체력] : %d\n", enermyUnit.getHealth());
        System.out.println("=".repeat(30));

        while(enermyUnit.getHealth() > 0){
            int nowHealth = enermyUnit.getHealth() - myUnit.getAtk();
            System.out.println("-".repeat(30));
            System.out.printf("[안내] %s 유닛이 [공격] 하였습니다.\n", myUnit.getName());
            if (nowHealth < 0){
                System.out.printf("[안내] 상대 유닛의 남은 [체력]은 0 입니다.\n");
                System.out.println("=".repeat(30));
                break;
            }
            System.out.printf("[안내] 상대 유닛의 남은 [체력]은 %d입니다.\n", nowHealth);
            enermyUnit.setHealth(nowHealth);
        }

        System.out.println("-".repeat(30));
        System.out.println("[안내] 더 이상 공격할 수 없습니다.");
        System.out.println();
        System.out.println("[안내] 상대 유닛이 제거되었습니다.");



    }



    public static void insert(Unit unit){
        Scanner scanner = new Scanner(System.in);
        String name;
        int atk;
        int def;
        int health;

        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 :");
        name = scanner.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 : (Ex 50)");
        atk = Integer.parseInt(scanner.nextLine());
        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 : (Ex 1)");
        def = Integer.parseInt(scanner.nextLine());
        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 : (Ex 100)");
        health = Integer.parseInt(scanner.nextLine());

        //Unit unit = new Unit(name, atk, def, health);
    }

    public static void unitInfo(){

    }
}



