public class Main {

  public static void main(String[] args) {
    //생활코딩 유튜브 채널 생성
    YoutubeSubject youtubeSubject = new YoutubeSubject();

    //유저 철수 유튜브 가입
    Observer observer1 = new YoutubeUser("철수");
    //유저 영희 유튜브 가입
    Observer observer2 = new YoutubeUser("영희");

    //철수 유튜브 구독 시작
    youtubeSubject.add(observer1);
    //영희 유튜브 구독시작
    youtubeSubject.add(observer2);

    //생황 코딩 유튜브 라이브 방송 시작
    youtubeSubject.setTitle("생활코딩 실시간 스트리밍 시작");
    youtubeSubject.setBody("코딩야학 7기 라이브 시작합니다.");
    youtubeSubject.notifyObserver();

    //철수 생활코딩 구독 취소
    youtubeSubject.delete(observer1);

    //생황 코딩 유튜브 라이브 방송 시작
    youtubeSubject.setTitle("생활코딩 실시간 스트리밍 시작");
    youtubeSubject.setBody("개발자가 되기 위한 Q&A");
    youtubeSubject.notifyObserver();

  }
}
