package self_practice.lambda.prettyPrintOrangeTask;

import self_practice.lambda.prettyPrintOrangeTask.Orange;

@FunctionalInterface
public interface OrangeFormatter {
    String accept(Orange orange);
}
