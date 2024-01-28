//Ba Ba Black Sheep
package eecs1021;
import jm.music.data.*;
import jm.util.Play;
import jm.constants.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Do you want to alter the first note of the song? (Yes or No)");
        String choice = sc2.nextLine();

        if(choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y")){
            noteAltered();
        }
        else{
            noNoteAltered();
        }
    }

    public static void noNoteAltered(){
        System.out.println("Ba Ba Black Sheep is going to play.");
        Play.midi(new Note(Pitches.C3, RhythmValues.EIGHTH_NOTE)); // C3 for 1/8 note
        Play.midi(new Note(Pitches.C3, RhythmValues.EIGHTH_NOTE)); //  C3 for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  G3 for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  G3 for 1/8 note
        Play.midi(new Note(Pitches.A3, RhythmValues.THIRTYSECOND_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.A4, RhythmValues.THIRTYSECOND_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.A3, RhythmValues.THIRTYSECOND_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.A4, RhythmValues.THIRTYSECOND_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.F3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.F3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.E3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.E3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.D3, RhythmValues.EIGHTH_NOTE)); //  for 1/8hhh note
        Play.midi(new Note(Pitches.D3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.C3, RhythmValues.EIGHTH_NOTE)); //  for 1hh/8 note
        Play.midi(new Note(Pitches.C3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.SIXTEENTH_NOTE)); //  for 1/8 note
        System.out.println("Song finished!");
    }
    public static void noteAltered(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose a note between 40-100\n");
        int firstNote = sc.nextInt();

        System.out.println("Please choose how long you would like the note to last (between 0.5-2.0\n");
        float noteLength = sc.nextFloat();

        System.out.println("The first note is "+ firstNote + " and the duration is " + noteLength);

        System.out.println("Ba Ba Black Sheep is going to play.");

        Play.midi(new Note(firstNote, noteLength));
        Play.midi(new Note(Pitches.C3, RhythmValues.EIGHTH_NOTE)); //  C3 for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  G3 for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  G3 for 1/8 note
        Play.midi(new Note(Pitches.A3, RhythmValues.THIRTYSECOND_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.A4, RhythmValues.THIRTYSECOND_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.A3, RhythmValues.THIRTYSECOND_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.A4, RhythmValues.THIRTYSECOND_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.F3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.F3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.E3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.E3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.D3, RhythmValues.EIGHTH_NOTE)); //  for 1/8hhh note
        Play.midi(new Note(Pitches.D3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.C3, RhythmValues.EIGHTH_NOTE)); //  for 1hh/8 note
        Play.midi(new Note(Pitches.C3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.EIGHTH_NOTE)); //  for 1/8 note
        Play.midi(new Note(Pitches.G3, RhythmValues.SIXTEENTH_NOTE)); //  for 1/8 note
        System.out.println("Song finished!");

        sc.close();
    }
}
