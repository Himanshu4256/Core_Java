package Learning_Java11.CoparableVsComparator;

public class Products implements  Comparable<Products>{
    private int pId;
    private String name;
    private String title;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Products{" +
                "pId=" + pId +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Products o) {
        return this.pId-o.pId;
    }


    public Products(int pId, String name, String title) {
        this.pId = pId;
        this.name = name;
        this.title = title;
    }
}
