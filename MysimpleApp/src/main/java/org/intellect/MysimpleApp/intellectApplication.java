package org.intellect.MysimpleApp;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class intellectApplication extends Application<intellectConfiguration> {

    public static void main(final String[] args) throws Exception {
        new intellectApplication().run(args);
    }

    @Override
    public String getName() {
        return "intellect";
    }

    @Override
    public void initialize(final Bootstrap<intellectConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final intellectConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
