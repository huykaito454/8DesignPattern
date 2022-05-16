package Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements IYoutubeSubscriber {
    private String name;

    public String getName() {
        return name;
    }
    private List<Video> videos = new ArrayList<>();
    private List<Subscriber> subscribers = new ArrayList<>();

    public YoutubeChannel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        if(!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
        }
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        if(subscribers.contains(subscriber)){
            subscribers.remove(subscriber);
        }
    }

    @Override
    public void notifyAllSubscriber() {
        for (Subscriber subscriber : subscribers){
            subscriber.notify(this);
        }
    }

    public void uploadVideo(String title, String url){
        Video video = new Video(title,url);
        videos.add(video);
        this.notifyAllSubscriber();
    }

    public Video getNewVideo(){
        return videos.get(videos.size() - 1);
    }
}
