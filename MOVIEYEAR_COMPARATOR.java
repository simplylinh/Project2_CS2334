
public class MOVIEYEAR_COMPARATOR {
	public int compare(Movie movie1, Movie movie2) 
	{
		int num = 0;
		Integer movie1Year = new Integer(0);
		Integer movie2Year = new Integer(0);
		movie1Year = Integer.getInteger(movie1.getYear());
		movie2Year = Integer.getInteger(movie2.getYear());
		num = movie1Year.compareTo(movie2Year);
		return num;
	}
}
