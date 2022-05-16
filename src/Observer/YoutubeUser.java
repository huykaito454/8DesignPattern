package Observer;

public class YoutubeUser implements Subscriber{
    private String name;

    public YoutubeUser(String name) {
        this.name = name;
    }
    @Override
    public void notify(YoutubeChannel youtubeChannel) {
    System.out.println( name + " nhan duoc thong bao | " + "Youtuber " + youtubeChannel.getName() +
            " tai len video : " + youtubeChannel.getNewVideo().getTitle() + " - " + youtubeChannel.getNewVideo().getUrl());
    }
}
