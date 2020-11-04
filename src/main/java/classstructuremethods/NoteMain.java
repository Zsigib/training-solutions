package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Gipsz Jakab");
        note.setTopic("Az élet értelme");
        note.setText("42... vagy a Java programozás!");

        System.out.println(note.getNoteText());
    }
}
