package net.ddns.softux.hey.test;

import net.ddns.softux.hey.FirebaseModule;
import net.ddns.softux.hey.HeyApp;
import net.ddns.softux.hey.HeyComponent;
import net.ddns.softux.hey.TasksModule;

import it.cosenonjaviste.daggermock.DaggerMockRule;

/**
 * Created by juan on 5/06/16.
 */

public class HeyDaggerMockRule extends DaggerMockRule<HeyComponent> {
    public HeyDaggerMockRule(final HeyApp heyApp) {
        super(HeyComponent.class, new TasksModule(heyApp), new FirebaseModule());
        set(new ComponentSetter<HeyComponent>() {
            @Override
            public void setComponent(HeyComponent heyComponent) {
                heyApp.setHeyComponent(heyComponent);
            }
        });
    }
}
