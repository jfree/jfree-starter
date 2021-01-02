package org.jfree.starter;

/**
 * Starter application.
 */
public class App {
    
    /**
     * Creates a new instance of the most awesome app.
     */
    public App() {
    }
    
    void run() {
        System.out.println("Hello World!");        
    }

    /**
     * Entry point for the app.
     * 
     * @param args  these are ignored here. 
     */
    public static void main(String[] args) {
        App app = new App();
        app.run();
        System.exit(0);
    }
    
}
