package JC1;

public class Course {
    private int wall; // obstacle 'wall'
    private int swim; // obstacle 'swim'
    private int run; // obstacle 'run'

    public Course(int wall, int swim, int run) {
        this.wall = wall;
        this.swim = swim;
        this.run = run;
    }

    public int getWall() {
        return wall;
    }

    public int getSwim() {
        return swim;
    }

    public int getRun() {
        return run;
    }

//    public int getCourse() {
//        return this.wall + this.swim + this.run;
//    }
// хотела использовать в Main в методе getWinnerteam -  if (team[i].power >= c.getCourse)
// но(!) int getCourse() не статический метод, а getWinnerteam статический (((


    // Method invites the team to pass the Course (print in Console)
    public void doIt() {
        int cWall = getWall();
        int cSwim = getSwim();
        int cRun = getRun();
        System.out.println("Run Course:" + " Climb the wall: " + cWall + " point(s)" + ";" + "Swim the pool:  " + cSwim + " point(s);" + "Run the road: " + cRun + " point(s).");
    }

}




