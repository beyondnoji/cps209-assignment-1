import java.util.ArrayList;

class Podcast extends AudioContent
{
    private ArrayList<String> hosts; 
    private ArrayList<Season> seasons;
    private String host;  
    private int numSeasons; 

    public static final String TYPENAME = "PODCAST"; 

    public Podcast(String title, int year, String id, String type, String audioFile, int length, String host, int numSeasons)
    {
        super(title, year, id, type, audioFile, length);
        this.host = host; 
        this.numSeasons = numSeasons; 
        hosts = new ArrayList<>();
        seasons = new ArrayList<>();  

    }

    public String getType()
    {
        return TYPENAME; 
    }

    public void printInfo() 
    {
        super.printInfo(); 
        System.out.println("Host: " + this.getHost() + "/nSeasons: " + this.getNumSeasons()); 
    }

    public void play() 
    {
        this.setAudioFile(this.getAudioFile()); 
        super.play(); 
        System.out.println(); 
    }

    public String getHost()
    {
        return this.host; 
    }

    public int getNumSeasons() 
    {
        return this.numSeasons; 
    }
}