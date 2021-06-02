package main;

import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.HashMap;

public class ViewController {
    private HashMap<String, Parent> viewMap;
    private Scene scene;


    public ViewController(Scene s) {
        this.viewMap = new HashMap<>();
        this.scene = s;
    }

    public void add(String name, Parent parent) {
        if (viewMap.containsKey(name)) {
            throw new RuntimeException("View is already added.");
        }

        viewMap.put(name, parent);
    }

    public void remove(String name) {
        if (viewMap.containsKey(name)) {
            throw new RuntimeException("No view to remove.");
        }
        viewMap.remove(name);
    }

    public void activate(String name) {
        if (viewMap.containsKey(name)) {
            throw new RuntimeException("View has not been added.");
        }

        scene.setRoot(viewMap.get(name));
    }
}
