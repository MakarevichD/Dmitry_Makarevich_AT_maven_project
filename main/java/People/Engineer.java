package People;

public abstract class Engineer {

    public int skill;

    public Engineer(int skill) {
        this.skill = skill;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}
