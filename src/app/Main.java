package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declare the variable input
        int input;

        // Instantiate the HomeTheaterFacade and it's components
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);

        // Instantiate the scanner used to get the user input
        Scanner console = new Scanner(System.in);

        System.out.println("In the homeTheater you have three options: ");
        System.out.println("1. Press 1 to play a Movie");
        System.out.println("2. Press 2 to Listen to music");
        System.out.println("3. Press 3 to Listen to the radio");
        input = console.nextInt();

        if (input == 1) {
            homeTheater.watchMovie("Raiders of the Lost Ark");
            homeTheater.endMovie();
        } else if (input == 2) {
            homeTheater.listenToMusic("Andries' greatest dance tracks");
            homeTheater.endMusic();
        } else if (input == 3) {
            homeTheater.listenToTheRadio(101);
            homeTheater.endRadio();
        }
    }
}
