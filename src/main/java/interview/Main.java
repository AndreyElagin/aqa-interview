package interview;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    // 1. Verify that your meetings is present in getAllMeetings response.
    var expectedMeetings = List.of(new Meeting());

    // 2. You need to verify that all participants from every meeting in getAllMeetings response
    // are from the same account (let's say that it's forbidden to participate in meetings if host
    // have different account).
  }

  private static List<Meeting> getAllMeetings() {
    return List.of();
  }
}

class Meeting {
  String id;
  String displayName;
  List<Participant> participants;
}

class Participant {
  String accountId;
  String extensionId;
}
