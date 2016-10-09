
public class MusicAlbum {

	/*
	 * 2. Implement Class MusicAlbum which encapsulated a music Album, each
	 * album has a string variable albumTitle and a String variable singer
	 * representing the name of singer, double variable price representing the
	 * price of album, objects of this class are Initialized using all of its
	 * instance variables. The class has accessor methods for all its Variables
	 * and a mutator method for price.
	 */

	private String title;
	private String nameofsinger;
	private double price;

	public MusicAlbum(){}
	
	
	public MusicAlbum(String t, String n ){
		this.title= t;
		this.nameofsinger=n;
	//	this.price=p;
	}
	
	// getter and setter method

	public String gettitle() {
		return title;
	}

	public String getnameofsinger() {
		return nameofsinger;
	}

	public double getprice() {
		return price;
	}

	public void setprice(double pricema) {
		this.price = pricema;
	}
	
	public static void main(String[] args) {
		//Object lp;
		// TODO Auto-generated method stub
		//MusicAlbum title = new MusicAlbum();
		//title.MusicAlbum(lp);
		
		MusicAlbum m = new MusicAlbum("linkin", "park");
		System.out.println(m.getprice());
		
		MusicAlbum m2 = new MusicAlbum();
		m2.setprice(900);
		System.out.println(m2.getprice());
	}

}
