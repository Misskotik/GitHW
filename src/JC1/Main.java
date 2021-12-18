package JC1;

public class Main {


    public static void main(String[] args) {


        Team[] team = new Team[4];
        team[0] = new Team("Victoria", 30, "Female", "Dream", 6);
        team[1] = new Team("Alexa", 31, "Female", "Dream", 3);
        team[2] = new Team("Victor", 29, "Male", "Dream", 4);
        team[3] = new Team("Anton", 37, "Male", "Dream", 5);


        Course c = new Course(1, 2, 3);

//        c.getCourse();

        Team.getAllTeam(team);
        c.doIt();
        System.out.println("***********************");

        getWinnerTeam(team);


    }

    public static void getWinnerTeam(Team[] team) {
        for (int i = 0; i < team.length; i++) {
            if (team[i].power >= 6) {
                System.out.println("The winner is ");
                System.out.println(team[i].getFullInfo());
            }
        }
    }
}


























