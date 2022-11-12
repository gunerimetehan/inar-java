package chapters.chapters_09.Listings;

public class TV {
//Datafield
    int channel=1; //default
    int volumeLevel=1; //default
    boolean on= false; //default

    //constructer
    public TV(){
    }

    //methods

    public void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }
    public void setChannel(int newChannel){
        if (on&&newChannel>=1&&newChannel<=120){
            this.channel=newChannel;
        }
    }
    public void setVolume(int newVolumeLevel){
        if (on&&newVolumeLevel>=1&&newVolumeLevel<=7){
            this.volumeLevel=newVolumeLevel;
        }
    }
    public void channelUp(){
        if (on&&channel<120){
            channel++;
        }
    }
    public void channelDown(){
        if (on&&channel>1){
            channel--;
        }
    }
    public void volumeUp(){
        if (on&&volumeLevel<7){
            volumeLevel++;
        }
    }
    public void volumeDown(){
        if (on&&volumeLevel>1){
            volumeLevel--;
        }
    }
}
