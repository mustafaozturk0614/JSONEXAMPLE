import java.util.List;

public class Movie {

    private String title;
    private String year;
    private String director;
    private  double imdbRating;
    private List<String> images;

    public Movie() {
    }

    public Movie(String title, String year, String director, double imdbRating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.imdbRating = imdbRating;
    }

    public Movie(String title, String year, String director, double imdbRating, List<String> images) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.imdbRating = imdbRating;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("title='").append(title).append('\'');
        sb.append(", year='").append(year).append('\'');
        sb.append(", director='").append(director).append('\'');
        sb.append(", imdbRating=").append(imdbRating);
        sb.append(", images=").append(images);
        sb.append('}');
        return sb.toString();
    }
}
