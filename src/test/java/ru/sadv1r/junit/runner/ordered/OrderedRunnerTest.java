package ru.sadv1r.junit.runner.ordered;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderedRunnerTest {
    @Test
    public void computeTestMethods() throws InitializationError {
        final List<FrameworkMethod> frameworkMethods = new OrderedRunner(Example.class).computeTestMethods();

        final ArrayList<String> strings = Lists.newArrayList(
                "needToBeBeforeFirst",
                "justZero",
                "needToBeFirst",
                "needToBeSecond",
                "needToBeThird",
                "needToBeAfterAll",
                "withoutOrder",
                "withoutOrderPairOne",
                "withoutOrderPairTwo"
        );

        assertThat(frameworkMethods).extracting(FrameworkMethod::getName).isEqualTo(strings);
    }
}