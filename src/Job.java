public class Job implements Comparable<Job> {

    private int prio;
    private String desc;

    public Job(int prio, String desc) {
        this.prio = prio;
        this.desc = desc;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public int compareTo(Job o) {
        return -Integer.compare(this.prio, o.getPrio());
    }

    @Override
    public String toString() {
        return "Job{" +
                "priorytet=" + prio +
                ", opis='" + desc + '\'' +
                '}';
    }
}
