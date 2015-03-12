package org.jenkinsci.plugins.queuefix;

import hudson.Extension;
import hudson.model.Queue;
import hudson.model.RootAction;
import jenkins.model.Jenkins;

@Extension
public class QueueFix implements RootAction {

    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getUrlName() {
        return "queuefix";
    }

    public Queue.Item getItem(int idx) {
        return Jenkins.getInstance().getQueue().getItem(idx);
    }
}

