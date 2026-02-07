package Task_06_02_2026.Regex.List;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ListManagerTest {
    ListManager manager = new ListManager();
    @Test
    void testAddAndRemove() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        assertEquals(1, manager.getSize(list));
        manager.removeElement(list, 10);
        assertEquals(0, manager.getSize(list));
    }
}
