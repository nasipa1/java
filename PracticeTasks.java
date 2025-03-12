import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

class Task1 {
    public <T> void mergeLists(List<T> l1, List<T> l2, List<T> result) {
        int i = 0;
        while (i < l1.size() || i < l2.size()) {
            if (i < l1.size()) {
                result.add(l1.get(i));
            }
            if (i < l2.size()) {
                result.add(l2.get(i));
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Task1 task = new Task1();

        List<String> list1 = new ArrayList<>();
        list1.add("lalala");
        list1.add("lololo");
        list1.add("lelele");

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");

        List<String> result = new ArrayList<>();

        task.mergeLists(list1, list2, result);

        System.out.println(result);
    }
}

class Task2 {
    public <K, V> void printMap(Map<K, V> map) {
        for (K key : map.keySet()) {
            V value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public static void main(String[] args) {
        Task2 task = new Task2();

        Map<Integer, Boolean> m = new HashMap<>();
        m.put(1, true);
        m.put(2, false);

        task.printMap(m);

        Map<String, Double> m2 = new HashMap<>();
        m2.put("pi", 3.14);

        task.printMap(m2);
    }
}

class Task {
    private String taskName;
    private int priority;
    private int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public int getDuration() {
        return duration;
    }

    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}

class TaskScheduler {
    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Task> delayed = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void processTask() {
        if (tasks.size() == 0) {
            System.out.println("No priority tasks to process.");
            return;
        }

        Task bestTask = tasks.get(0);
        for (int i = 0; i < tasks.size(); i++) {
            Task currentTask = tasks.get(i);
            if (currentTask.getPriority() > bestTask.getPriority()) {
                bestTask = currentTask;
            }
            else if (currentTask.getPriority() == bestTask.getPriority() &&
                    currentTask.getDuration() < bestTask.getDuration()) {
                bestTask = currentTask;
            }
        }
        tasks.remove(bestTask);
        System.out.println("Processing Task: " + bestTask);
    }

    public void delayTask(String taskName) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getTaskName().equals(taskName)) {
                tasks.remove(i);
                delayed.add(task);
                System.out.println("Delaying Task: " + taskName);
                return;
            }
        }
        System.out.println("Task not found: " + taskName);
    }

    public void displayTasks() {
        System.out.println("Scheduled Tasks (sorted by priority):");
        if (tasks.size() == 0) {
            System.out.println("(No priority tasks)");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void displayPendingTasks() {
        System.out.println("Pending Tasks (FIFO Order):");
        if (delayed.size() == 0) {
            System.out.println("(No pending tasks)");
        } else {

            for (int i = 0; i < delayed.size(); i++) {
                Task task = delayed.get(i);
                System.out.println((i + 1) + ". " + task.getTaskName() +
                        " (Priority: " + task.getPriority() +
                        ", Duration: " + task.getDuration() + " mins)");
            }
        }
    }

    public void processPendingTask() {
        if (delayed.size() > 0) {
            Task task = delayed.get(0);
            delayed.remove(0);
            System.out.println("Processing Task: " + task);
        } else {
            System.out.println("No pending tasks to process.");
        }
    }
}

class Task3 {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(new Task("Code Review", 3, 20));
        scheduler.addTask(new Task("System Update", 5, 45));
        scheduler.addTask(new Task("Database Backup", 2, 30));
        scheduler.addTask(new Task("Deploy New Feature", 5, 50));
        scheduler.addTask(new Task("Bug Fixing", 4, 25));

        System.out.println("Tasks Added:");
        scheduler.displayTasks();

        scheduler.processTask();

        scheduler.delayTask("Code Review");

        System.out.println("\nScheduled Tasks (sorted by priority):");
        scheduler.displayTasks();
        scheduler.displayPendingTasks();

        scheduler.delayTask("Database Backup");

        System.out.println("\nScheduled Tasks (sorted by priority):");
        scheduler.displayTasks();
        scheduler.displayPendingTasks();

        scheduler.processTask();
        System.out.println("\nScheduled Tasks (sorted by priority):");
        scheduler.displayTasks();
        scheduler.displayPendingTasks();

        scheduler.processTask();
        System.out.println("\nScheduled Tasks (sorted by priority):");
        scheduler.displayTasks();
        scheduler.displayPendingTasks();

        scheduler.processPendingTask();
        System.out.println("\nScheduled Tasks (sorted by priority):");
        scheduler.displayTasks();
        scheduler.displayPendingTasks();

        scheduler.processPendingTask();
        System.out.println("\nScheduled Tasks (sorted by priority):");
        scheduler.displayTasks();
        scheduler.displayPendingTasks();
    }
}