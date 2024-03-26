package model;

import service.Connector;

import java.util.ArrayList;
import java.util.List;

/**
 * class Library represents the entire collection of Media that the library itself has. So it just has a list of Medium objects
 * And a populate method which is to set a new list as media.
 */
public class Library {

    private List<Medium> media;

    public Library(List<Medium> media) {
        this.media = media;
    }

    public void displayBooks() {
        // Implement method that prints all the media in the list
    }

    public void populate(List<Medium> media) {
        this.media = media;
    }

}
