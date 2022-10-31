import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Multipy {
    private final Set<Task> tasks = new HashSet<>();

    public Multipy() {
        Random random = new SecureRandom();
        while (tasks.size() < 15) {
            tasks.add(new Task(random.nextInt((9 - 2) + 1) + 2,
                    random.nextInt((9 - 2) + 1) + 2));
        }
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Решите задание" + tasks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multipy multipy = (Multipy) o;
        return Objects.equals(tasks, multipy.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks);
    }
}

