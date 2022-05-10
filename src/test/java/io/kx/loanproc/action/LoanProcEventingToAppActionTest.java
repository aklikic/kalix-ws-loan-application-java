package io.kx.loanproc.action;

import akka.stream.javadsl.Source;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import io.kx.loanproc.action.LoanProcEventingToAppAction;
import io.kx.loanproc.action.LoanProcEventingToAppActionTestKit;
import io.kx.loanproc.domain.LoanProcDomain;
import kalix.javasdk.testkit.ActionResult;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class LoanProcEventingToAppActionTest {

  @Test
  @Ignore("to be implemented")
  public void exampleTest() {
    LoanProcEventingToAppActionTestKit service = LoanProcEventingToAppActionTestKit.of(LoanProcEventingToAppAction::new);
    // // use the testkit to execute a command
    // SomeCommand command = SomeCommand.newBuilder()...build();
    // ActionResult<SomeResponse> result = service.someOperation(command);
    // // verify the reply
    // SomeReply reply = result.getReply();
    // assertEquals(expectedReply, reply);
  }

  @Test
  @Ignore("to be implemented")
  public void onApprovedTest() {
    LoanProcEventingToAppActionTestKit testKit = LoanProcEventingToAppActionTestKit.of(LoanProcEventingToAppAction::new);
    // ActionResult<Empty> result = testKit.onApproved(LoanProcDomain.Approved.newBuilder()...build());
  }

  @Test
  @Ignore("to be implemented")
  public void onDeclinedTest() {
    LoanProcEventingToAppActionTestKit testKit = LoanProcEventingToAppActionTestKit.of(LoanProcEventingToAppAction::new);
    // ActionResult<Empty> result = testKit.onDeclined(LoanProcDomain.Declined.newBuilder()...build());
  }

  @Test
  @Ignore("to be implemented")
  public void ignoreOtherEventsTest() {
    LoanProcEventingToAppActionTestKit testKit = LoanProcEventingToAppActionTestKit.of(LoanProcEventingToAppAction::new);
    // ActionResult<Empty> result = testKit.ignoreOtherEvents(Any.newBuilder()...build());
  }

}
