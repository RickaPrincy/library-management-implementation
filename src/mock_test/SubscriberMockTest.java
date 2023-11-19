package mock_test;

import model.Subscriber;
import repository.SubscriberCrudOperations;

import java.util.List;

public class SubscriberMockTest {
    private final static SubscriberCrudOperations subscriberCrudOperations = new SubscriberCrudOperations();
    public static void launch(){
        /* should return 3 subscribers */
        Utils.printList(subscriberCrudOperations.findAll());

        /* should return new subscriber with uuid id */
        System.out.println(subscriberCrudOperations.save(
            new Subscriber("", "subscriberName_4", "subscriberRef_4"))
        );

        /* should return list new subscriber with uuid id */
        Utils.printList(subscriberCrudOperations.saveAll(List.of(
            new Subscriber("", "subscriberName_5", "subscriberRef_5"),
            new Subscriber("", "subscriberName_6", "subscriberRef_6")
        )));

        /* should return the subscriber deleted*/
        System.out.println(subscriberCrudOperations.delete(new Subscriber("subscriberId_1", "", "subscriberRef_6")));
    }
}
