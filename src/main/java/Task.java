public class Task {
    private Boolean isComplete = false;
    private String description;

    /**
     * Sets the description of the task
     * 
     * @param desc Description of the task
     */
    public Task(String desc) {
        this.description = desc;
    }

    /**
     * Flips the value isComplete
     */
    public void toggleComplete() {
        isComplete = !isComplete;
    }

    public boolean isDone() {
        return isComplete;
    }

    @Override
    public String toString() {
        String marker = isComplete ? "[X] " : "[ ] ";
        return marker + description;
    }
}
