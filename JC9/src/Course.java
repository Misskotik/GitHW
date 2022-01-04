interface CourseInt {
//   public  String getForeignLanguage;
//   public  String getMath;
//   public String getLogics;
//   public String getPhysics;
//   public String getMusic;
}
class Course implements CourseInt {
    private String foreignLanguage;
    private String math;
    private String logics;
    private String physics;
    private String music;

    public String getForeignLanguage() {
        return foreignLanguage;
    }
    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }
    public String getMath() {
        return math;
    }
    public void setMath(String math) {
        this.math = math;
    }
    public String getLogics() {
        return logics;
    }
    public void setLogics(String logics) {
        this.logics = logics;
    }
    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }
    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
    public Course(String foreignLanguage, String math, String logics, String physics, String music) {
        this.foreignLanguage = foreignLanguage;
        this.math = math;
        this.logics = logics;
        this.physics = physics;
        this.music = music;
    }
}
