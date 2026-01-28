package Task_28_01_2026.Doubly_LinkedList.MovieManagementSystem;

class MovieList {
    MovieNode head, tail;


    void addMovie(String t, String d, int y, double r) {
        MovieNode n = new MovieNode(t,d,y,r);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }


    void removeMovie(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp == head) head = head.next;
                if (temp == tail) tail = tail.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        for (MovieNode t = head; t != null; t = t.next)
            if (t.title.equals(title)) t.rating = newRating;
    }


    void displayForward() {
        for (MovieNode t = head; t != null; t = t.next)
            System.out.println(t.title + " " + t.rating);
    }

    void displayReverse() {
        for (MovieNode t = tail; t != null; t = t.prev)
            System.out.println(t.title + " " + t.rating);
    }
}
