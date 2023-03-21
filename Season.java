import java.util.ArrayList; 

class Season {

    private ArrayList<String> episodes; // this ArrayList consists of AudioFile strings
    private ArrayList<String> episodeTitles; 
    private ArrayList<String> epsiodeLengths; // stores episode lengths in minutes 
    
    public Season()
    {
        episodes = new ArrayList<>();
        episodeTitles = new ArrayList<>(); 
        epsiodeLengths = new ArrayList<>(); 

    }
}