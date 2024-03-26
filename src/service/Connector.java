package service;

import model.Medium;

/**
 * Basic interface for implementing a class that will be used as a Connector. That class will have to implement the three methods below
 */
public interface Connector {
    void connect();
    void removeFromLibrary(String title);
    void addToLibrary(Medium medium);
}
