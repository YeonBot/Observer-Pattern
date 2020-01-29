public class YoutubeUser implements Observer{

  private String userName;
  private String title;
  private String body;

  //생성 될떄 사용자 이름을 변수로 저장
  public YoutubeUser(String userName) {
    this.userName = userName;
  }

  @Override
  public void update(String title, String body) {
    this.title = title;
    this.body = body;
    pushAlarm();
  }

  private void pushAlarm() {
    System.out.println("========================================");
    System.out.println(userName+"의 수신함");
    System.out.println(title+" : "+body);
    System.out.println("========================================");
  }


}
