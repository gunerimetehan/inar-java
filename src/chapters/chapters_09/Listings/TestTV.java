package chapters.chapters_09.Listings;

public class TestTV {
    public static void main(String[] args) {
        TV tv1=new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(5);

        TV tv2=new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " +tv1.channel + " and the volume is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " +tv2.channel + " and the volume is " +tv2.volumeLevel );
    }
}
