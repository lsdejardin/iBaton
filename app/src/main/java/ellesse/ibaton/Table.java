package ellesse.ibaton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by lsdejardin on 06/02/15.
 */
public class Table implements Serializable {

    private final static String TAG="Table";
    private Calendar mCreationDate;
    private ArrayList<Player> mPlayerList = new ArrayList<Player>();

    public Table(){
        mCreationDate= Calendar.getInstance();
    }

    public int getPlayerCount(){
        return mPlayerList.size();
    }
    
    public void addPlayer(String name){
        Player NewPlayer=new Player(name);
        mPlayerList.add(NewPlayer);
    }



}
