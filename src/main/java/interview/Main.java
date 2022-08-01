package interview;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    // 1. You have list of meeting ids. You need to verify that response of getAllMeetings
    // contains Meeting objects with given ids.
    List<String> expectedMeetingIds = List.of("1", "2", "3");

    // 2. You need to verify that all participants from every meeting in getAllMeetings response
    // are from the same account (let's say that it's forbidden to participate in meetings if host
    // have different account).
  }

  // Returns all meetings in system
  private static List<Meeting> getAllMeetings() {
    Participant mike = new Participant("42", "1");
    Participant bob = new Participant("42", "2");
    Participant peter = new Participant("77", "1");
    return List.of(
        new Meeting("1", "Daily", List.of(mike, bob)),
        new Meeting("2", "Nightly", List.of(mike, bob)),
        new Meeting("3", "Important meeting", List.of(mike, bob)),
        new Meeting("4", "Lonely meeting", List.of(peter))
    );
  }
}

class Meeting {
  String id;
  String displayName;
  List<Participant> participants;

  public Meeting() {
  }

  public Meeting(String id, String displayName, List<Participant> participants) {
    this.id = id;
    this.displayName = displayName;
    this.participants = participants;
  }
}

class Participant {
  String accountId;
  String extensionId;

  public Participant() {
  }

  public Participant(String accountId, String extensionId) {
    this.accountId = accountId;
    this.extensionId = extensionId;
  }
}
