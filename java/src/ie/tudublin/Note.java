package ie.tudublin;

public class Note {
    private char note;
    private int dur;

    @Override
    public String toString() {
        return "Note [dur=" + dur + ", note=" + note + "]";
    }

    public Note(char n, int d){
        note = n;
        dur = d;
    }

    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }
}
