package Task_28_01_2026.Doubly_LinkedList.MovieManagementSystem;

class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode prev, next;

    MovieNode(String t, String d, int y, double r) {
        title = t; director = d; year = y; rating = r;
    }
}
