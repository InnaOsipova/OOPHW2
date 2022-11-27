package ru.gd.oseminar.data;

public class Ticher extends User{
    private long ticherId;

    public Ticher(String firsNname, String lastName, String patronymic, long ticherId) {
        super(firsNname, lastName, patronymic);
        this.ticherId = ticherId;
    }

    public long getTicherId() {
        return ticherId;
    }

    public void setTicherId(long ticherId) {
        this.ticherId = ticherId;
    }

    @Override
    public String toString() {
        return "Ticher{" +
                "ticherId=" + ticherId +
                '}'+ super.toString();
    }
}
