package fr.mds.javadesignpattern.tps.tp1_1.utils;

public class IdHandler {
    private static IdHandler instance = null;

    public static synchronized IdHandler getInstance() {
        if (instance == null) {
            instance = new IdHandler();
        }

        return instance;
    }

    private int nextId = 1;

    public int getUniqueId() {
        if (nextId < 0) {
            throw new IllegalStateException("Out of IDs!");
        }

        int uniqueId = nextId;
        nextId++;

        return uniqueId;
    }
}
