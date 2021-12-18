package JC1;
public class Team {
    private String teamName; //Team name
    private String gender; // gender of team member
    private String name; // name of team member
    private int age; // age of team member
    protected int power; // power of each team member to pass the obstacles!
                        // if power >= wall+swim+run, Course is passed!
                       //can be done with Random! (пока решила не добавлять Random чтобы не запутаться)
//    Team [] team;


    public Team(String name, int age, String gender, String teamName, int power) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.teamName = teamName;
        this.power = power;
    }


// getting Info about the whole Team:
    String getFullInfo() {
        return this.name + " " + this.age + " " + this.gender + ";";
    }

    public int getPower() {
        return power;
    }
// Method that shows Info about the whole Team:
    public static void getAllTeam (Team [] team) {
        System.out.println("Dream team ");
        for (int i = 0; i < team.length; i++)
            System.out.println((i + 1) + ") " + team[i].getFullInfo());

    }
}




