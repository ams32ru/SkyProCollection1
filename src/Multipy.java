import java.security.SecureRandom;
import java.util.HashSet;
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

    @Override
    public String toString() {
        return "Решите задание" + tasks;
    }
}
