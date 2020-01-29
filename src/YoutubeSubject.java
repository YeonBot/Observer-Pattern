import java.util.ArrayList;

public class YoutubeSubject implements Subject {
  private ArrayList<Observer> observers;
  private String title;
  private String body;

  public YoutubeSubject() {
    this.observers = new ArrayList<>();
  }

  //observers리스트에 추가
  @Override
  public void add(Observer observer) {
    observers.add(observer);
  }

  //observers리스트 삭제
  @Override
  public void delete(Observer observer) {
    int index = observers.indexOf(observer);
    observers.remove(index);
  }

  // observers리스트에 있는 모든 구독자들의 update method 호출.
  @Override
  public void notifyObserver() {
    for( Observer observer:observers){
      observer.update(this.title,this.body);
    }
  }

  // get set 메서드
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
}
