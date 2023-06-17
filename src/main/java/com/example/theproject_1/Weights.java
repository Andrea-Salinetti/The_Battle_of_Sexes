package com.example.theproject_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Weights {

    private class Entry {
        double accumulatedWeight;
        String name;
    }

    private List<Entry> entries = new ArrayList<>();
    private double accumulatedWeight;
    private Random rand = new Random();

    public void addEntry(String object, double weight) {
        accumulatedWeight += weight;
        Entry e = new Entry();
        e.name = object;
        e.accumulatedWeight = accumulatedWeight;
        entries.add(e);
    }

    public String getRandom() {
        double r = rand.nextDouble() * accumulatedWeight;

        for (Entry entry: entries) {
            if (entry.accumulatedWeight >= r) {
                return entry.name;
            }
        }
        return null; //should only happen when there are no entries
    }
}